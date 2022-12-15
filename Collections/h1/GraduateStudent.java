package Collections.Odev1;

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

    public void study() {
        System.out.println("Student is studying...");
    }

    @Override
    public void register() {
        System.out.println("Student registered. ");
    }

    public void writeThesis(){
        System.out.println("He/She is writing a thesis.");

    }

    public void meetWithAdvisor(){
        System.out.println(getName() + " is meeting with advisor " + getAdvisor());

    }


}
