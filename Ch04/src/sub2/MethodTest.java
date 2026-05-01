package sub2;

public class MethodTest {

	public static void main(String[] args) {
		
		// 메서드 호출(Call)
		int y1 = f(1); // f 메서드 호출하면서 매개변수 x의 인자값 1 전달
		int y2 = f(2);
		int y3 = f(3);
		
		hello("김유신");
		hello("이순신");
		
	} 
	
	// 메서드 정의(Define)
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static void hello(String name) {		
		System.out.println(name + "님 반갑습니다.");		
	}
}
