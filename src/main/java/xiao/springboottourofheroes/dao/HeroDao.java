package xiao.springboottourofheroes.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xiao.springboottourofheroes.entity.Hero;

import java.util.List;

@Mapper
public interface HeroDao {
    @Select("SELECT * FROM heroes")
    List<Hero> getHeroes();

    @Select("SELECT * FROM heroes where id = #{id}")
    Hero getHeroById(int id);
}
