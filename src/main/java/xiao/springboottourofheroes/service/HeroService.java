package xiao.springboottourofheroes.service;

import xiao.springboottourofheroes.entity.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getHeroes();

    Hero findById(int id);
}
