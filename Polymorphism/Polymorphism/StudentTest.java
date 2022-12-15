package CokSekillilik;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries: ");
        int registerCount=sc.nextInt();

        for(int i=0; i <registerCount; i ++){
            Student student = registrationOffice.getAStudent();      //
            registrationOffice.registerStudent(student);
            String a = student.toString();
            System.out.println(a);

        }


    }

}
