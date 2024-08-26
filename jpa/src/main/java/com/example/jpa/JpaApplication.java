package com.example.jpa;

import com.example.jpa.dto.UserOrderDto;
import com.example.jpa.dto.UserOrderInterfaceDto;
import com.example.jpa.model.Order;
import com.example.jpa.model.User;
import com.example.jpa.repository.OrderRepository;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<User> userList = userRepository.findUserListByProductId(1L);
        userList.forEach(System.out::println);


        List<UserOrderDto> userOrderDtoList = userRepository.findUserOrderDetailsByProductId(3L);
        userOrderDtoList.forEach(System.out::println);

        //UserRepository de native 1. query için
        List<User> userListNative = userRepository.findUserListByProductIdNative(2L);
        userListNative.forEach(System.out::println);

        //UserRepository de native 2. query için
        Long productId = 2L; // Örnek ürün ID'si

        List<UserOrderInterfaceDto> userOrderDtoListNative = userRepository.findUserOrderDetailsByProductIdNative(productId);

        userOrderDtoListNative.forEach(userOrderInterfaceDto -> {
            String username = userOrderInterfaceDto.getUsername();
            String email = userOrderInterfaceDto.getEmail();
            Double price = userOrderInterfaceDto.getPrice();

            System.out.printf("Username : %s, Email : %s, Price : %s%n", username, email, price);
            //ÇIKTISI-->SELECT u.username AS username, u.email AS email, o.price AS price FROM users u INNER JOIN orders o ON u.id = o.user_id WHERE o.product_id = ?
            //Username : test3, Email : test3@gmail.com, Price : 5.0
            /*
            Java'da printf metodunda kullanılan %s ve %n, format belirteçleri ve özel karakterlerdir. İşte bunların anlamları:
            %s (String Format Belirteci)
            Anlamı: %s, bir String veriyi formatlamak için kullanılır.
            Kullanımı: Bir String değişkeni veya nesnesini EKRANA YAZDIRMAK İÇİN %s kullanılır. %s ile belirtilen yer, String türündeki bir veriyi temsil eder.

            %n (Yeni Satır)
            Anlamı: %n, platform bağımsız bir yeni satır karakterini temsil eder.
            Bu, System.lineSeparator() tarafından döndürülen yeni satır karakterini kullanır.
            Kullanımı: ÇIKTIYA YENİ BİR SATIR EKLEMEK İÇİN %n kullanılır.
            Bu, kodun farklı platformlarda (Windows, Linux, Mac) doğru bir şekilde yeni satır karakteri eklemesini sağlar.
             */
        });

    }

    private void userSave() {
        User user = new User();
        user.setCountry("TR");
        user.setEmail("test@gmail.com");
        user.setUsername("test1");

        User user2 = new User();
        user2.setCountry("TR");
        user2.setEmail("test2@gmail.com");
        user2.setUsername("test2");

        User user3 = new User();
        user3.setCountry("TR");
        user3.setEmail("test3@gmail.com");
        user3.setUsername("test3");

        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    private void orderSave() {
        Order order = new Order();
        order.setPrice(3D);
        order.setProductId(1L);
        order.setUserId(7L);

        Order order2 = new Order();
        order2.setPrice(3D);
        order2.setProductId(2L);
        order2.setUserId(7L);


        Order order3 = new Order();
        order3.setPrice(3D);
        order3.setProductId(3L);
        order3.setUserId(7L);

        Order order4 = new Order();
        order4.setPrice(3D);
        order4.setProductId(3L);
        order4.setUserId(8L);

        Order order5 = new Order();
        order5.setPrice(3D);
        order5.setProductId(2L);
        order5.setUserId(9L);

        orderRepository.save(order);
        orderRepository.save(order2);
        orderRepository.save(order3);
        orderRepository.save(order4);
        orderRepository.save(order5);
    }


}
