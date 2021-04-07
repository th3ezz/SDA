package sda_lab2_prob1;

public class Main {
	
	public static int viteza_max_1(String s) {
		if(s.compareToIgnoreCase("oras")==0)
			return 50;
		
		if(s.compareToIgnoreCase("zona rezidentiala")==0)
			return 30;
		
		if(s.compareToIgnoreCase("drum express")==0)
			return 100;
		
		if(s.compareToIgnoreCase("autostrada")==0)
			return 130;
		
		return 0;
		
	}
	
	public static int viteza_max_2(String s) {
		if(s.compareToIgnoreCase("oras")==0)
			return 50;
		else
			if(s.compareToIgnoreCase("zona rezidentiala")==0)
				return 30;
			else
				if(s.compareToIgnoreCase("drum express")==0)
					return 100;
				else
					if(s.compareToIgnoreCase("autostrada")==0)
						return 130;
					else
						return 0;
	}
	
	public static int viteza_max_3(String s) {
		
		String str = s.toLowerCase();
		
		switch(str) {
		
		case "oras":
			return 50;
		case "zona rezidentiala":
			return 30;
		case "drum express":
			return 100;
		case "autostrada":
			return 130;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("\nIf-if\n");
		
		System.out.println("Oras: " + viteza_max_1("oras"));
		System.out.println("Zona Rezidentiala: " + viteza_max_1("zona rezidentiala"));
		System.out.println("Drum express: " + viteza_max_1("drum express"));
		System.out.println("Autostrada: " + viteza_max_1("autostrada"));
		System.out.println("Necunoscut: " + viteza_max_1("necunoscut"));
		
		System.out.println("\nIf-else if\n");
		
		System.out.println("Oras: " + viteza_max_2("oras"));
		System.out.println("Zona Rezidentiala: " + viteza_max_2("zona rezidentiala"));
		System.out.println("Drum express: " + viteza_max_2("drum express"));
		System.out.println("Autostrada: " + viteza_max_2("autostrada"));
		System.out.println("Necunoscut: " + viteza_max_2("necunoscut"));
		
		System.out.println("\nSwitch\n");
		
		System.out.println("Oras: " + viteza_max_3("oras"));
		System.out.println("Zona Rezidentiala: " + viteza_max_3("zona rezidentiala"));
		System.out.println("Drum express: " + viteza_max_3("drum express"));
		System.out.println("Autostrada: " + viteza_max_3("autostrada"));
		System.out.println("Necunoscut: " + viteza_max_3("necunoscut"));
	}
}
