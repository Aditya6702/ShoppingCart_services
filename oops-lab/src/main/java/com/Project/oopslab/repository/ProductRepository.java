package com.Project.oopslab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Project.oopslab.model.product;

public interface ProductRepository extends MongoRepository<product,String> {
}
