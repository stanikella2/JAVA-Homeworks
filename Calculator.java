 import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // read input
        String expression = "10*((2+5*4)+5)*8";
      
        // print the evaluated result
        System.out.println(eval(expression));
    }
    
    public static int eval(String expression) {
        // TODO complete this function
    	
    	 Stack <Character> stack = new Stack<Character>();
    	 
    	 for (int i = 0; i < expression.length(); i++) {
    		 
             char d = expression.charAt(i);
             stack.push(d);
             if (stack.peek() != '(') {

                 stack.push(d); 
            
             }
                 else if (stack.peek() == ')') {   
                	 StringBuffer expression2 = new StringBuffer(stack.pop());
                	 
                   
                 
                 stack.pop(); 

                 String number = Integer.toString(addition(expression2.toString()));
                 for (int x = 0; x < number.length(); x++) {
                     stack.push(number.charAt(x));
                 }
             }
    	 }
          StringBuffer expression3 = new StringBuffer();
     if (stack.empty())	{
          return expression3.append(obj)  
         
        
     }
     return addition(expression3.toString());
    }


public static int addition(String expression) {
	String [] addition = expression.split("[+]");
	
	int sum = 0;
			for(int i = 0; i<addition.length; i++) {
				if(addition[i]=="[*]") {
					sum+= multiplication(addition[i]);
				}else {
					sum+= Integer.parseInt(addition[i]);
				}
			}
			return sum;
}
public static int multiplication(String expression) {
	String[] multiplication = expression.split("[*]");
	
	int product = 0;
		for(int i = 0; i<multiplication.length; i++) {
			product*= Integer.parseInt(multiplication[i]);
		}
		return product;
}
}

    	

        
  



	        
	       

	        
	      

	   

