package sda_lab4_prob1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j;
		int n = 10;
		int[] s = new int[n];

		for (i = 0; i < n; i++) {
			s[i] = new Random().nextInt(100);
		}

		System.out.print("Pozitie: ");
		int a = sc.nextInt();
		System.out.print("Numar: ");
		int b = sc.nextInt();

		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		n = n + 1;
		s = Arrays.copyOf(s, s.length + 1);

		for (j = n - 1; j > 0; j--) {
			s[j] = s[j - 1];
			if (a == j) {
				s[j] = b;
				break;
			}
		}

		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}

		sc.close();
	}
}
