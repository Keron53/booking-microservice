package com.wanncode.bookingmicroservice.dto;

import com.wanncode.bookingmicroservice.entity.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {
    private List<OrderItem> orderItems;
}
