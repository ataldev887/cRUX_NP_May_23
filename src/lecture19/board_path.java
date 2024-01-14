package lecture19;

public class board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
PrintPath(n,0,"");
	}
	
	public static int PrintPath(int n, int curr, String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		int count =0;
		for(int dice =1; dice<=3; dice++) {
			count = count + PrintPath(n,curr+dice ,ans+dice);
		}
		return count;
			}
}
