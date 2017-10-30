package com.demo.dao;

import org.mybatis.spring.annotation.MapperScan;

//@MapperScan   //该注解没有影响，要不要均可
public interface TDao<T> {
	public T getT(int id);

}
