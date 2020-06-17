package BasicGui;

//import java.util.Arrays;
import java.util.HashMap;

public class Operators {
	
	private static HashMap<String,String> Arithmetic = new HashMap<String, String>();
	private static HashMap<String,String> Relational = new HashMap<String,String>();
	private static HashMap<String,String> Bitwise = new HashMap<String,String>();
	private static HashMap<String,String> Assignment = new HashMap<String,String>();
	
	private static String[] ArithmeticOperators={"+","-","*","/","%","++","--"};
	private static String[] RelationalOperators= {"==","!=",">","<",">=","<="};
	private static String[] BitwiseOperators= {"&","|","^","~","<<",">>","&&","||","!"};
	private static String[] AssignmentOperators= {"=","+=","-=","*=","/=","%=","<<=",">>=","&=","^=","|="};
	
	/*
	 * private static String[] MISCOperators= {"sizeof()","&","*"};
	 * private static String[] memberandPointer= {"[]","*","&","->","."};
	 * private static String[] OtherOperators= {"alingof()","typeidof()"};
	 * private static String[] logAndConOperators={Logical"&&","||","!",
					conditional"?:"};*/
	
	private static String[] ArithmeticOperations= {"Add","Subtract","Multiply","Divide","Modulus","Increment",
    		"Decrement",};
	private static String[] RelationalOperations= {"Equal to","Not Equal to","Greater than","Less than",
		   "Greater than or Equal","Less than or Equal"};
	private static String[] BitwiseOperations= {"Bitwise And","Bitwise Or","Bitwise Xor",
		   "Bitwise Compliment","Shift Left","Shift Right","Logical And","Logical or","Logical Not"};
	private static String[] AssignmentOperations= {"Assign","Add and Assign","Subtract and Assign",
		   "Multiply and Assign","Divide and Assign","Modulus and Assign","Shift Left and Assign",
		   "Shift Right and Assign","BitwiseAnd and Assign","Bitwise Xor and Assign",
		   "Bitwise Or and Assign"};
 
   static HashMap<String,String> getArithmetic() {
	   for(int i=0;i<ArithmeticOperators.length;i++) {
	   Arithmetic.put(ArithmeticOperations[i], ArithmeticOperators[i]);
	   }
	   return Arithmetic;
   }
   static HashMap<String,String> getRelational() {
	   for(int i=0;i<RelationalOperators.length;i++) {
	   Relational.put(RelationalOperations[i], RelationalOperators[i]);
	   }
	   return Relational;
   }
   static HashMap<String,String> getBitwise() {
	   for(int i=0;i<BitwiseOperators.length;i++) {
	   Bitwise.put(BitwiseOperations[i], BitwiseOperators[i]);
	   }
	   return Bitwise;
   }
   static HashMap<String,String> getAssignment() {
	   for(int i=0;i<AssignmentOperators.length;i++) {
	   Assignment.put(AssignmentOperations[i], AssignmentOperators[i]);
	   }
	   return Assignment;
   }

}
