package week2;

public class PersonInfo {
	public static void main(String[] args) {
		//변수 선언
		String name = "오창룡"; 		//String타입 변수 name 선언
		int age = 21;				//int타입 변수 age 선언
		double height = 175.6;		//double타입 변수 height 선언
		char gender = 'M';			//char타입 변수 gender 선언
		boolean isStudents = true;	//boolean타입 변수 isStudents 선언
		
		//출력
		System.out.println("이름: " + name); 				//이름: 오창룡 
		System.out.println("나이: " + age + "세");		//나이: 21세
		System.out.printf("키: %.1fcm\n", height);		//키: 175.6cm\n
		System.out.printf("성별: %c\n", gender);			//성별: M\n
		System.out.printf("학생 여부: %b\n", isStudents);	//학생 여부: true\n
	}
}
