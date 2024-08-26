package com.example.jpa.repository;

import com.example.jpa.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    //verilen userId'ye göre satın aldığı ürünleri dönsün.
    @Query("Select o from Order o where o.userId = :userId")
    List<Order> findOrderListByUserId(@Param("userId") Long userId);

    @Query(value = "Select * from orders o where o.user_id = :userId", nativeQuery = true)
    List<Order> findOrderListByUserIdNative(@Param("userId") Long userId);
}
