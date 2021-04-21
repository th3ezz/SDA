package sda_lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Selectati modul de desenare:");
		System.out.println("Automat (A)");
		System.out.println("Manual (M)");
		String option = sc.nextLine();

		if (option.toUpperCase().compareTo("A") == 0) {

			List<Shape> shape = new ArrayList<Shape>();

			shape.add(new Square("#000000", 1, 4));
			shape.add(new Square("#FFFFFF", 2, 8));
			shape.add(new Rectangle("#000000", 1, 4, 8));
			shape.add(new Rectangle("#FFFFFF", 2, 8, 4));
			shape.add(new Circle("#000000", 1, 4));
			shape.add(new Circle("#FFFFFF", 2, 8));

			for (Shape s : shape) {
				
				System.out.println("Name : " + s.getName());
				System.out.println("Area : " + s.getArea());
				System.out.println("FillColor : " + s.getHexFillColor());
				System.out.println("BorderWidth : " + s.getBorderWidth());
				System.out.println("...\n...\n...\n");

				s.draw();

				System.out.println();
			}

		}

		else if (option.toUpperCase().compareTo("M") == 0) {

			System.out.println("Selectati forma");
			System.out.println("Patrat (P)");
			System.out.println("Dreptunghi (D)");
			System.out.println("Cerc (C)");

			String opt = sc.nextLine();

			switch (opt.toUpperCase()) {
			
			case "P":
				
				System.out.println("Introduceti codul hexa pentru culoare:");
				String squareColor = sc.nextLine();
				System.out.println("Introduceti lungimea:");
				int size = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int squareBorder = Integer.parseInt(sc.nextLine());

				Shape s = new Square(squareColor, squareBorder, size);
				System.out.println("Name : " + s.getName());
				System.out.println("Area : " + s.getArea());
				System.out.println("FillColor : " + s.getHexFillColor());
				System.out.println("BorderWidth : " + s.getBorderWidth());
				System.out.println("...\n...\n...\n");
				s.draw();
				break;

			case "C":
				System.out.println("Introduceti codul hexa pentru culoare:");
				String circleColor = sc.nextLine();
				System.out.println("Introduceti raza:");
				int radius = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int circleBorder = Integer.parseInt(sc.nextLine());

				Shape s1 = new Circle(circleColor, circleBorder, radius);
				System.out.println("Name : " + s1.getName());
				System.out.println("Area : " + s1.getArea());
				System.out.println("FillColor : " + s1.getHexFillColor());
				System.out.println("BorderWidth : " + s1.getBorderWidth());
				System.out.println("...\n...\n...\n");
				s1.draw();
				break;

			case "D":
				System.out.println("Introduceti codul hexa pentru culoare:");
				String rectangleColor = sc.nextLine();
				System.out.println("Introduceti lungimea:");
				int rectangleHeight = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti latimea:");
				int rectangleWidth = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int rectangleBorder = Integer.parseInt(sc.nextLine());

				Shape s2 = new Rectangle(rectangleColor, rectangleBorder, rectangleHeight, rectangleWidth);
				System.out.println("Name : " + s2.getName());
				System.out.println("Area : " + s2.getArea());
				System.out.println("FillColor : " + s2.getHexFillColor());
				System.out.println("BorderWidth : " + s2.getBorderWidth());
				System.out.println("...\n...\n...\n");
				s2.draw();
				break;
			}
		}

		sc.close();

	}
}
