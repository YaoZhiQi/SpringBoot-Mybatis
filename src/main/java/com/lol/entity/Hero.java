/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:32:26
 */
package com.lol.entity;

/**
 * 描述：
 * 姚志奇 2017年4月26日 上午11:32:26
 */
public class Hero {
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + "]";
	}
	
}
