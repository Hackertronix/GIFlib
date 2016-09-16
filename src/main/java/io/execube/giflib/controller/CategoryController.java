package io.execube.giflib.controller;

import io.execube.giflib.data.CategoryRepository;
import io.execube.giflib.data.GifRepository;
import io.execube.giflib.model.Category;
import io.execube.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Literal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Prateek Phoenix on 9/17/2016.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping(value = "/categories")
    public String listCategories(ModelMap modelMap)
    {
        List<Category> categories= categoryRepository.getAllCategories();
        modelMap.put("categories",categories);
        return "categories";
    }

    @RequestMapping(value = "/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap)
    {

        Category category= categoryRepository.findById(id);
        modelMap.put("category",category);

        List<Gif> gifs= gifRepository.findByCategoryId(id);
        modelMap.put("gifs",gifs);
        return "category";



    }

}
