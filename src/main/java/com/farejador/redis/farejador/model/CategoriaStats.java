package com.farejador.redis.farejador.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoriaStats {

    private String tags;
    private Long totalPosts;
    private String averageViews;

}
