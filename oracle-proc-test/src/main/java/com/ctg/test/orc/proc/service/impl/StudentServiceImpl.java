package com.ctg.test.orc.proc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctg.test.orc.proc.dao.StudentDao;
import com.ctg.test.orc.proc.entity.Student;
import com.ctg.test.orc.proc.service.StudentService;

/**
 * 
 * by zhoufe 2016年11月4日 上午10:54:52
 **/
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao studentDao;

	@Override
	public Integer add(Student student)
	{
		return studentDao.add(student);
	}

}
