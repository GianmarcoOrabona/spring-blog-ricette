package com.learning.springblogricette.controller;

import com.learning.springblogricette.model.Recipe;
import com.learning.springblogricette.repository.RecipeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping
    private String index(Model model) {
        List<Recipe> recipeList = recipeRepository.findAll();
        model.addAttribute("recipeList", recipeList);
        return "recipes/list";
    }

    @GetMapping("/show/{id}")
    public String show(@PathVariable Integer id, Model model) {
        Optional<Recipe> result = recipeRepository.findById(id);
        if (result.isPresent()) {
            Recipe recipe = result.get();
            model.addAttribute("recipe", recipe);
            return "recipes/show";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found");
        }
    }

    @GetMapping("/create")
    public String create(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);
        return "recipes/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("recipe") Recipe formRecipe, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "recipes/create";
        } else {
            Recipe savedRecipe = recipeRepository.save(formRecipe);
            return "redirect:/recipes/show/" + savedRecipe.getId();
        }
    }





























}
