package Graphs;

import java.util.Scanner;

public class First_Graph {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("No of Vertices");
		int v = s.nextInt();
		System.out.println("No of Edge");
		int e = s.nextInt();
		int Ematrix[][] = new int[v][v];
		for (int i = 1; i <= e; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();

			Ematrix[v1][v2] = 1;
			Ematrix[v2][v1] = 1;
		}

		for (int i = 0; i < Ematrix.length; i++) {
			for (int j = 0; j < Ematrix[0].length; j++) {
				System.out.print(Ematrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
