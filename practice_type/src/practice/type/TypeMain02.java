package practice.type;

public class TypeMain02 {

	public static void main(String[] args) {
		// 타입 변환 
		// 자동 타입 변환 vs 강제 타입 변환
		
		// 자동 타입 변환
		// 허용 범위가 작은 타입이 범위가 큰 타입으로 저장될 때 발생. (예. 큰 타입(좌측) = 작은 타입(우측))
		// 기본 타입의 허용 범위 순서: byte < short < int < long < float < double
		byte byteA = 19;
		int intB = byteA;
		
		double doubleC = 10.5;
		// int intD = doubleC; // -> 변환할 수 없다며 에러남! int는 double보다 작기 때문에.
		// 이렇게 큰 타입을 작은 타입에 저장하고자 할 때 "강제 타입 변환"을 하면 에러가 나지 않음.
		
		// 강제 타입 변환
		// 큰 타입을 작은 타입에 저장하고자 할 때 강제로 타입을 변환하는 것.
		// casting 이라고 함.
		// 작은 타입 = (작은 타입) 큰 타입;
		
		double doubleVal = 10.5;
		int intVal = (int) doubleVal; // 위에서 에러가 났던 공식을 강제 타입 변환을 통해 수정!

	}

}
