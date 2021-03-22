package sda_ex1;

import java.util.Scanner;

public class operatii {

	public static Scanner scan = new Scanner(System.in);
	
	int x,y,sum,diff,prod,dist,max,min;
	double avg;
	
	public void citire(){
		
	System.out.println("Introduceti primul numar: ");
	x = scan.nextInt();
	System.out.println("Introduceti al doilea numar: ");
	y = scan.nextInt();
	
	}
	
	public void suma(){
	
	sum = x + y;
	System.out.println("Suma este: " + sum);
	}
	
	public void diferenta() {
		
	diff = x - y;
	System.out.println("Diferenta este: " + diff);
	}
	
	public void produs() {
		
	prod = x * y;
	System.out.println("Produsul este: " + prod);
	}
	
	public void medie() {
		
		avg = (x + y)/2;
		System.out.println("Media este: " + avg);
	}
	
	public void distanta() {
	
	if (x>y) {
	
	dist = x - y;
	}
	else {
	
	dist= y - x;
	}
	System.out.println("Distanta este: " + dist);
	}
	
	public void max_min() {
	
	if (x>y) {
			
	max = x;
	min = y;
	}
	else {
			
	max = y;
	min = x;
	}
	System.out.println("Maximul este: " + max);
	System.out.println("Minimul este: " + min);
	}
}
