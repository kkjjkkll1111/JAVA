package week2;

public class DataType4 {
	public static void main(String[] args) {
		//byte = -128 ~ 127
		byte	bData = 127;	//1바이트라는 크기를 벗어남
		//char => 음수가 없다
		char	cData = 90;		//char는 음수가 없음
		
		float	fData = 3.14f;	//실수의 리터럴은 double, float은 f를 붙여줘야 함
		//정수형태 => 기본이 int로 인식
		long	lData = 10000000000l;	//정수의 리터럴은 int이므로 뒤에 l을 붙여줘야됨
		
		boolean boolD = true;	//boolean은 true아니면 false만 가능
	}
}
