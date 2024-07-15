package com.wanncode.bookingmicroservice.repository;

import com.wanncode.bookingmicroservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
