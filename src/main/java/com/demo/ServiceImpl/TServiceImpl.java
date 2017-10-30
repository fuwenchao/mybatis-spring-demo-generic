package com.demo.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.Service.ITService;
import com.demo.dao.TDao;
import com.demo.util.GenericsUtils;

@Service("userService")
public class TServiceImpl<T,S> implements ITService<T>{
	//@Autowired
	//@Resource  //(mappedName="getUser")   默认安照名称进行装配
//	Class clz=GenericsUtils.getSuperClassGenricType(this.getClass(),0);
//	System.out.println("clz-----"+clz);
	
	@Autowired        //该demo中两个这注解都可以  Autowired默认按类型装配
	//@Qualifier("userDao")
	private TDao<T> userDao;   //或者将变量名命名为tDao--->userDao
	public T getT(int id) {
		T t= userDao.getT(id);
		System.out.println(t);
		return t;
	}


}
