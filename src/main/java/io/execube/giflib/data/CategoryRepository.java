package io.execube.giflib.data;

import io.execube.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Prateek Phoenix on 9/17/2016.
 */
@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES= Arrays.asList(
            new Category(1,"Technology"),
            new Category(2,"People"),
            new Category(3,"Destruction")
    );


    public List<Category> getAllCategories()
    {
        return  ALL_CATEGORIES;
    }

    public Category findById(int id)
    {
        for(Category category: ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
