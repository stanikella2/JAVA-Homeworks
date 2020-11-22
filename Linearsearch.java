
public class Linearsearch {

	public static void main(String[] args) {
		int[] arr = new int[] {0,13 ,20 ,37,7};
		String[] str = new String[] {"sad", "bad" ,"had", "hat"};
		String word = "hat";
		int val = 30;
		System.out.println(linearSearch(arr,val));
		System.out.println(wordSearch(str, word));
		System.out.println(binarySearch(arr,val));
	}
	public static int linearSearch(int[] arr, int val) {
		int num = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]== val) {
				return i;
				
			}
		}
		return num;
	}
	
	public static int wordSearch(String[] str, String word ) {
		int wordNotFound = -1;
		for(int i = 0; i<str.length; i++) {
			if(str[i]==word) {
				return i;
			}
		}
		return wordNotFound;
	}
	public static int binarySearch(int[] arr, int val) {
		int min = 0;
		int nonum = -1;
		int max = arr.length-1;
		
		while(min<=max) {
			int middle = (min+max)/2;
			if(arr[middle]==val)	{
				return middle;
			
			}
			else if(arr[middle]<val) {
				max = middle-1;
				
			}
			else if (arr[middle]>val) {
				min  = middle+1;
			}
		}
		return nonum;
		
	}
}
