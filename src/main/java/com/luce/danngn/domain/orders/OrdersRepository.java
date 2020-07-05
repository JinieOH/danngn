package com.luce.danngn.domain.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    @Query("SELECT ord FROM Orders ord ORDER BY ord.seq DESC")
    List<Orders> findAllDesc();
}
