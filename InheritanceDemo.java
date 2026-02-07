import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        Worker john = new Worker("1077", "John", "Doe", "Mr.", 1995);
        Worker Kareem = new Worker("1078", "Kareem", "Nassar", "Mr.", 2007);
        Worker Joe = new Worker("1079", "Joe", "Johnson", "Mr.", 2000);

        SalaryWorker Jake = new SalaryWorker("1080", "Jake", "Williams", "Mr.", 2005);
        SalaryWorker Jason = new SalaryWorker("1081", "Jason", "Smith", "Mr.", 2002);
        SalaryWorker Jill = new SalaryWorker("1082", "Jill", "Jones", "Ms.", 1998);




        ArrayList<Worker> Workers = new ArrayList<Worker>();
        Workers.add(john);
        Workers.add(Kareem);
        Workers.add(Joe);
        Workers.add(Jake);
        Workers.add(Jason);
        Workers.add(Jill);

        int[] WeeklyHours = {40, 50, 40};

       john.setHourlyPayRate(25.00);
       Kareem.setHourlyPayRate(35.00);
       Joe.setHourlyPayRate(30.00);
       Jake.setAnnualSalary(125000.00);
       Jason.setAnnualSalary(111000.00);
       Jill.setAnnualSalary(110000.00);

        System.out.printf("%-12s %-12s %-12s %-12s%n","Name", "week1", "week2", "week3");
        System.out.println("=========================================================");

        for(Worker Worker : Workers){

            double week1 = Worker.WeeklyPay(WeeklyHours[0]);
            double week2 = Worker.WeeklyPay(WeeklyHours[1]);
            double week3 = Worker.WeeklyPay(WeeklyHours[2]);

            System.out.printf("%-12s %-12.2f %-12.2f %-12.2f%n",Worker.getFirstName(),week1,week2,week3);
        }

        System.out.println("\n\nWeek2 Detailed Pay Breakdown (50 hours):");
        System.out.println("=========================================================");
        for(Worker worker : Workers){
            worker.displayWeeklyPay(WeeklyHours[1]);
        }




    }
}
