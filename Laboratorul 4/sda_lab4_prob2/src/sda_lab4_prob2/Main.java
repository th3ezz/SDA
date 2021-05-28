package sda_lab4_prob2;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		int n = 10;
		int[] s = new int[n];
		
		for (i=0; i<n; i++) {
			s[i] = new Random().nextInt(100);
		}
		
		System.out.print("Pozitie: ");
		int a = sc.nextInt();
		
		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.print(s[i] + " ");
		}
		
		for(i=0 ; i<n ; i++)
			if(a == i)
				for(j=i ; j<n ; j++) {
					s[j-1] = s[j];
				}
		
		System.out.println("\n");
		for (i=0; i<n; i++) {
			if(i < n-1){
			System.out.print(s[i] + " ");
			}else {
				System.out.print("null");
			}
		}
		
		sc.close();
	}
}