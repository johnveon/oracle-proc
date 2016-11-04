package com.ctg.test.orc.proc.utils;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.joda.time.DateTime;

/**
 * 
 * by zhoufe 2016年11月4日 下午4:43:50
 **/

public class StudentGen
{
	private static Random random = new Random(47);
	private static String nameBase = "abcdefghijklmnopqrstuvwxyz0123456789";
	private static String genderBase = "FMO";
	
	private static AtomicInteger studentNo = new AtomicInteger(0);

	public static String idGenNext()
	{// 年份+学校+随机
		String dateStr = currentYMDHMS();
		String university = University.randUniversity();
		return String.format("%s-%s-%s", dateStr, university, UUID.randomUUID());
	}

	public static String nameGenNext(int length)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++)
		{
			int number = random.nextInt(nameBase.length());
			sb.append(nameBase.charAt(number));
		}
		return sb.toString();
	}

	public static Integer noGenNext()
	{
		return studentNo.incrementAndGet();
	}

	private static String currentYMDHMS()
	{
		return new DateTime().toString("yyyy-MM-dd-HH-mm-ss");
	}

	public static String genderNext()
	{
		StringBuffer sb = new StringBuffer();
		int number = random.nextInt(genderBase.length());
		sb.append(genderBase.charAt(number));
		return sb.toString();
	}

}
