package com.farejador.redis.farejador.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farejador.redis.farejador.model.CategoriaStats;
import com.farejador.redis.farejador.model.Pagina;
import com.farejador.redis.farejador.repository.PostarRepository;

@Service
public class PostarService {

    @Autowired
    private PostarRepository postarRepository;

    public Pagina search(String content, Set<String> tags, Integer pagina) {
        return postarRepository.search(content, tags, pagina);
    }

    public List<CategoriaStats> getCategoryWiseTotalPost() {
        return postarRepository.getCategoryWiseTotalPost();
    }
}
