package com.biz.exec;

import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListService ls = new ListService();
		
		ls.makeList();
		List<String> s = ls.makeList("대한민국");
		System.out.println(s);
		
		
		List<String> str = ls.makeList("대한민국", "korea");
		
		for(String s1 : str) {
			System.out.println(s1);
		}
		
		List<String> sList = ls.makeList("Republic of Korea", "광주광역시");
				
		for(String s2 : sList) {
			System.out.println(s2);
		}
	
		
		// str 변수에 리턴값을 받았는데
		// 그 후 (리턴받은후에) listservice에 있는
		// 리스트 변수에 string을 추가했더니
		// strList 변수에[ 또다시 값을 받지 안하도]
		//변경된 내용ㅇ을 확인할 수 있었다.
		// 그 이유는 strList 변수에 받은 내용이 주소이기 때문이다.
			System.out.println("=========================");
			
			for(String s3 : str) {
				System.out.println(s3);
			}
	}

}
