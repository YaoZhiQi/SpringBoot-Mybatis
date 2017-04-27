/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:33:35
 */
package com.lol.service;

import java.util.List;

import com.lol.entity.Hero;

/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:33:35
 */
public interface HeroService {
	Hero getHeroById(Integer id);
	
	List<Hero> getHeroList();
}
