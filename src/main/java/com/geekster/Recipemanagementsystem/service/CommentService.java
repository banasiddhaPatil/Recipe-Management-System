package com.geekster.Recipemanagementsystem.service;
import com.geekster.Recipemanagementsystem.model.comment;
import com.geekster.Recipemanagementsystem.repository.ICommentRepo;
import com.geekster.Recipemanagementsystem.repository.IRecipesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentService {

    @Autowired
    ICommentRepo commentRepo;

    public static String addComment(comment comment,String name) {
        IRecipesRepo.save(comment);
        return "Comment has been added!!!";
    }

    public comment findComment(Integer commentId) {
        return  commentRepo.findById(commentId).orElse(null);
    }

    public void removeComment(comment comment) {
        commentRepo.delete(comment);
    }
}
