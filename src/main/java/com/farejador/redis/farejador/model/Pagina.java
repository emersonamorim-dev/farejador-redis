package com.farejador.redis.farejador.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Pagina {
    private List<Postar> posts;
    private Integer totalPage;
    private Integer currentPage;
    private Long total;
}
