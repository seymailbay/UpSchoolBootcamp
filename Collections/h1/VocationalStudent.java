package Collections.Odev1;

import java.util.Date;

public class VocationalStudent extends Student {
    public VocationalStudent(int no, String name, int year, Date dob,String major) {
        super(no, name, year, dob,major);
    }

    @Override
    public void study() {
        System.out.println("Student is studying...");
    }

    @Override
    public void register() {
        System.out.println("Student registered. ");
    }


}
