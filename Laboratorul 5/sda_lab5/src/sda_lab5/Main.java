package sda_lab5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails("Theodor", "Patratanu", 10, 10);
        StudentDetails s2 = new StudentDetails("Oprea", "Vlad", 10, 10);
        StudentDetails s3 = new StudentDetails("Maru", "Ciprian", 9, 9);
        StudentDetails s4 = new StudentDetails("Amariei", "Rares", 10, 10);
        StudentDetails s5 = new StudentDetails("Dumitru", "Gabriel", 9, 9);
        StudentDetails s6 = new StudentDetails("Huminic", "Bianca", 8, 8);
        StudentDetails s7 = new StudentDetails("Ianosiu", "Oana", 10, 10);
        StudentDetails s8 = new StudentDetails("Mocanu", "Daniel", 4, 4);
        StudentDetails s9 = new StudentDetails("Popescu", "Cristina", 4, 4);
        StudentDetails s10 = new StudentDetails("Rata", "Stefania", 6.5, 7.5);
        StudentDetails s11 = new StudentDetails("Negri", "Camelia", 8.5, 8.5);

        HashMap<String, StudentDetails> studentList_HashMap = new HashMap<>();

        studentList_HashMap.put("1234", s1);
        studentList_HashMap.put("2345", s2);
        studentList_HashMap.put("3345", s3);
        studentList_HashMap.put("4789", s4);
        studentList_HashMap.put("5212", s5);
        studentList_HashMap.put("6002", s6);
        studentList_HashMap.put("7777", s7);
        studentList_HashMap.put("8888", s8);
        studentList_HashMap.put("9893", s9);
        studentList_HashMap.put("1010", s10);
        studentList_HashMap.put("1010", s11);

        LinkedHashMap<String, StudentDetails> studentList_LinkedHashMap = new LinkedHashMap<>();

        studentList_LinkedHashMap.put("1234", s1);
        studentList_LinkedHashMap.put("2345", s2);
        studentList_LinkedHashMap.put("3345", s3);
        studentList_LinkedHashMap.put("4789", s4);
        studentList_LinkedHashMap.put("5212", s5);
        studentList_LinkedHashMap.put("6002", s6);
        studentList_LinkedHashMap.put("7777", s7);
        studentList_LinkedHashMap.put("8888", s8);
        studentList_LinkedHashMap.put("9893", s9);
        studentList_LinkedHashMap.put("1010", s10);
        studentList_LinkedHashMap.put("1010", s11);


        System.out.println("Introduceti CNP: ");
        Scanner scan = new Scanner(System.in);
        String CNP = scan.nextLine();
        
        System.out.println(studentList_HashMap.get(CNP));

        for (String key : studentList_HashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        System.out.println(studentList_LinkedHashMap.get(CNP));

        for (String key : studentList_LinkedHashMap.keySet()) {
            System.out.println(key);
        }

        scan.close();

    }
}
