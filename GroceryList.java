;//p.585, #3, 
public class GroceryList {  //1
 private GroceryItemOrder[] shopping_list; //2
 private int itemBoughtSoFar; //3
 private int ary_index; //4: array is 0 based
 public GroceryList(){ //5
    shopping_list = new GroceryItemOrder[2];
    //itemBoughtSoFar = 0;
    ary_index = -1;
 }
 public void add(GroceryItemOrder item){ //5
  if(itemBoughtSoFar > 1){
    throw new IllegalArgumentException();
  }
  ary_index++;
  shopping_list[ary_index] = item;
  //itemBoughtSoFar++;
 }
 public double getTotalCost(){
  double totalCost = 0.0; 
  for(int i=0; i <= ary_index; i++){
   totalCost += shopping_list[i].getCost();
  }
  return totalCost;
 }
}