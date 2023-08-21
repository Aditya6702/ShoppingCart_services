package com.Project.oopslab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Project.oopslab.model.product;
//interface to extend the MongoRepository interface with funnction to run CRUD on manngoDb 
public interface ProductRepository extends MongoRepository<product,String> {
}
