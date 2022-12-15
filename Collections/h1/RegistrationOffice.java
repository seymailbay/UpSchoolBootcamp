package Collections.Odev1;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RegistrationOffice {


    public RegistrationOffice() {
    }

    Random rand = new Random();
    int no = rand.nextInt(500);


    public Student getAStudent() {
        Student student = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the status of student ");
        System.out.println("Press 1 = Undergraduate Student \n Press 2 = Master Student \n Press 3 = Phd Student \n Press 4 = Vocational Student ");
        int studentStatus = sc.nextInt();






    switch(studentStatus){

        case 1:
            no=rand.nextInt(500);
            student = new UnderGraduateStudent(no, "Seyma", 2022, new Date(), "English Language and Literature");
            break;
        case 2:
            no=rand.nextInt(500);
            student = new MasterStudent(no, "Baris", 2022, new Date(), "Software Engineering", "Murat", "Thesis num 12");
            break;
        case 3:
            no=rand.nextInt(500);
            student = new PhdStudent(no, "Melisa", 2022, new Date(), "Turkish Language and Literature", "Mustafa", "Thesis 35", true);
            break;
        case 4:
            no=rand.nextInt(500);
            student = new VocationalStudent(no, "Batuhan", 2022, new Date(),"History");
            break;
    }
    return student;

    }



    public void registerStudent(Student student){
        if (student instanceof UnderGraduateStudent){
            UnderGraduateStudent  underGraduateStudent= (UnderGraduateStudent) student;// undergraduate student gibi davran diyoruz aslında studenta. Downcasting
            System.out.print(underGraduateStudent.getName());
            underGraduateStudent.study();
            underGraduateStudent.register();

        }
        else if(student instanceof MasterStudent){
            MasterStudent masterStudent = (MasterStudent) student;
            System.out.print(masterStudent.getName());
            masterStudent.study();
            masterStudent.register();
            masterStudent.writeThesis();
            masterStudent.meetWithAdvisor();
        }
        else if (student instanceof  PhdStudent){
            PhdStudent phdStudent = (PhdStudent) student;
            System.out.print(phdStudent.getName());
            phdStudent.study();
            phdStudent.register();
            phdStudent.writeThesis();
            phdStudent.meetWithAdvisor();
        } else if (student instanceof VocationalStudent) {
            VocationalStudent vocationalStudent=(VocationalStudent) student;
            System.out.print(vocationalStudent.getName());
            vocationalStudent.study();
            vocationalStudent.register();


        }
    }
}
