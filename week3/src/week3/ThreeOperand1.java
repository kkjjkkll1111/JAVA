package week3;

public class ThreeOperand1 {
	public static void main(String[] args) {
		//삼항연산자 => (조건식) ? true일때 실행 : false일때 실행;
		int num1 = 35;
		int num2 = 47;
		String result;
		
		result = (num1 > num2) ? "num1이 더크다" : "num2가 더 크다";
		System.out.println(result);
		
		boolean bResult = (num1 > num2) ? true : false;
		
		int score = 85;
		result = (score >= 90) ? "우수" : ((score >= 80) ? "보통" : "미달"); 
	}
}
