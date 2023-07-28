package com.geekster.Recipemanagementsystem.repository;
import com.geekster.Recipemanagementsystem.model.recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRecipesRepo extends JpaRepository<recipes,Long>{

}
