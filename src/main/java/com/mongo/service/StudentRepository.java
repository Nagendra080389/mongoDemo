package com.mongo.service;
import com.mongo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by singhnk on 26-09-2016.
 */
public interface StudentRepository extends MongoRepository<Student, String>{

    Student findByName(String name);

}
