package com.test;

import java.util.Scanner;

public class Money {
	
	public static void main (String[]args){
		double d = 0.0;//ʵ������
		Scanner in = new Scanner(System.in);
		System.out.println("==========================��ӭʹ�ø�˰������================================");
		System.out.println("���������˰ǰ���ʣ�");
		double a = in.nextDouble();//˰ǰ����
		System.out.println("��������ĸ�����ᱣ�շѣ�");
		double b = in.nextDouble();//������ᱣ�շ�
		double c = a-b; //Ӧ��˰���ö�
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
		System.out.println("����ʵ������Ϊ��" + d);
		
		
	}
	

}
