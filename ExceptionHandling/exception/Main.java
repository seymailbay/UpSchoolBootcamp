package SiradisiDurumYont;

import ExceptionHandling.Engineer;
import ExceptionHandling.Manager;

public class Main {
    public static void checkSalary(double salary) throws SalaryPaidOnBankException {

        if (salary > 7000) {

            throw new SalaryPaidOnBankException("Salary Paid on Bank");

        } else {

            System.out.println("Your salary is paid in cash");
        }
    }


    public static void main(String[] args) {

        ExceptionHandling.Engineer engineer1 = new ExceptionHandling.Engineer("Kemal", 20, 200);
        ExceptionHandling.Engineer engineer2 = new Engineer("Asya", 15, 150);
        ExceptionHandling.Manager manager1 = new Manager("Kezban", 20, 5000);

        double salary = manager1.calculateSalary();




        try {
            checkSalary(salary);

        } catch (SalaryPaidOnBankException e) {
            System.out.println(e);
        }

    }

}
