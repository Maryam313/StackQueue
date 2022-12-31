import java.io.InputStreamReader;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class StackWorld {

	
	public static boolean myStack3(String inputStr22 ) {
	if(inputStr22=="") {
		return true;
	}
	Stack<Character> myStack3 = new Stack<>();
	for (int i = 0; i < inputStr22.length(); i++) {
	  //  char str= inputStr22.charAt(i);
		
		if(inputStr22.charAt(i) == '}') {
		
		myStack3.push(inputStr22.charAt(i));
		}
	
		else if (inputStr22.charAt(i)=='{') {

			 if(!myStack3.isEmpty()) 
				 myStack3.pop();
				 else {
					return false; 
				 }
		 }
					}
	
		if(myStack3.isEmpty())
			return true;
		else
			return false;
		}
	
	
	
	/**
	 * 
	 */

	/**
	 * 2) Reverse words contained in a sentence (String)
INPUT: "Reverse me if you can"
OUTPUT: "can you if me Reverse"

HINT: You can use .split(" ")
	 *
	 */
	  
    public static String Reverse(String str) {
    		  Stack<String> mystack4 = new Stack<>();
    		  String[] arr = str.split(" ");
    		for (String k : arr) {
               System.out.println(k);
       // for (int i = 0; i < str.length(); i++) {
            mystack4.push(k);
        }
 
         while (!mystack4.isEmpty())
        {
             System.out.println(mystack4.pop()); 	
        	 
        }
		return str;
 
    }
    


	
	
    public static String Reverse1(String str1) {
		  Stack<String> mystack5 = new Stack<>();	
		for (String k : str1.split("\\s+ ")) {
			mystack5.push(k);
  }

   while (!mystack5.isEmpty())
  {
       System.out.println(mystack5.pop() + " "); 	
  	 
  }
	return str1;

}
    
    /**
	 * 3) Implement .split method. split should take a character as input
   and returns an array of strings.
INPUT: "Reverse me if you can"
OUTPUT: ["Reverse", "me", "if", "you", "can"]

	 */
	
    public static ArrayList<String> splitMethod(String str) {
    	
    	Stack<Character> myStack5 = new Stack<>();
    	ArrayList<Character> char1=new ArrayList<>();
    	for (int i = 0; i < str.length(); i++) {
    		char1.add(str.charAt(i));
    		  myStack5.push(str.charAt(i));
    	
    }
    	
    	ArrayList<String>arr=new ArrayList<>();
    	String chaString=" ";
    	for (int i = 0; i < char1.size(); i++) {
    		chaString=chaString+Character.toString(char1.get(i));
    		if(char1.get(i)==' ') {
    			arr.add(chaString);
    			
    			chaString=" . ";
    			
    		}else if(i==char1.size()-1) {
    			arr.add(chaString);
    			
    			
    		}
    		
    	}

    	
		return arr;
    	}

    
    

	/**
	
	/**
4) Using STACK, Validate if the the expression containing square brackets, braces and paranthesis 
   is balanced or not.
   
INPUT: "{ int x= (int)(0+1); int[] arr=new arr[10];;;}}"
OUTPUT: true (Meaning valid)

INPUT: "[{()}]"
OUTPUT: true (Meaning valid)

INPUT: "]{()}[
OUTPUT: false (Meaning Invalid)

INPUT: "([]("
OUTPUT: false (Meaning Invalid)

INPUT: "(arr[10})"
OUTPUT: false (Meaning Invalid)

INPUT: "[arr(10)["
OUTPUT: false (Meaning Invalid)

INPUT: "([arr{(10)}])"
OUTPUT: true (Meaning valid)

	 */

	    
    public static boolean BalancedExpression(String string)
    {
        Stack<Character> Stack6 = new Stack<Character>();
        for(int i = 0; i < string.length(); i++)
        {
            char par = string.charAt(i);
            if(par == '[' || par == '{' || par == '(')
            	Stack6.push(par);
            else if(par == ']' || par == '}' || par == ')')
            {
                if(Stack6.empty())
                    return true;
                //Switch 
                switch(par)
                {
                    //  square 
                    case ']':
                        if (Stack6.pop()!='[')
                            return false;
                        break;
                    //  curly 
                    case '}':
                        if (Stack6.pop()!='{')
                            return false;
                        break;
                    //  paranthesis
                    case ')':
                        if (Stack6.pop()!='(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(!Stack6.empty()) {
            return false;
        }else {
        return true;
    }
    }
  /** 6) WITHOUT using split or array/array list print the words contained in a sentence (String) in reverse order:
    	INPUT: "Reverse me if you can"
    	OUTPUT: "can you if me Reverse"
   */
    public static String reverse6(String input) {
        int len = input.length();
        String word = " ,";

        for (int i = len - 1; i >= 0; i--) {
           word=word+input.charAt(i);
    }
    
    return word;
    
}

    
	public static void main(String[] args) {
		
		String inputStr22 = "{{}";

		System.out.println("-- " + myStack3(inputStr22)+"--");
		
		Stack<String> myStack = new Stack<>();

		myStack.push("Plate 1");
		myStack.push("Plate 2");
		myStack.push("Plate 3");
		myStack.push("Plate 4");
		myStack.push("Plate 5");

		System.out.println("---------------");
		
		
		String str="Reverse me if you can";
		//System.out.println("-- " + str.split(str)+"--");

		System.out.print("-- " + Reverse(str)+"--");
		System.out.println("\n---------------");

		String str1="Reverse me if you can";

		System.out.println("\n---------------");

        
		
		System.out.println("Output  is:" + splitMethod(str));

		String string="([arr{(10)}])";
		System.out.println("-->> " + BalancedExpression(string)+"-->>");
		
		String rev=reverse6("Rrversr me if");
		System.out.println(rev);
		
    

	
		
	}

}

