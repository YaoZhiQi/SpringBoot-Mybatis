/**
 * 描述：
 * 姚志奇 2017年4月25日 下午7:47:17
 */
package com.lol.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lol.entity.Hero;
import com.lol.service.HeroService;

/**
 * 描述：
 * 姚志奇 2017年4月25日 下午7:47:17
 */
@RestController
public class HeroController {
	@Autowired
	private HeroService heroService;
	
	@RequestMapping(value="/hero",method=RequestMethod.GET)
	public List<Hero> getHeroList(){
		List<Hero> heroList = heroService.getHeroList();
		return heroList;
	}
	
	@RequestMapping(value="/hero/{id}",method=RequestMethod.GET)
	public Hero getHero(@PathVariable("id") Integer id){
		Hero hero = heroService.getHeroById(id);
		return hero;
	}
	
}
