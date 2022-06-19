package com.example.movie.moviecatalogueservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogueController {

    @GetMapping("/{id}")
    public List<CatalogItem> getCatalogItem(@PathVariable("id") int id) {

        return Collections.singletonList(
                new CatalogItem("Movie 1", "1 desc", 10));
    }

}
