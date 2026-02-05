public class Worker extends Person {

   private double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastname, String title, int YOB) {
        super(IDNum, firstName, lastname, title, YOB);
    }

    public double WeeklyPay(double hoursWorked){
       return hourlyPayRate * hoursWorked;
    }

    public void displayWeeklyPay(){
        double pay = WeeklyPay(40);
        System.out.println(fullName() + " earning $" + pay + " per week");
    }

@Override
    public String toCSVRecord() {
        return super.toCSVRecord() + "," + hourlyPayRate;
    }

    @Override
    public String toJSONRecord() {
        return super.toJSONRecord() + ",\"" + hourlyPayRate + "\"";
    }
    @Override
    public String toXML() {
        return super.toXML() + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>";
    }
}
