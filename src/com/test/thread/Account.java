package com.test.thread;

public class Account {

	/** 
	* �˻��� 
	*/ 
	String name; 
	/** 
	* �˺���� 
	*/ 
	double money; 
	/** 
	* ��Ǯ�������� 
	*/ 
	static final int save = 0; 
	/** 
	* ȡǮ�������� 
	*/ 
	static final int sub = 1; 
	/** 
	* �˺Ų�����ʽ 
	*/ 
	int x; 
	
	Account(){};//�޲����Ĺ��캯�� 
	/** 
	* Ҫ�������� 
	*/ 
	double number;//Ҫ�������� 
	Account(String name,double x) 
	{ 
	this.name = name; 
	this.money = x; 
	} 
	/** 
	* ����Ҫ������Ǯ��ֵ 
	* @param number ���˺Ų�������Ŀ 
	*/ 
	public void setNumber(double  number) 
	{ 
	this.number = number; 
	} 
	/** 
	* ��ȡ�����˺ŵ���Ŀ 
	* @return  �����˺ŵ���Ŀ 
	*/ 
	public double getNumber() 
	{ 
	return number; 
	} 
	/** 
	* ���ò����˺ŵķ�ʽ 
	* @param x ���ò����˺ŵķ�ʽ 
	* x :1 ȡǮ 
	* x: 0 ��Ǯ 
	*/ 
	public void setOp(int x) 
	{ 
	this.x = x; 
	} 
	/** 
	* ����˺Ų�����ʽ 
	* @return ���ز����˺ŵķ�ʽ 
	*/ 
	public int  getOp() 
	{ 
	return x; 
	} 
	/** 
	* �����˺���� 
	* @return �˺���� 
	*/ 
	public double getMoney() 
	{ 
	return money; 
	} 
	/** 
	* �����˺���� 
	* @param money  �˺���� 
	*/ 
	public void setMoney(double money) 
	{ 
	this.money = money; 
	} 
	/** 
	* ��ȡ�˺��� 
	* @return  ������ 
	*/ 
	public String getName() 
	{ 
	return name; 
	} 
	/** 
	* �����˺��� 
	* @param name �˺��� 
	*/ 
	public void setName(String name) 
	{ 
	this.name = name; 
	} 
	/** 
	* ��Ӧ�˺ŵĲ������� 
	*/ 
	public  synchronized void op() 
	{//����Ǵ�Ǯ����ô�ͰѴ��Ǯ���뵽�˻� 
	if(getOp() == save) 
	{ 
	setMoney(getMoney()+this.getNumber()); 
	System.out.println("��Ǯ�ɹ��������˺�����:"+getMoney()); 
	} 
	//ȡǮ 
	if(getOp() == sub) 
	{ 
	if(this.number>getMoney())//1.ѡ�ж��˺��Ƿ����㹻��� 
	throw new ArithmeticException("�˻�����!�˻�����ʣ:"+getMoney()); 
	else 
	{ 
	try 
	{ 
	Thread.sleep(1000); 
	} 
	catch (InterruptedException e) { 
	// TODO �Զ����� catch �� 
	e.printStackTrace(); 
	}//�۳���Ӧ������ 
	setMoney(this.getMoney()-this.getNumber());	
	System.out.println(Thread.currentThread().getName()+"ȡ��"+this.getNumber()+"Ԫ\n"+"�ʻ����:"+this.getMoney()); 
	}	
	} 
	} 

	} 
