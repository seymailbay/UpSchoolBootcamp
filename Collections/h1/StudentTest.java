package Collections.Odev1;

import FProgramlama.Odev2.Book;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        ArrayList<Student> listOfStudents= new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries: ");
        int registerCount=sc.nextInt();

        for(int i=0; i <registerCount; i ++){
            Student student = registrationOffice.getAStudent();      //
            //registrationOffice.registerStudent(student);
            listOfStudents.add(student);
            String a = student.toString();
            //System.out.println(a);
            //System.out.println(listOfStudents);
        }
        System.out.println("Before sorting...");
        for (int i=0; i<listOfStudents.size();i++){
            System.out.println(listOfStudents.get(i));
        }



        System.out.println();
        System.out.println();

        System.out.println("After sorting with Comparable for names...");
        Collections.sort(listOfStudents);
        for (Student s:listOfStudents) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println();

        System.out.println("After sorting with Comparator for numbers...");
        Collections.sort(listOfStudents,new StudentNoComparator());
        for (Student s:listOfStudents) {
            System.out.println(s);
        }






    }

}
