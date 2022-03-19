
public class LargestPrimeFactor {

	public static void main(String[] args) {
		long number = 600851475143L;
		for(int i= 2 ; i< number ; i++) {
			if(number% i == 0) {
				long quo = number/i;
				number = quo;
				continue;
			}
			
		}
		System.out.println(number);

	}

}
