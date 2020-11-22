package homework7;

import java.util.*;

	public class homework7 {
		public static void main(String[] args) {
			int [] numbers = new int[];
					  
		}
			public boolean 5MovedbinarySearch(int[] numbers, int searchTarget) {
				   int min = 0;
					
						int max = numbers.length-1;
						if(min>max) {
							return false;
						}
						
						while(min<=max) {
							int middle = (min+max)/2;
							if(searchTarget==numbers[middle])	{
								return true;
							
							}
							else if(searchTarget<numbers[middle] && searchTarget>numbers[min]) {
								max = middle-1;
								return false;
								
							}
							else if (searchTarget>numbers[middle] && searchTarget<numbers[max]) {
								min  = middle+1;
								return false;
							}
						}

				    return false;	
			}
		}
	

	