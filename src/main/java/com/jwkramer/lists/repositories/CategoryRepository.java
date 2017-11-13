package com.jwkramer.lists.repositories;

import com.jwkramer.lists.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by joekramer on Nov, 2017
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
