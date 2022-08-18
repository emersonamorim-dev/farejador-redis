package com.farejador.redis.farejador.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farejador.redis.farejador.model.CategoriaStats;
import com.farejador.redis.farejador.model.Pagina;
import com.farejador.redis.farejador.service.PostarService;

@RestController
@RequestMapping("/")
public class FarejadorController {

    @Autowired
    private PostarService postarService;

    @RequestMapping("/farejador")
    public Pagina farejador(@RequestParam(name = "content", required = false) String content,
            @RequestParam(name = "tags", required = false) Set<String> tags,
            @RequestParam(name = "pagina", defaultValue = "1") Integer pagina) {
        return postarService.search(content, tags, pagina);
    }

    @GetMapping("/categoryWisePost")
    public List<CategoriaStats> getCategoryWiseTotalPost() {
        return postarService.getCategoryWiseTotalPost();
    }

}
