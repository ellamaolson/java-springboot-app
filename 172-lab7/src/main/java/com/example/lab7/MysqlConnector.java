package com.example.lab7;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface MysqlConnector extends CrudRepository<Student, Integer> {

}
