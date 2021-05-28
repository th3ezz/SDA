package sda_lab5;

public class StudentDetails {

	private String name;
    private String lastName;
    private double math;
    private double rom;
    public StudentDetails(String lastName, String name, double math, double rom) {
        this.lastName = lastName;
    	this.name = name;
        this.math = math;
        this.rom = rom;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getMath() {
        return math;
    }

    public void setMath(double mathGrade) {
        this.math = mathGrade;
    }

    public double getRom() {
        return rom;
    }

    public void setRom(double roGrade) {
        this.rom = roGrade;
    }
    @Override
    public String toString() {
        return "Last Name: " + lastName + "\n" + "Name: " + name + "\n" +
                "Math: " + math + "\n" + "Rom: " + rom + "\n";
    }

}
