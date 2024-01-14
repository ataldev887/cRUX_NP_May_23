package lecture29;

public class queue {
	
	private int []arr;
	private int front = 0;
	private int size = 0;
	public queue() {
		arr = new int [5];
	}
	public queue(int n) {
		arr = new int [n];
	}
public boolean isEmpty() {
	return size == 0;
}

public void Enqueue(int item) {
	if(isfull()) {
		
	}
	int idx = (front + size)%arr.length;
	arr[idx]=item;
	size++;
}

public int Dequeue() {
	int rv = arr[front];
	front ++;
	size --;
	return rv;
}


}
