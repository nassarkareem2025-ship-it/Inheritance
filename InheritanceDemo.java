import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        Worker john = new Worker("1077", "John", "Doe", "Mr.", 1995);
        Worker Kareem = new Worker("1078", "Kareem", "Smith", "Mr.", 2007);
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

        for(Worker Worker : Workers){

            double week1 = WeeklyHours[0] * Worker.hourlyPayRate;
        }



    }
}
