package com.luce.danngn.web;

import com.luce.danngn.dto.OrdersListResponseDto;
import com.luce.danngn.dto.OrdersResponseDto;
import com.luce.danngn.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrdersApiController {

    private final OrdersService ordersService;

    @GetMapping("/api/v1/orders/{id}")
    public OrdersResponseDto findById(@PathVariable Long id) {
        return ordersService.findById(id);
    }

    @GetMapping("/api/v1/orders/list")
    public List<OrdersListResponseDto> findAllDesc() {
        return ordersService.findAllDesc();
    }
}
