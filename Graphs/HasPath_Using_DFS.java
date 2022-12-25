package Graphs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath_Using_DFS {

	public static boolean printHelper(int edges[][], int sv, boolean visited[], int f, int s, boolean fb, boolean sb) {
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv] = true;
		while (q.size() != 0) {
			int firstelem = q.poll();
			if (firstelem == f) {
				fb = true;
			}
			if (firstelem == s) {
				sb = true;
			}
			for (int i = 0; i < edges.length; i++) {
				if (edges[firstelem][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		return fb && sb;
	}

	public static boolean print(int edges[][], int f, int s) {
		boolean visited[] = new boolean[edges.length];
		boolean fb = false;
		boolean sb = false;
		for (int i = 0; i < edges.length; i++) {
			if (!visited[i]) {
				if (printHelper(edges, i, visited, f, s, fb, sb)) {
					return true;
				}

			}
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][] = new int[V][V];
		for (int i = 0; i < E; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		int f = 0;
		int se = 3;
		System.out.println(print(edges, f, se));

	}

}