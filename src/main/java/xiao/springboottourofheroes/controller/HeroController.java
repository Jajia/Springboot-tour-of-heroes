package xiao.springboottourofheroes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.springboottourofheroes.entity.Hero;
import xiao.springboottourofheroes.service.HeroService;

import java.util.List;

@RestController
public class HeroController {

    private HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/get-heroes")
    public ResponseEntity<List<Hero>> getHeroes() {
        return ResponseEntity.ok(heroService.getHeroes());
    }
}
