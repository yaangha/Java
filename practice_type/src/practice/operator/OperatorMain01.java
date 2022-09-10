package practice.operator;

public class OperatorMain01 {

	public static void main(String[] args) {
		// 산술 연산자 -> 결과값은 숫자 타입
		// 비교 연산자 -> 결과값은 논리 타입
		
		// 단항 연산자(+, ++, -, --) -> 피연산자가 하나인 경우
		int a = +10;
		int b = -10;
		double c = +3.14;
		double d = -3.14;
		System.out.print(a + "\t" + b + "\t" + c + "\t" + d);
		
		System.out.println();
		
		// 변수의 값이 음수일 때, +와 - 연산자를 붙이면 실제 값의 부호가 바뀜. (+ -> -, - -> +)
		int x = -50;
		int result1 = x;
		int result2 = -x;
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		// 논리 부정 연산자(!) -> 피연산자가 하나인 경우
		// boolean 타입에서 사용되며, true -> false, false -> true로 바꾼다.
		boolean run = true;
		System.out.println(run);
		
		run = !run;
		System.out.println(run);
		
		// 이항 연산자 -> 피연산자가 두 개인 경우
		
		// 산술 연산자 (+, -, *, /, %) - boolean 타입을 제외한 모든 타입에 사용 가능!
		int n1 = 7;
		int n2 = 3;
		
		int result3 = n1 + n2;
		int result4 = n1 - n2;
		int result5 = n1 * n2;
		int result6 = n1 / n2;
		int result7 = n1 % n2;
		
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);

		
		

	}

}
