package com.ctg.test.orc.proc.utils;

import java.util.Random;

/**
 * 
 * by zhoufe 2016年11月4日 下午5:04:07
 **/

public class University
{
	private static Random rand = new Random(47);

	public static String[][] universities = 
							   {
							     {"qinghua","001"},
								 {"beida","002"},
								 {"chongda","003"}
								};
	
	public static String randUniversity()
	{
		return University.universities[rand.nextInt(University.universities.length)][1];
	}

}
