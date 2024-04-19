package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Registra como um componente do Spring, permitindo ser injetado automaticamente com o Autowired
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll () {
        return repository.findAll();
    }

    public Category findById (Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }


}
