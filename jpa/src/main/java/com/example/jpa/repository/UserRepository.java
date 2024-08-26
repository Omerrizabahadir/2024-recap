package com.example.jpa.repository;

import com.example.jpa.dto.UserOrderDto;
import com.example.jpa.dto.UserOrderInterfaceDto;
import com.example.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    //productId 'si belli olanı hangi user'lar aldı
    //JPQL (Java Persistence Query Language) İLE sorgu
    @Query("SELECT u FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<User> findUserListByProductId(@Param("productId") Long productId);
    //console çıktısı-->User(id=3, username=test3, email=test3@gmail.com, country=TR)


    //TODO: ben User tablosundan username ve email, Order tablosundan da price bilgisini dönsün istiyorum. Bunu nasıl yapabilirim? (Dto)
    //bu sorguda eğer UserOrderDto yu class olarak kullanırsan -->No converter found capable of converting from type  HATASI VERİYOR. Bu nedenle bu sorgu için ayrıca interface UserOrderInterfaceDto kullandık!!!!
    //JPQL (Java Persistence Query Language) İLE sorgu
    @Query("SELECT new com.example.jpa.dto.UserOrderDto(u.username, u.email, o.price) FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<UserOrderDto> findUserOrderDetailsByProductId(@Param("productId")Long productId);
    //console çıktısı-->
    // UserOrderDto(username=test2, email=test2@gmail.com, price=7.0)
    //UserOrderDto(username=test2, email=test2@gmail.com, price=8.0)
    //UserOrderDto(username=test1, email=test@gmail.com, price=10.0)


    //TODO: iki sql'i de native olarak tekrar yaz
    //ilk query'nin native query ile yazılışı
    @Query(value = "SELECT u.* FROM users u INNER JOIN orders o ON u.id = o.user_id WHERE o.product_id = :productId",nativeQuery = true)
    List<User> findUserListByProductIdNative(@Param("productId") Long productId);
    //console çıktısı-->  User(id=3, username=test3, email=test3@gmail.com, country=TR)


    //ikinci query'nin native query ile yazılışı
    @Query(value = "SELECT u.username AS username, u.email AS email, o.price AS price " +
            "FROM users u INNER JOIN orders o ON u.id = o.user_id " +
            "WHERE o.product_id = :productId", nativeQuery = true)
    List<UserOrderInterfaceDto> findUserOrderDetailsByProductIdNative(@Param("productId") Long productId);
    //console çıktısı-->SELECT u.username AS username, u.email AS email, o.price AS price FROM users u INNER JOIN orders o ON u.id = o.user_id AND o.product_id = ?
    //org.springframework.data.jpa.repository.query.AbstractJpaQuery$TupleConverter$TupleBackedMap@18ed8b75
}

/*
JPQL->JPQL, Java Persistence Query Language'in kısaltmasıdır.
Java'nın Persistence API'si (JPA) ile ilişkili bir sorgulama dilidir ve Java uygulamalarında veri tabanıyla etkileşimde bulunmak için kullanılır.
JPQL, SQL'e benzer bir sözdizimi kullanır ama Java nesneleri üzerinde çalışır,
veri tabanı tabloları yerine Java sınıflarıyla sorgulama yapar.
 */

/*
Native Query, ->
bir veri tabanına doğrudan SQL sorguları gönderme yöntemidir ve
Java Persistence API (JPA) ile kullanılan bir özelliktir.
JPQL'in aksine, native query'ler SQL dilinde yazılır ve veri tabanı tablosu ve sütunlarına doğrudan erişim sağlar.
Bu, veritabanının desteklediği özel SQL özelliklerine veya performans optimizasyonlarına erişim ihtiyacı olduğunda kullanışlı olabilir.


 */