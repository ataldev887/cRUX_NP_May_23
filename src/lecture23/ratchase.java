package lecture23;

import java.util.*;

public class ratchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		path(maze,0,0,ans);
		if(flag==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean flag = false;

	public static void path(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc]!='x') {
			ans[cr][cc]=1;
			display(ans);
			flag = true;
			return;
		}
		if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] == 'x') {
			return;
		}
		maze[cr][cc] = 'x';
		ans[cr][cc] = 1;
		path(maze, cr - 1, cc, ans); // up
		path(maze, cr + 1, cc, ans); // down
		path(maze, cr, cc - 1, ans); // left
		path(maze, cr, cc + 1, ans); // right
		maze[cr][cc] = '0';
		ans[cr][cc] = 0;
	}

	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.println(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
