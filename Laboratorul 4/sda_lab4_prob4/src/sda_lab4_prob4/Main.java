package sda_lab4_prob4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Selectati modul de desenare:");
		System.out.println("Automat (A)");
		System.out.println("Manual (M)");
		String option = sc.nextLine();
		
		List<Shape> shape = new ArrayList<Shape>();
		
		if (option.toUpperCase().compareTo("A") == 0) {

			shape.add(new Square("#000000", 1, 4));
			shape.add(new Square("#FFFFFF", 2, 8));
			shape.add(new Rectangle("#000000", 1, 4, 8));
			shape.add(new Rectangle("#FFFFFF", 2, 8, 4));
			shape.add(new Circle("#000000", 1, 4));
			shape.add(new Circle("#FFFFFF", 2, 8));

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

				shape.add(new Square(squareColor, squareBorder, size));
				break;

			case "C":
				System.out.println("Introduceti codul hexa pentru culoare:");
				String circleColor = sc.nextLine();
				System.out.println("Introduceti raza:");
				int radius = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int circleBorder = Integer.parseInt(sc.nextLine());

				shape.add(new Circle(circleColor, circleBorder, radius));
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

				shape.add(new Rectangle(rectangleColor, rectangleBorder, rectangleHeight, rectangleWidth));
				break;
			}
		}
		
		for (Shape s : shape) {

			System.out.println("Name : " + s.getName());
			System.out.println("Area : " + s.getArea());
			System.out.println("FillColor : " + s.getHexFillColor());
			System.out.println("BorderWidth : " + s.getBorderWidth());
			System.out.println("...\n...\n...\n");

			s.draw();

			System.out.println();
		}
	
		List<String> colors = new ArrayList<>();
		
        for(Shape s: shape) {
            colors.add(s.getHexFillColor());
        }
        
        System.out.println("Colors: " + colors);

        Set<String> mySet = new HashSet<String>(colors);
        for(String s: mySet) {
            System.out.println(s + " - " + Collections.frequency(colors,s));
        }
        
        sc.close();
	}
}
