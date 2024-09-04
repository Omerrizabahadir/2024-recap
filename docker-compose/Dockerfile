# Temel imaj olarak resmi Java 21 imajını kullan
#FROM jelastic/maven:3.9.5-openjdk-21 AS MAVEN_BUILD: Bu satır, Maven ve OpenJDK 21 içeren bir temel Docker imajı kullanarak bir MAVEN_BUILD adında bir aşama başlatır.
#jelastic/maven:3.9.5-openjdk-21 imajı Maven ve OpenJDK içeren bir konteyner sağlar.
FROM jelastic/maven:3.9.5-openjdk-21 AS MAVEN_BUILD

#Dockerfile'ı oluşturan kişiyi belirten bir etiket.
LABEL "Author"="Ömer Rıza Bahadır"

#Projenin pom.xml dosyasını Docker imajının /build/ dizinine kopyalar.
#Bu, Maven ile projeyi derlemeden önce gerekli dosyaların imaj içine dahil edilmesini sağlar.
COPY pom.xml /build/
#Projenin kaynak kodlarını(src klasörünü) Docker imajının /build/ dizinine kopyalar.
#Bu, Maven ile projeyi derlemeden önce gerekli dosyaların imaj içine dahil edilmesini sağlar.
COPY src /build/src/

# Çalışma dizinini /build/ olarak ayarlar.Bu SAYEDE SONRAKİ KOMUTLAR BU DİZİNDE ÇALIŞACAKTIR.
WORKDIR /build/

#mvn package-->Maven kullanarak projeyi derler
#-Dmaven.test.skip=true-->parametresi, testlerin atlanmasını sağlar. Bu, derleme sürecini hızlandırır, özellikle de testler olmadan bir üretim imajı oluşturuluyorsa kullanışlıdır.
RUN mvn package -Dmaven.test.skip=true

#Daha küçük ve hafif bir OpenJDK 21 imajı kullanarak yeni bir aşama başlatır. Bu imaj, Java uygulamanızı çalıştırmak için gereken JDK'yı içerir.
FROM openjdk:21-jdk-slim

#Çalışma dizinini /app olarak ayarlar. Bu, bu aşamada çalışacak komutların /app dizininde çalışmasını sağlar.
WORKDIR /app

#Önceki MAVEN_BUILD aşamasından oluşturulan JAR dosyasını (/build/target/jpa-0.0.1-SNAPSHOT.jar)
#bu aşamanın /app/ dizinine kopyalar. Bu, Java uygulamanızın çalıştırılabilir dosyasıdır.
COPY --from=MAVEN_BUILD /build/target/docker-compose-0.0.1-SNAPSHOT.jar /app/

#Docker konteyneri çalıştırıldığında bu komutun çalıştırılmasını sağlar.
#Bu, Java uygulamanızın jpa-0.0.1-SNAPSHOT.jar dosyasını çalıştırır ve Spring Boot uygulamanızı dev profili ile başlatır.
#--spring.profiles.active=dev parametresi, Spring Boot uygulamanızın dev profilinde çalışmasını sağlar, yani uygulamanızın konfigürasyonu bu profile göre ayarlanır.
ENTRYPOINT ["java", "-jar", "docker-compose-0.0.1-SNAPSHOT.jar","--spring.profiles.active=dev"]
