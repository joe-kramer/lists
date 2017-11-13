package com.jwkramer.lists.controllers;

import com.jwkramer.lists.models.Category;
import com.jwkramer.lists.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by joekramer on Nov, 2017
 */

@RestController
@RequestMapping(path = "/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping("/save")
    public void process() {
        categoryRepository.save(new Category("Mcdonalds", new Date(Calendar.getInstance().getTimeInMillis())));
        categoryRepository.save(new Category("Jack in the box", new Date(Calendar.getInstance().getTimeInMillis())));
        categoryRepository.save(new Category("Wendys", new Date(Calendar.getInstance().getTimeInMillis())));
        categoryRepository.save(new Category("Arbys", new Date(Calendar.getInstance().getTimeInMillis())));
        categoryRepository.save(new Category("Tacobell", new Date(Calendar.getInstance().getTimeInMillis())));
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }
}
