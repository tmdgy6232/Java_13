package com.biz.exec;

public class Exec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaService js = new JavaService();
		
		
		int ret ;
		//ret = js.add();
		ret = js.add(100);
		ret = js.add(200, 500);
		System.out.println(ret);

		
	}

}
