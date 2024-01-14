package lecture42;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.Add(4);
		hp.Add(5);
		hp.Add(7);
		hp.Add(1);
		hp.Add(6);
		hp.Add(9);
		hp.Add(3);
		System.out.println(hp.get());
		hp.Display();
		System.err.println(hp.remove());
		hp.Display();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//min heap
		PriorityQueue<Integer> tq = new PriorityQueue<Integer>(Collections.reverseOrder());//max heap
		pq.add(4);
		pq.add(5);
		pq.add(7);
		pq.add(1);
		pq.add(6);
		pq.add(9);
		pq.add(3);
		System.out.println(pq);
		System.out.println(pq.poll()); //pq.remove
		System.out.println(pq.peek()); //get
	}

}
