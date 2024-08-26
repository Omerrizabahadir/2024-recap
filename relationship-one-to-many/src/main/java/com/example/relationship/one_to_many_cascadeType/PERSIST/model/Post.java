package com.example.relationship.one_to_many_cascadeType.PERSIST.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "post")
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private Long userId;

    //Bir Post 'a birçok Comment gelecek
    //İlişkiyi yöneten tablonun olduğu yeri mappedBy ile gösteririz.burada ilişkiyi yöneten taraf Post tablosu tutuyor
    //Comment tablosu Post a bağlı taraf
    @OneToMany(mappedBy = "post",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER )   //mappedBy Post-> yöneten taraf, cascade.ALL -> Post ile ilişkili tüm commentlerin otomatik uygulanacağını gösterir.  fetch.EAGER->Post ile ilişkili tüm commentlerin hemen yükleneceğini belirtir
    private List<Comment> comments;   //Bir çok Comments geleceği için Listeyle çekecek

    /*
    mappedBy = "post": Bu, Comment sınıfındaki post alanının bu ilişkiyi yöneten alan olduğunu belirtir. Yani, bu ilişki Comment sınıfında tanımlanmıştır.
    mappedBy sadece ilişkiyi tanımlamak için kullanılır; veritabanında doğrudan bir etkisi yoktur.
    Ancak, mappedBy ile ilişkili olan veri tablosu, veritabanı şemasında referanslar (yabancı anahtarlar) ve ilişkiler içerir. Bu, veri tabanı düzeyin
     */

    /*
    cascade = CascadeType.ALL: Bu, Post ile İLİŞKİLİ tüm Comment nesnelerine yapılan işlemlerin (örneğin, ekleme, güncelleme, silme) otomatik olarak uygulanacağı anlamına gelir.
    Yani bir Post silindiğinde, ona bağlı tüm Comment'lar da silinir.
    Yani bir Post güncellendiğinde, ona bağlı tüm Comment'lar da güncellenir.vb..

    CascadeType.ALL, beş farklı CascadeType türünün hepsini kapsar:

    CascadeType.PERSIST: Bir nesne veritabanına eklenirken, ilişkili nesnelerin de veritabanına eklenmesini sağlar.
    CascadeType.MERGE: Bir nesne güncellenirken, ilişkili nesnelerin de güncellenmesini sağlar.
    CascadeType.REMOVE: Bir nesne silinirken, ilişkili nesnelerin de silinmesini sağlar.
    CascadeType.REFRESH: Bir nesne yeniden yüklendiğinde, ilişkili nesnelerin de güncellenmesini sağlar.
    CascadeType.DETACH: Bir nesne yönetim biriminden ayrıldığında, ilişkili nesnelerin de yönetim biriminden ayrılmasını sağlar.
     */

    /*FETCH->çekmek,getirmek
    fetch = FetchType.EAGER: Bu, Post ile İLİŞKİLİ Comment nesnelerinin HER ZAMAN HEMEN YÜKLENMESİNİ belirtir.
    Yani Post nesnesini yüklediğinizde, ilişkili Comment nesneleri de hemen yüklenir.

     */

}
