package com.geekster.Recipemanagementsystem.controller;
import com.geekster.Recipemanagementsystem.model.*;
import com.geekster.Recipemanagementsystem.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Validated
public class recipesController {
    @Autowired
    recipesService RecipesService;
    @Autowired
    CommentService commentService;
   @PostMapping ("addRecipes")
   public String addrecipes( @RequestBody @Valid recipes Recipes){
      return "added";
   }
   @GetMapping("getAllRecipes")
    public String getallRecipes(){
    return "get adding";
   }
    @PostMapping("comment")
    public String addComment(@RequestBody comment Comment , @RequestBody String name)
    {
            return recipesService.addComment(Comment,name);
    }
}
