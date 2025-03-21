package week3;

public class ScoreCalculator {

	public static void main(String[] args) {
		int score = 50;
		System.out.println("초기점수 : " + score);
		System.out.println("정답 보너스 (+10) : " + (score += 10));
		System.out.println("오답 담점 (-5) : " + (score -= 5));
		System.out.println("보너스 문제 정답 (x2) : " + (score *=2));
		System.out.println("추가점수 (+1) : " + (++score));
		System.out.println("감점 (-1) : " + (--score));
		System.out.println("최종점수 : " + score);

	}

}
