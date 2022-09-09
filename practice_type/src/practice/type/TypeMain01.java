package practice.type;

public class TypeMain01 {

	public static void main(String[] args) {
		// 자바에서 제공하는 기본 타입(총 8가지)
		// 정수 타입: byte, char, short, int, long
		// 실수 타입: float, double
		// 논리 타입: boolean
		
		// 1. 정수 타입
		// 정수의 기본 타입은 int(4byte)이며, int의 허용범위를 넘어서면 long을 사용!(숫자 뒤에 대문자 "L"을 붙이면 됨)
		int a = 10;
		long b = 10000000000L;
		
		// 2. 실수 타입
		// 실수의 기본 타입은 double(8byte)이며, float을 사용하고자 할 때는 뒤에 소문자 "f"를 붙이면 됨.
		// float은 4byte이기 때문에 소수점 7자까지만 나타낼 수 있다. 반면 double은 15자리까지 나타낼 수 있어 float보다 정밀도가 높음.
		float c = 3.14f;
		double d = 3.14;
		
		// 3. 논리 타입
		// true, false 값만 저장할 수 있으며 조건문과 제어문의 실행 흐름을 변경할 때 사용.
		boolean run1 = true;
		boolean run2 = false;

	}

}
