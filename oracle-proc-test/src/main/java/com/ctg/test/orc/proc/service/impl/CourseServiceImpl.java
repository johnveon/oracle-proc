package com.ctg.test.orc.proc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctg.test.orc.proc.dao.CourseDao;
import com.ctg.test.orc.proc.entity.Course;
import com.ctg.test.orc.proc.service.CourseService;

/**
 * 
 * by zhoufe 2016年11月4日 上午10:54:52
 **/
@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	private CourseDao courseDao;

	@Override
	public Integer add(Course course)
	{
		return courseDao.add(course);
	}
	
}
