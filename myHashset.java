import java.util.*;
	public class myHashset{
	  private ArrayList<LinkedList<SetEntry>> entries;
	  public myHashset() {
	    entries = new ArrayList<>();
	    for (int i = 0; i < 100; i++) {
	      LinkedList<SetEntry> emptyList = new LinkedList<>();
	      entries.add(emptyList);
	    }
	    
	  }
	   public void add(String word) {
	    SetEntry entry = new SetEntry(word);
	    int index = hash(word) % 100;
	    entries.get(index).add(entry);
	  }

	public boolean contains(String word) {
	    int index = hash(word) % 100;
	    LinkedList<SetEntry> list = entries.get(index);
	    for (SetEntry entry: list) {
	      if (entry.word.equals(word)) {
	        return true;
	      }
	    }
	    return false;
	  }
	  public int hash(String word){
		  char[] letters = word.toCharArray();  
		    int sum = 0;
		    for(int i = 0; i<letters.length; i++){
		      sum+=(int) letters[i];
		    }
		    return sum;
		  }
		}