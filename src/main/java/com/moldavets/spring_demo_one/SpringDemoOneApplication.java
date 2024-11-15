package com.moldavets.spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemoOneApplication {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context =
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		Coach theCoach = context.getBean("myCoach", Coach.class);
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
//		context.close();

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		context.close();
	}

}
