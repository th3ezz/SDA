package sda_lab2_prob2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		double temp[] = {36.3,36.9,37.1,36.5,38.5};
		List<Temp> normal = new ArrayList<Temp>();
		List<Temp> anormal = new ArrayList<Temp>();
	
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]<37.0)
				normal.add(new Temp(temp[i],i));
			else
				anormal.add(new Temp(temp[i],i));
		}
		
		System.out.println("Temperatura normala:" );
		
		for(Temp t : normal)
		{
			System.out.print("Temp: " + t.temp + "," + "ID: " + t.id + "\n");
		}
		
		System.out.println("\nTemperatura anormala:" );
		
		for(Temp t : anormal)
		{
			System.out.print("Temp: " + t.temp + "," + "ID: " + t.id + "\n" );
		}
	}		
}


