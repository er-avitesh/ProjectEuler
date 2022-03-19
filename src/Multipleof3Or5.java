
public class Multipleof3Or5 {

	public static void main(String[] args) {
		Multipleof3Or5 obj = new Multipleof3Or5();
		System.out.println("Sum is : " + obj.program(10));
	}
	
	private int program(int number) {
		int sum = 0;
		for(int i=1;i<number;i=i+1) {
			if(i%3==0 || i%5==0) {
				sum = sum+i;
			}
		}
		return sum;
	}

}
