package com.example.docker_compose.repository;

import com.example.docker_compose.dto.IUserOrderDTO;
import com.example.docker_compose.dto.UserOrderDTO;
import com.example.docker_compose.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<User> findUserListByProductId(@Param("productId") Long productId);

    @Query(value = "SELECT u.* FROM users u INNER JOIN orders o ON u.id = o.user_id AND o.product_id = :productId", nativeQuery = true)
    List<User> findUserListByProductIdNative(@Param("productId") Long productId);

    @Query("SELECT new com.example.docker_compose.dto.UserOrderDTO(u.username, u.email, o.price) FROM User u INNER JOIN Order o ON u.id = o.userId AND o.productId = :productId")
    List<UserOrderDTO> findUserOrderListByProductId(@Param("productId") Long productId);

    @Query(value = "SELECT u.username AS username, u.email AS email, o.price AS price FROM users u INNER JOIN orders o ON u.id = o.user_id WHERE o.product_id = :productId", nativeQuery = true)
    List<IUserOrderDTO> findUserOrdersByProductIdNative(@Param("productId") Long productId);

}