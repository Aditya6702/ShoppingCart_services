package com.Project.oopslab.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Productrequest{
    private String name;
    private String description;
    private BigDecimal price;
}
