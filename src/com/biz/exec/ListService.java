package com.biz.exec;

import java.util.ArrayList;
import java.util.List;

public class ListService {

	List<String> strList = null;

	public ListService() {
		strList = new ArrayList<String>();

	}

	public void makeList() {

	}

	// return type이 class 형인경우
	// 오류가 나지 않으려면 최소한 null 값이라도
	// return해 주어야한다.
	public List<String> makeList(String str) {

		return null;
	}

	public List<String> makeList(String str1, String str2) {
		
		strList.add(str1);
		strList.add(str2);
		
		return strList;
		
	}

}
