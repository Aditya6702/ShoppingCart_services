package com.Project.orderservice.Repository;

import com.Project.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
//this interface extends the sql interface from sprinng boot
public interface OrderRepository extends JpaRepository<Order, Long> {
}
