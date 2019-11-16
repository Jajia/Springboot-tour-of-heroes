package xiao.springboottourofheroes.service.impl;

import org.springframework.stereotype.Service;
import xiao.springboottourofheroes.dao.HeroDao;
import xiao.springboottourofheroes.entity.Hero;
import xiao.springboottourofheroes.service.HeroService;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {
    private HeroDao heroDao;

    public HeroServiceImpl(HeroDao heroDao) {
        this.heroDao = heroDao;
    }

    @Override
    public List<Hero> getHeroes() {
        return heroDao.getHeroes();
    }

    @Override
    public Hero findById(int id) {
        return heroDao.getHeroById(id);
    }
}
