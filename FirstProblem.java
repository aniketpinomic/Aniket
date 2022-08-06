package project1;

public class FirstProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "aniket";				//String literal
		String last = new String("patil");		//String Object
		//First Output
		System.out.println("-------First Output-------");
		System.out.println(first.length() + last.length());   //length of first is 6 + length of last is 5 = 11
		//Second Output
		System.out.println("-------Second Output-------");
		System.out.println(first.compareTo(last)==0 ? "Lexicographically Currect : Yes":"Lexicographically Wrong : No");
		//Third Output
		System.out.println("-------Third Output-------");
		System.out.println(first.substring(0,1).toUpperCase()+first.substring(1)+" "+last.substring(0,1).toUpperCase()+last.substring(1));
		

	}

}
