package project1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 20;
		int num2= 30;
		System.out.println("-----------------Assignment Operator-----------------");
		System.out.println(num1==num2);    // only check condition num1 and num2 are equal or not
		System.out.println(num1+=num2);    // num1 add in num2 and assign output value in num1 -- num1=50
		System.out.println(num1-=num2);    // num1=50 then num1(50) - num2(30)= 20 --> 20 is store in num 1 so num 1= 20
		System.out.println(num1*=num2);    // num1=20 then num1(20) * num2(30)= 600 --> 600 is store in num1 so num1=600
		System.out.println(num1/=num2);    // num1=600 then num1(600) / num2(30)= 20 --> again num1= 20
		System.out.println(num1%=num2);    // num1=20 then num1(20) divided by num2(30) then reminder ill be 0.66 means 0
		System.out.println(num1%=6);       // num1=20 then num1 divides by 6 then reminder will be 2
		System.out.println(num1);          // at last value of num1 will be 2
		System.out.println("-----------------Assignment Operator-----------------");
		System.out.println(num1+=1);       // num1 is 2 then answer--> num1=3 
		System.out.println("Output value is : " + num1);  // value of num1 is 3 then next,
		// value of num1 is 3
		System.out.println(num2-=10);      // num2 is 30 then answer--> num2=20
		System.out.println("Output value is : " + num2);  // value of num2 is 20 then next,
		
		System.out.println(num1/=2);       // when num1 takes 3 answer--> num1=1
		System.out.println("Output value is : " + num1);  // value of num1 is 1 then next,
		
		System.out.println(num2*=3);       // when num2 takes 20 answer--> num2=60
		System.out.println("Output value is : " + num2);  // value of num2 is 60 then next,
		
		System.out.println(num1%=5);
		System.out.println("Output value is : " + num1);  // value of num1 is 1 then next,
		
		
		
		
		System.out.println("-----------------Relational Operator-----------------");
		//in the relational operator it will be check only conditions i.e. number will be grater or less or equal  //
		// in Relational operator there are following condition---->
		// <= (less than equal to) , >= (grater than equal to), == (equals to) , != (not equal to) //
		int num3= 55;
		System.out.println(num3>20);
		System.out.println(num3>=54);
		System.out.println(num3>=55);
		System.out.println(num3<55);
		System.out.println(num3<=20);
		System.out.println(num3!=55);
		System.out.println(num3!=60);
		
		
		
		System.out.println("-----------------Shift Operator-----------------");
		// In shift operator there are three types---->
		// << (Left Shift), >> (Right Shift) , >>> (Triple Right Shift)
		
		int num4= 125; // binary of 125 is 0000 0111 1101 
		//then add two times zeros in right side for left shifting, then binary becomes 0001 1111 0100
		// (0001 1111 0100) value of this binary is 500 so answer i'll be 500
		System.out.println(num4<<2);
		
		int num5= 10; // binary of 10 is 0000 0000 1010
		// Then add 5 times zero in left side for left shifting then binary becomes 0000 0000 0000
		// when we shift binary right at that time binary becomes lost some binary code thats why 1 shifts right and loose data//
		System.out.println(num5>>5);
		
		int num6= -10; // binary is 1010
		// when we gives negative number in the variable then operation will be perform as positive number
		// then last after giving answer as it is negative sign i'll be taken
		System.out.println(num6>>1);
		
		int num7= -125;  // binary of 125 is 0000 0111 1101
		// all the operation will be perform as considering the positive value
		// at the last when we calculate the answer automatically answer takes negative sign
		System.out.println(num7<<2);
		
		
		
		
		System.out.println("-----------------Ternary Operator / Conditional Operator-----------------");
		// in the conditional operator we use '?' and ':' in same line
		int a = 5, b=10;
		System.out.println((a>b)? "true":"false"); // when condition will be true then 'true' is print otherwise False 
		System.out.println((a<b)? a:b); // when condition will be false then 'b' is print
		
		int c= 10, d=12, e=15;
		System.out.println((c>d) ? ((d>c)? d:e) : ((d<c)? d:e));
		
		int no1=50, no2=100;
		System.out.println((no1>no2)? "The condition is true":"The condition is false");
		
		
		
		System.out.println("-----------------BIDMAS Rule-----------------");
		// BIDMAS rule means the sequence of mathematical operations performs in expression
		// Division '/' --> Multiplication '*' --> Addition '+' --> Subtraction '-'
		// / --> * --> + --> - 
		
		int x=5, y=7, z=10;
		System.out.println("The currect value is" + " " + x + y + z);
		// when we use String data type in print property the integer value acts as a String,
		// and they will print as it is
		
		System.out.println("The currect value is" + " " + (x+y*z/x));
		// when use string but we gives circle braces of variables then ,
		// it consider as a mathematical Expressions and BIDMAS rule is apply
		
		System.out.println("The currect value is" + " " + x/y*z/x);
	}
}


