package sda_lab4_prob3;

import java.util.*;

public class Main {

	public static boolean Search(int n, int[] s) {

		boolean m;
		int x = 0;
		int left = 0;
		int right = s.length - 1;
		int middle = (left + right) / 2;
		while (left <= right) {
			if (s[middle] < n) {
				left = middle + 1;
			}
			if (s[middle] > n) {
				right = middle - 1;
			}
			middle = (left + right) / 2;
			if (s[middle] == n) {
				x = 1;
				break;
			}
		}

		if (x == 1) {
			m = true;
		} else {
			m = false;
		}

		return m;

	}

	public static void main(String[] args) {
		
		int[] s = {10 , 523, 34, 213, 245, 599, 87, 88, 100, 77};
		int i,j;
		int aux = 0;
		int n = s.length;
		
		for (i = 0; i < n - 1; i++)
			for (j = i + 1; j < n; j++)
				if (s[i] > s[j]) {
					aux = s[i];
					s[i] = s[j];
					s[j] = aux;
				}
		
		for (i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println("");
		System.out.println("\nNumber 34 found: " + Search(34, s));
		System.out.println("\nNumber 77 found: " + Search(77, s));
		System.out.println("\nNumber 523 found: " + Search(523, s));
		System.out.println("\nNumber 245 found: " + Search(245, s));
		System.out.println("\nNumber 100 found: " + Search(100, s));
		System.out.println("\nNumber 10 found: " + Search(10, s));
		System.out.println("\nNumber 599 found: " + Search(599, s));
		System.out.println("\nNumber 1000 found: " + Search(1000, s));
	}
}
