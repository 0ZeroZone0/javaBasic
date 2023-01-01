package basic;

public class Operartor {

	public static void main(String[] args) {
		int a=5;
		a+= 2;  // a = a+2
		a*= 3;  //a = a*3
		
		System.out.println("a=" + a);  // a=21
		
		++a;
		System.out.println("a=" + a);  // a=22
		
		int b = a++;
		System.out.println("a=" + a + " b = " + b); //a=23 b=22 

		int c = ++a;
		System.out.println("a = " + a + " c = " + c); //a=24 c=24
		
		int d = ++a - b--;
		System.out.println("a =" + a + " b = " + b + " d =" + d ); //a=25 b=21 d=3
		
		
		System.out.println("a++=" + a++); //25
		System.out.println("a = " + a); //26
		//a++이라서 프린트a 값먼저 계산 그리고 뒤에서 +1값까지 해줘서 26 나옴. 이래서 후행계산이 어려운것.
		
		
	}

}


// 1. ++a;  //25
//2. int d = a - b; //25-22
//3. b--; //21


/*
돼지저금통 -> a 
a = 5;

a = a+3;   ---> a += 3

a = a * 2;   ---> a * = 2

a = a / 3;   ---> a /= 3  


*/

/*
 				      선행      후행
a = a + 1    a+= 1    ++a 또는 a++

a = a - 1  a-=1        --a   a--


*/

/* 연산자  우선순위
()
++, --

int b = a++;	       int b = ++a;

1. int b= a; 			1. a++;
2. a++;					2. int b = a;

*/