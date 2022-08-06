package project1;

public class SecondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 501;			//Write any number hear 
		String possitiveResult="possitive";
		String negativeResult="negative";
		if(number>0) {
			System.out.println("The number is :"+" "+possitiveResult.toUpperCase());
		}
		else {
			System.out.println("The number is :"+" "+negativeResult.toUpperCase());
		}
		
		
		System.out.println("---------------------------------------------------");
		
		
		int divident = 2;
		String two = new String("two");
		if(number%divident==0){
			System.out.println("The number is devisible by"+" "+two.substring(0,1).toUpperCase()+two.substring(1));
		}
		else {
			System.out.println("The number dose not devisible by"+" "+two.substring(0,1).toUpperCase()+two.substring(1));
		}
	}

}
