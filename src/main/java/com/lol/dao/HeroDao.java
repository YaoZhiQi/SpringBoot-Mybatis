/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:31:15
 */
package com.lol.dao;
import java.util.List;

import com.lol.entity.Hero;

/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:31:15
 */
public interface HeroDao {
	/**
	 * 描述：按照id查找hero
	 * CiBa-Y 2017年4月26日 下午3:14:16
	 * @param id
	 * @return
	 */
	Hero findOne(Integer id);
	/**
	 * 描述：查找所有的hero
	 * CiBa-Y 2017年4月26日 下午3:27:21
	 * @return
	 */
	List<Hero> findAll();
}
