package practice.condition;

public class ConditionMain01 {

	public static void main(String[] args) {
		// 조건문: if문
		// 값을 산출할 수 있는 연산식이나 boolean 타입 변수를 조건식으로 사용.
		
		// if문을 사용하여 성적별 등급 매기기.
		int a = 95;
		
		if (a >= 90) {
			System.out.println("A"); // 조건식이 true일 때 실행됨.
		} else {
			System.out.println("A가 아닙니다."); // 조건식이 false일 때 실행됨.
		}
		
		// if - else 문
		// else if를 사용하여 조건문을 여러개 사용할 수 있음.
		int b = 87;
		
		if (b >= 90) {
			System.out.println("A"); // 조건식이 true일 때 실행 -> false이면 아래 조건식으로 넘어감.
		} else if (b >= 80) {
			System.out.println("B"); // 위의 조건식은 false, 해당 조건식은 true일 때 아래 조건식 실행.
		} else {
			System.out.println("재시험"); // 위 두 개의 조건식이 모두 false일 때 실행.
		}
		
		int c = 56;
		
		if (c >= 90) {
			System.out.println("A");
		} else if (c >= 80) {
			System.out.println("B");
		} else if (c >= 70) {
			System.out.println("C");
		} else if (c >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
