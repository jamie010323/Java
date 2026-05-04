package sub4;

public class Engineer extends Person{
	
	private String field;
	
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;
	}
	
	public void work() {
		System.out.println("제 이름은 [" +name+ "] 이고 나이는 [" +age+ "]세 입니다." );
	}

}
