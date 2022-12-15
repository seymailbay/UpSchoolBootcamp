package CokSekillilik;

import java.util.Date;

public class GraduateStudent extends Student{
    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public void study() {
       super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    public void writeThesis(){
        System.out.println("He/She is writing a thesis.");

    }

    public void meetWithAdvisor(){
        System.out.println(getName() + " is meeting with advisor " + getAdvisor());

    }

}
