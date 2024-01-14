package lecture35;

import java.util.Scanner;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public BinaryTree() {
		this.root=CreateTree();
	}
	private Node CreateTree() {	
		int item=sc.nextInt();
		Node nn = new Node();
		nn.data=item;
		boolean hlc = sc.nextBoolean();
		if(hlc==true) {
			nn.left=CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc==true) {
			nn.right=CreateTree();
	}
		return nn;
  }
	public void display() {
		display(this.root);
	}
	private void display(Node nn) {
		if(nn==null) {
			return;
		}
		String str = "";
		str = str + nn.data;
		str = "<--" + str + "-->";
		if(nn.left!=null) {
			str = nn.left.data + str;
		}else {
				str = "." + str;
		}
				if(nn.right!=null) {
					str = str + nn.right.data;
				}else {
						str =  str + ".";
	}
				System.out.println(str);
				display(nn.left);
				display(nn.right);			
		}	
				public int max() {
					return max(this.root);
				}
				private int max(Node node) {
					if(node==null) {
						return Integer.MIN_VALUE;
					}
				int lmax = max(node.left);
				int rmax = max(node.right);
				return Math.max(lmax , Math.max(rmax,node.data));
				}
}