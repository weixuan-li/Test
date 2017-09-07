package com.test;

import java.util.Scanner;

public class Money {
	
	public static void main (String[]args){
		double d = 0.0;//实发工资
		Scanner in = new Scanner(System.in);
		System.out.println("==========================欢迎使用个税计算器================================");
		System.out.println("请输入你的税前工资：");
		double a = in.nextDouble();//税前工资
		System.out.println("请输入你的各项社会保险费：");
		double b = in.nextDouble();//各项社会保险费
		double c = a-b; //应纳税所得额
		if(c-3500<=1500){
			d = a-(c-3500)*0.03;
		}else if(a-b-3500>1500&&a-b-3500<=4500){
			d = c-((c-3500)*0.1-105);
		}else if(c-3500>4500&&a-b-3500<=9000){
			d = c-((c-3500)*0.2-555);
		}else if(c-3500>9000&&a-b-3500<=35000){
			d = c-((c-3500)*0.25-1005);
		}else if(c-3500>35000&&a-b-3500<=55000){
			d = c-((c-3500)*0.3-2755);
		}else if(c-3500>55000&&a-b-3500<=80000){
			d = c-((c-3500)*0.35-5505);
		}else {
			d = c-((c-3500)*0.45-13505);
		}
		System.out.println("您的实发工资为：" + d);
		
		
	}
	

}
