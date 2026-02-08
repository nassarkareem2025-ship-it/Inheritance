public class Worker extends Person {

   private double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastname, String title, int YOB) {
        super(IDNum, firstName, lastname, title, YOB);
    }


public void setHourlyPayRate(double rate){
        this.hourlyPayRate = rate;
}



    public double WeeklyPay(double hoursWorked){
       if(hoursWorked <= 40) {
           return hourlyPayRate * hoursWorked;
       }
       else{
           double regPay = hourlyPayRate * 40;
           double overtimePay = hourlyPayRate * 1.5 * (hoursWorked - 40);
           return regPay + overtimePay;

       }
    }

    public void displayWeeklyPay(double hoursWorked){
        double pay = WeeklyPay(hoursWorked);
        if(hoursWorked <= 40) {
            System.out.println(fullName() + " earning $" + pay + " per week");
        }else{
                double regPay = hourlyPayRate * 40;
                double overtimeHours = hoursWorked - 40;
                double overtimePay = hourlyPayRate * 1.5 * overtimeHours;
                double totalPay = regPay + overtimePay;

                System.out.printf("%s:%n", fullName());
                System.out.printf("  Regular Hours: 40 at $%.2f = $%.2f%n", hourlyPayRate, regPay);
                System.out.printf("  Overtime Hours: %.0f at $%.2f = $%.2f%n", overtimeHours, (hourlyPayRate * 1.5), overtimePay);
                System.out.printf("  Total Pay: $%.2f%n", totalPay);
        }
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
