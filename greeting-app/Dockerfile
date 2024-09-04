 # Maven aşaması
 FROM jelastic/maven:3.9.5-openjdk-21 AS MAVEN_BUILD

 # Maven ve uygulama kaynak kodlarını kopyala
 COPY pom.xml /build/
 COPY src /build/src/

 # Çalışma dizinini ayarla
 WORKDIR /build/

 # Maven ile uygulamayı derle
 RUN mvn package

 # Final aşaması
 FROM openjdk:21-jdk-slim

 # Çalışma dizinini ayarla
 WORKDIR /app

 # Maven aşamasından oluşturulan jar dosyasını kopyala
 COPY --from=MAVEN_BUILD /build/target/greeting-app-0.0.1-SNAPSHOT.jar /app/

 # Uygulamanın çalıştırılma komutunu ayarla
 ENTRYPOINT ["java", "-jar", "greeting-app-0.0.1-SNAPSHOT.jar"]
