
public class SumEvenFibonacci {

	public static void main(String[] args) {
		SumEvenFibonacci obj = new SumEvenFibonacci();
		System.out.println(obj.process(4000000));
	}
	
	private int process(int number) {
		int a1 = 0;
		int a2 = 1;
		int a3 = a1 + a2;
		int untill = number;
		int sum = 0;
		while(a3 < untill) {	
			if(a3 % 2 == 0) {
				sum = sum + a3;
			}
			a1 = a2;
			a2 = a3;
			a3 = a1 + a2;
		}
		return sum;
	}

}
