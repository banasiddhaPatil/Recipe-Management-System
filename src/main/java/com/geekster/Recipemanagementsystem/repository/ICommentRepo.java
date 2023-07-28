package com.geekster.Recipemanagementsystem.repository;


import com.geekster.Recipemanagementsystem.model.recipes;
import com.geekster.Recipemanagementsystem.model.comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<comment,Integer> {
}
