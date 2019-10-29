package Task1;

public class WorkerMonthlySalary implements Salary  {

    private int day;
    private int hours;
    private int premium;

    public WorkerMonthlySalary (int day, int hours, int premium) {
        this.day = day;
        this.hours = hours;
        this.premium = premium;
    }
    @Override
    public void salary() {
        System.out.println(String.format("Зарплата працівника з урахуванням премії: ",  day )+(day * hours + premium));
    }
}


