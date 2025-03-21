package week2;

public class print {
	//main 메소드는 반드시 필요 => JVM이 프로그램을 실행할 때 시작점
	//main 단축키 : main + ctrl + spacebar
	
	public static void main(String[] args) {
		//문자열 출력 단축키 : sysout + ctrl + spacebar
		//실행 탄축키 : ctrl + f11
		System.out.println("객체 지향 프로그래밍");
		
		//주석 단축키 : ctrl + /
		/*System.out.println("객체");
		System.out.println("지향");*/
		System.out.println("/*객체 지향*/ 프로그래밍");
		
		//숫자 출력 시 주의 사항
		System.out.println(17 + 35);
		System.out.println("17 + 35 = " +17 + 35); //17 + 35 = 1735
		System.out.println("17 + 35 = " +(17 + 35)); //17 + 35 = 52

		//프린트 출력 포멧(printf)
		//% : 프린트 포멧 기호
		//%s : 문자열
		//%d : 정수
		//%f : 실수
		//%c : 문자
		//%b : boolean
		
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d세\n", 25);
		System.out.printf("과목 : %s %s %s \n", "객체","지향","프로그래밍");
	}
}
