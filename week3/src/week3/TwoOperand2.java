package week3;

public class TwoOperand2 {

	public static void main(String[] args) {
		//비교연산자 : >, >=, <, <=, ==. !=(다르다) 
		//논리연산자 : &&(AND, &), ||(OR, |)
		
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90) {
			//65 <= charCode1 <= 90
			System.out.println((char)charCode1 + "는 알파벳 대문자이다.");
		}
		
		int charCode2 = 'b';
		if(charCode2 >= 97 && charCode1 <= 122) {
			//97 <= charCode1 <= 122
			System.out.println((char)charCode2 + "는 알파벳 소문자이다.");
		}
		
		char charCode3 = '9';
		if( !(charCode3 < 48) && !(charCode3 > 57)) {
			// 48 <= charCode <= 57
			System.out.println((char)charCode3 + "는 0~9 사이의 숫자이다.");
		}
		
		int iValue = 4;
		if ((iValue % 2 == 0) || (iValue % 3 == 0)) {
			//true || false => 둘중에 하나라도 true이면 true
			System.out.println(iValue + "는 2 또는 3의 배수이다.");
		}
	}
	

}
