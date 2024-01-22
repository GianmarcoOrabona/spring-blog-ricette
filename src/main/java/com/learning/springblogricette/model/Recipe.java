package com.learning.springblogricette.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "recepies")
public class Recipe {
    // ATTRIBUTI

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Ingredients list must not be blank")
    private String ingredientList;

    @NotEmpty(message = "Title must not be blank")
    private String title;

    @Lob
    private String img;

    @NotEmpty(message = "Insert a valid preparation time, HH:mm")
    private String preparationTime;

    @NotNull(message = "Portion must not be blank")
    @Min(value = 1, message = "Portion can't be lower than 1")
    private Integer portion;

    @NotEmpty(message = "Recipe procedure must not be blank")
    @Lob
    private String recipeProcedure;

    private LocalDateTime createdAt;

    @ManyToMany
    private List<Category> categories;


    // GETTER E SETTER

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getRecipeProcedure() {
        return recipeProcedure;
    }

    public void setRecipeProcedure(String recipeProcedure) {
        this.recipeProcedure = recipeProcedure;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(String ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Integer getPortion() {
        return portion;
    }

    public void setPortion(Integer portion) {
        this.portion = portion;
    }
}
