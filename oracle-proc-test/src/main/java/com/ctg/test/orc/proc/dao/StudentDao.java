package com.ctg.test.orc.proc.dao;


import java.util.HashMap;
import java.util.List;

import com.ctg.test.orc.proc.entity.Student;

/**
 * 
 * by zhoufe 2016年11月4日 上午10:44:08
 **/

public interface StudentDao
{
	Integer add(Student student);
	
	List<Student> getAll();
	
	List<Student> executeProcGetByParam(HashMap<String, String> paramMap);
	
	List<Student> executeProcGetAll(HashMap<String, String> paramMap);

}
