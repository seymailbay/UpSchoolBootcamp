package SiradisiDurumYont;

    public class Employee {

        private String name;
        private int workDay;

        private int dailyWage;


        public Employee(String name, int workDay, int dailyWage) {
            this.name = name;
            this.workDay = workDay;
            this.dailyWage = dailyWage;
        }

        public int calculateSalary(){

            return (getWorkDay()*getDailyWage());

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWorkDay() {
            return workDay;
        }

        public void setWorkDay(int workDay) {
            this.workDay = workDay;
        }

        public int getDailyWage() {
            return dailyWage;
        }

        public void setDailyWage(int dailyWage) {
            this.dailyWage = dailyWage;
        }
    }



