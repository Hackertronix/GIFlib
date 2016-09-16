package io.execube.giflib.controller;

import io.execube.giflib.data.GifRepository;
import io.execube.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Prateek Phoenix on 9/6/2016.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs",allGifs);
        return "home";
    }


    @RequestMapping(value = "/gif/{name}")
    public String gifDetail(@PathVariable String name, ModelMap modelMap)
    {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";

    }

}
