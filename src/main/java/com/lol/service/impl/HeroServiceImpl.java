/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:34:10
 */
package com.lol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lol.dao.HeroDao;
import com.lol.entity.Hero;
import com.lol.service.HeroService;

/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:34:10
 */
@Service
public class HeroServiceImpl implements HeroService{
	@Autowired
	private HeroDao heroDao;
	public Hero getHeroById(Integer id) {
		Hero hero = heroDao.findOne(id);
		return hero;
	}
	
	public List<Hero> getHeroList(){
		List<Hero> heroList = heroDao.findAll();
		return heroList;
	}

}
