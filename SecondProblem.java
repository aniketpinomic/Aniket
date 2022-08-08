package project1;

public class SecondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===========================================================================================");
		
		int number = 55;			                //Write any number here 
		String possitiveResult="possitive";
		String negativeResult="negative";
		
		if(number>0) {
			System.out.println("The number is :"+" "+possitiveResult.toUpperCase());
		}
		else {
			System.out.println("The number is :"+" "+negativeResult.toUpperCase());
		}
		
		System.out.println("----------------------------------------------------------------------With Ternary Operator");
		System.out.println((number>0)? "The number is Possitive" : "The number is Negative");
		
		
		System.out.println("===========================================================================================");
		
		int divisor = 2;
		String two = new String("two");
		
		if(number%divisor==0){
			System.out.println("This number is divisible by"+" "+two.substring(0,1).toUpperCase()+two.substring(1));
		}
		else {
			System.out.println("This number does not divisible by"+" "+two.substring(0,1).toUpperCase()+two.substring(1));
		}
		
		System.out.println("----------------------------------------------------------------------With Ternary Operator");
		
		System.out.println((number%divisor==0)? "This number is divisible by Two" : "This number does not divisible by Two");
		
		System.out.println("===========================================================================================");
		
	}

}
