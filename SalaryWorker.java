public class SalaryWorker extends Worker {

    double salary;
    public SalaryWorker(String IDNum, String firstName, String lastname, String title, int YOB) {
        super(IDNum, firstName, lastname, title, YOB);
    }

    public double WeeklyPay() {
        return salary / 52;
    }
    @Override
    public void displayWeeklyPay() {
        double pay = WeeklyPay();
        System.out.println(fullName() + " earning $" + pay + " per week out of $" + salary + " per year");
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
