package com.ctg.test.orc.proc.dao;


import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ctg.test.orc.proc.entity.Student;
import com.ctg.test.orc.proc.utils.IdCardGenerator;
import com.ctg.test.orc.proc.utils.StudentGen;

/**
 * 
 * by zhoufe 2016年11月4日 下午4:35:17
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-dao.xml"})
public class StudentDaoTest
{
	/**
	* Logger for this class
	*/
	private static final Logger logger = LoggerFactory.getLogger(StudentDaoTest.class);

	@Autowired
	private StudentDao studentDao;
	
	@Test
	public void test_add()
	{
		Student student = new Student(StudentGen.idGenNext(),
				StudentGen.noGenNext(), 
				StudentGen.nameGenNext(5),
				StudentGen.genderNext(), 
				IdCardGenerator.next());
		studentDao.add(student);
	}
	
	@Test
	public void test_getAll()
	{
		List<Student> students = studentDao.getAll();
		printStudents(students);
	}

	private void printStudents(List<Student> students)
	{
		if(students != null && students.size() > 0)
		{
			for (Student student : students)
			{
				logger.info(student.toString());
			}
		}else
		{
			logger.info("没有信息！");
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test_executeProcGetByParam()
	{
		
		HashMap paramMap = new HashMap();
		paramMap.put("studentId", "2016-11-04-20-01-03-003-fcdca5ea-b35f-4769-af0b-ee4df0916180");
		paramMap.put("studentNo", "1");
		paramMap.put("studentName", "c9n3n");
		studentDao.executeProcGetByParam(paramMap);
		List<Student> students = (List<Student>)paramMap.get("result");
		printStudents(students);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test_executeProcGetAll()
	{
		
		HashMap paramMap = new HashMap();
		studentDao.executeProcGetAll(paramMap);
		List<Student> students = (List<Student>)paramMap.get("result");
		printStudents(students);
	}
}
