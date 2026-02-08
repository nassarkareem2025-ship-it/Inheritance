public class SalaryWorker extends Worker {

   double salary;

    public SalaryWorker(String IDNum, String firstName, String lastname, String title, int YOB) {
        super(IDNum, firstName, lastname, title, YOB);
    }

    public double WeeklyPay(double hoursWorked) {
        return salary / 52;
    }

    public void setAnnualSalary(double salary){
        this.salary = salary;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked){
        double weeklyPay = WeeklyPay(hoursWorked);
        System.out.printf("%s: Annual Salary: $%.2f, Weekly Pay: $%.2f (1/52 of annual)%n",
                fullName(), salary, weeklyPay);

    }

    @Override
    public String toCSVRecord() {
        return super.toCSVRecord() + "," + salary;
    }
    @Override
    public String toJSONRecord() {
        return super.toJSONRecord() + ",\"" + salary + "\"";
    }
    @Override
    public String toXML() {
        return super.toXML() + "<salary>" + salary + "</salary>";
    }
}
