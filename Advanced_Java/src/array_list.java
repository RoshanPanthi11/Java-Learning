import java.util.*;
public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Integer> l1=new ArrayList<>();
          ArrayList<Integer> l2=new ArrayList<>(5);
          l2.add(15);
          l2.add(18);
          l2.add(23);
          l2.add(34);
          l2.add(43); 
          l1.add(6);
          l1.add(7);
          l1.add(4);
          l1.add(6);
          l1.add(5);
          l1.add(0,5);//add at 0 index
          l1.addAll(0,l2);//add l2 list from index 0
          System.out.println(l1.contains(12)); //if it contain then print true else false
          System.out.println(l1.indexOf(6));//if not in a list then print -1
          System.out.println(l1.lastIndexOf(6));
        //l1.clear();//clear all list of l1
          l1.set(1, 430);
         for(int i=0;i<l1.size();i++) {
       	  System.out.print(l1.get(i));
       	System.out.print(", ");
       	  
         }
	}

}
