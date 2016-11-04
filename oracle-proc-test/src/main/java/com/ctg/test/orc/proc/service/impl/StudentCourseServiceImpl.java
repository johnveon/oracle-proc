package com.ctg.test.orc.proc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctg.test.orc.proc.dao.StudentCourseDao;
import com.ctg.test.orc.proc.entity.StudentCourse;
import com.ctg.test.orc.proc.service.StudentCourseService;

/**
 * 
 * by zhoufe 2016年11月4日 上午10:54:52
 **/
@Service
public class StudentCourseServiceImpl implements StudentCourseService
{
	@Autowired
	private StudentCourseDao studentCourseDao;

	@Override
	public Integer add(StudentCourse studentCourse)
	{
		return studentCourseDao.add(studentCourse);
	}

}
