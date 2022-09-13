package practice.condition;

import java.util.Random;

public class ConditionMain02 {

	public static void main(String[] args) {
		// 주사위 번호 뽑기
		Random random = new Random();
		
		int a = random.nextInt(6) + 1; // 1 ~ 6 사이의 정수를 랜덤으로 받기. (7)은 0 이상 7 미만이라는 뜻..!
		System.out.println(a);
		
		if (a == 1) {
			System.out.println("1이 나왔습니다.");
		} else if (a == 2) {
			System.out.println("2가 나왔습니다.");
		} else if (a == 3) {
			System.out.println("3이 나왔습니다.");
		} else if (a == 4) {
			System.out.println("4가 나왔습니다.");
		} else if (a == 5) {
			System.out.println("5가 나왔습니다.");
		} else {
			System.out.println("6이 나왔습니다.");
		}
		
	}

}
