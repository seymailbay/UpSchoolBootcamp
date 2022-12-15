package ExceptionHandling;

public class Main {

    public static void checkSalary(double salary) throws Exception {

        if (salary > 7000) {

            throw new Exception();

        } else {

            System.out.println("Your payment paid cash");
        }
    }

        public static void main(String[] args)  {

        Engineer engineer1 = new Engineer("Kemal",20,200);
        Engineer engineer2 = new Engineer("Asya",15,150);
        Manager manager1= new Manager("Kezban",20,5000);

        double salary = manager1.calculateSalary();


            try{

                checkSalary(salary);
            }

            catch (Exception e){

                System.out.println("Your salary paid on bank " + e) ;
            }
        }


    }




