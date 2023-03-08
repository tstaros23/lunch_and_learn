package com.lunch_and_learn.controller;

import com.lunch_and_learn.output.CountryRecipesResponseBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")

public class RecipeDetailsController {
    @RequestMapping(value="/byName", method = RequestMethod.GET,
            consumes =MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    {
        public CountryRecipesResponseBean getCountryByName(@RequestParam String name)
        {
            
        }
    }
}
