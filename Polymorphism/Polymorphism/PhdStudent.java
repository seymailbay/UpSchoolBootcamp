package CokSekillilik;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

    boolean qualifyingExam;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExam) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExam = qualifyingExam;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    @Override
    public void writeThesis() {
        super.writeThesis();

    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    void writePaper(){

    }
}
