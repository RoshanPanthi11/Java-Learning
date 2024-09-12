import java.util.ArrayDeque;
public class Array_deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad1= new ArrayDeque<>();
		ad1.add(6);
		ad1.add(56);
		ad1.add(9);
		ad1.addFirst(45);
		ad1.addLast(222);
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		

	}

}
 