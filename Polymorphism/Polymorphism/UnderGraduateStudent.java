package CokSekillilik;

import java.util.Date;

public class UnderGraduateStudent extends Student {
    protected  String minor;


    public UnderGraduateStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }


}

