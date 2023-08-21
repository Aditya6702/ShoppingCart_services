package com.Project.orderservice.dto;

import com.Project.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    //private List<OrderLineItemsDto> orderLineItemsDtoList;
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
