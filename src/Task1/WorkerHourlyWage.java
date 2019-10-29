package Task1;

 public class WorkerHourlyWage  implements Salary {
    private double HourlyPayment;
    private int Hours;

    public WorkerHourlyWage(double HourlyPayment, int Hours) {
        this.HourlyPayment = HourlyPayment;
        this.Hours = Hours;
    }


    @Override
    public void salary() {
        System.out.println("Працівник отримує: " + Hours * HourlyPayment);
    }
}


