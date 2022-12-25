package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	public static void bfs(int[][] mat) {
		Queue<Integer> que = new LinkedList<>();
		boolean visited[] = new boolean[mat.length];
		visited[0] = true;
		que.add(0);

		while (!que.isEmpty()) {
			int curr = que.poll();
			System.out.print(curr + " ");
			for (int i = 0; i < mat.length; i++) {
				if (mat[curr][i] == 1 && !visited[i]) {
					// i is unvisited neighbor of currentVertex
					que.add(i);
					visited[i] = true;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		int mat[][] = new int[v][v];

		for (int i = 0; i < mat.length; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();

			mat[v1][v2] = 1;
			mat[v2][v1] = 1;
		}

		bfs(mat);

	}

}
