package class2;

public class StringTest {

	public static void main(String[] args) {
		//String도 클래스인데 new 연산자를 써야한다
		String a = "apple"; //유별나게 String은 new를 안써도 된다
		String b = "apple"; 
		
		//둘은 주소을 물어보는거다 apple을 물어보는게아니라
		if(a==b)System.out.println("a와b의 참조값은 같다");
		else System.out.println("a와b의 참조값은 다르다");
		//apple을 물어보는거다	
		if(a.equals(b))	System.out.println("a와b의 문자열은 같다");
		else System.out.println("a와b의 문자열은 다르다");
		
		//String도 클래스인데 new를 썼을 경우
		String c = new String("apple");
		String d = new String("apple");
		if(c==d)System.out.println("c와d의 참조값은 같다");
		else System.out.println("c와d의 참조값은 다르다");
	
		if(c.equals(d))System.out.println("c와d의 문자열은 같다");
		else System.out.println("c와d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 1991+7+16;
		System.out.println("e = "+e);
		System.out.println("문자열 크기 = "+e.length()); //14 공백도 글자로 들어간다
		System.out.println("첫번째 문자 = "+e.charAt(0)); //오
		System.out.println("두번째 문자 = "+e.charAt(1)); //늘
		System.out.println("세번째 문자 = "+e.charAt(13)); //6
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));//1991716
		System.out.println("부분 문자열 추출 = " + e.substring(7,11));//1991  10 까지하면 7번부터 10번 이전까지 나온다
		
		System.out.println("대문자 변경 = " +"Hello".toUpperCase());
		System.out.println("소문자 변경 = " +"Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜")); //4
		System.out.println("문자열 검색 = " + e.indexOf("날짜")); //3
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); //-1  // 이 문자는 없기 때문에 -1을 가지고 온다
		
		System.out.println("문자열 치환 = " + e.replace("날짜","일자")); 
	};
};

/*
문자열은 편집이 안되므로 메모리 4번 생성된다
JVM에 의해서 삭제 시 Garbage Collector로 보낸다
Garbage Collector가 실행되면 컴퓨터는 멈춘다
"오늘 날짜는"
"오늘 날짜는 1991"
"오늘 날짜는 19917"

          012 345 6 이런식으로 문자를 센다
e ---- > "오늘 날짜는 1991716"

바로 삭제보단 휴지통에 보내고 오래~~지나서 안쓰면 영구삭제한다
중간에 또 쓰면 다시 보내주고..JVM이 할 일이 많다.
*/