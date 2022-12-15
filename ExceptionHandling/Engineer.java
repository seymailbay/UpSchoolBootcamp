package ExceptionHandling;

public class Engineer extends Employee{

    public Engineer(String name, int workDay, int dailyWage) {
        super(name, workDay, dailyWage);
    }


    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
