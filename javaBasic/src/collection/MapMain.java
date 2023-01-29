package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String> ();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); //Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주"); //Key 중복허용
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book103"));
		System.out.println(map.containsKey("book101"));//있냐없냐-블린형태
		System.out.println(map.containsValue("백설공주"));
	};
};

/*
key		Value
snak01, 포카칩    
관리		우리에게보여줄때
*/