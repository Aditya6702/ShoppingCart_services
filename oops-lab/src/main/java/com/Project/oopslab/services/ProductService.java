package com.Project.oopslab.services;
import com.Project.oopslab.dto.ProductResponse;
import com.Project.oopslab.model.product;
import com.Project.oopslab.dto.Productrequest;
import com.Project.oopslab.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.Project.oopslab.model.product.*;

@RequiredArgsConstructor
@Service
@Slf4j

public class ProductService {
    private final ProductRepository productRepository;
    public void createproduct(Productrequest productrequest){
    product Product = builder()
            .name(productrequest.getName())
            .description(productrequest.getDescription())
            .price(productrequest.getPrice())
            .build();
    productRepository.save(Product);
    log.info("product {} is saved", Product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<product> Products = productRepository.findAll();
    return Products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(product Product) {
        return ProductResponse.builder()
                .id(Product.getId())
                .name(Product.getName())
                .description(Product.getDescription())
                .price(Product.getPrice())
                .build();
    }
}
