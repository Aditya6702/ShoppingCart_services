package com.Project.oopslab.Controller;

import com.Project.oopslab.dto.ProductResponse;
import com.Project.oopslab.dto.Productrequest;
import com.Project.oopslab.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Productrequest productrequest) {
        productService.createproduct(productrequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
    return productService.getAllProducts();
    }
}
