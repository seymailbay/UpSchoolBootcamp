package CokSekillilik;

import java.util.Date;

public class VocationalStudent extends Student {
    public VocationalStudent(int no, String name, int year, Date dob,String major) {
        super(no, name, year, dob,major);
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
