package com.geekster.Recipemanagementsystem.service;
import com.geekster.Recipemanagementsystem.repository.IRecipesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geekster.Recipemanagementsystem.model.*;

import java.util.List;
@Service

public class recipesService {
    @Autowired
    IRecipesRepo recipesRepo;

    public String addRecipes(recipes Recipes){
         return "recipes added successful";
    }
    public void addComment(comment Comment, String name){
            recipes commenter = recipesRepo.findFirstByRecipesName();
            comment.setCommenter(commenter);
        return CommentService.addComment(comment);

    }
}
