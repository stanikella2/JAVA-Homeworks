import java.text.DecimalFormat;
import java.util.*;
public class Homework {
	
	public static void main(String[] args) {
	 String[] words = new String [] {"family", "fun" , "sa","up", "everytime", "family"};

	 System.out.println(minWordLength(words));
	 System.out.println(maxWordLength(words));
	 System.out.println(wordLengthRange(words));
	 System.out.println(averageWordLength(words));
	 System.out.println(mostCommonWordLength(words));
	}
	public static int minWordLength(String[] words) {
		
		int min = words[0].length();
		for (int i = 0; i<words.length; i++) {
			if(words[i].length()<min) {
				min = words[i].length();
			}
		}
		return min;
	}
	public static int maxWordLength(String[] words) {
		int max = words[0].length();
		
		for (int i = 0; i<words.length; i++) {
			if(words[i].length()>max) {
				max = words[i].length();
			}
		}
		return max;
	}
	public static int wordLengthRange(String[] words) {
		int max1= maxWordLength(words);
		int	min2 = minWordLength(words);
		return max1-min2;
		
	}
	public static String averageWordLength(String[] words) {
		int totalValue = 0;
		
		int totalLength = words.length;
		for(int i = 0; i<totalLength; i++) {
			totalValue+= words[i].length();
			
			
		}
		double average = totalValue/totalLength;
		DecimalFormat avgf = new DecimalFormat("###.00");
		String avg = avgf.format(average);
		return avg;
	}
   public static int mostCommonWordLength(String[] words) {
	  
	    	 int lengths;
	  	   int maximumLength= 100;
	  	   int [] wordsLengths= new int[ maximumLength];
	  	   for(int i = 0; i<maximumLength;i++) {
	  		 wordsLengths [i] = 0;
	  		   
	  		   }
	  	   for(int i = 0; i<words.length; i++ ) {
	  		   lengths = words[i].length();
	  		   wordsLengths[lengths] = wordsLengths[lengths]+1;
	  	   }
	  	   int max = wordsLengths[0];
	  	   for(int i = 0; i<maximumLength; i++) {
	  		   if(wordsLengths[i]>max) {
	  			   max= wordsLengths[i];
	  			   
	  		   }
	  	   }
	       int Count=0;
	       for(int i =0; i<wordsLengths.length; i++) {
	          		if(wordsLengths[i]==max) {
	          			Count++;
	          		}
	          		if(Count>1) 
	          		max = -1;
	          		
	          			
	          		
	          }
	           return max;
}

}
