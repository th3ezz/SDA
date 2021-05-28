package sda_lab4_prob5;

import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		int n, m, i, j, k, l;
		int pixel = 3, sum = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Rows: ");
		n = sc.nextInt();
		System.out.print("Columns: ");
		m = sc.nextInt();

		int[][] matrice = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrice[i][j] = new Random().nextInt(255);
			}
		}
		System.out.println();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
				} else {
					System.out.print(matrice[i][j] + " ");
				}
			}
		}
		
		for (i = 0; i < n; i = i + pixel) {
			for (j = 0; j < m; j = j + pixel) {
				int px = Math.min(pixel, m - j);
				int py = Math.min(pixel, n - i);

				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						sum += matrice[i + k][j + l];
					}
				}
				media = (int) sum / (px * py);
				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						matrice[i + k][j + l] = media;
					}
				}

			}
		}
		System.out.println();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
				} else {
					System.out.print(matrice[i][j] + " ");

				}
			} 
		}
		
		sc.close();
	}
}
