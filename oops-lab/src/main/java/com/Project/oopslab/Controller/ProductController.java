package com.Project.oopslab.Controller;

import com.Project.oopslab.dto.ProductResponse;
import com.Project.oopslab.dto.Productrequest;
import com.Project.oopslab.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//used by the sprinng framework to indicate the class is a controller that handles htttp requests
@RequestMapping("/api/product")//it defines how the http request should be mapped
@RequiredArgsConstructor//lombok annotation
public class ProductController {

    private final ProductService productService;

    @PostMapping//used to add and update
    @ResponseStatus(HttpStatus.CREATED)//gives a http created status
    public void createProduct(@RequestBody Productrequest productrequest) {//RequestBody indicates methodf parameters should be bound to the http request body
        productService.createproduct(productrequest);
    }

    @GetMapping//used to retrive the data
    @ResponseStatus(HttpStatus.OK)//Creates ok http status
    public List<ProductResponse> getAllProducts(){
    return productService.getAllProducts();
    }
}
