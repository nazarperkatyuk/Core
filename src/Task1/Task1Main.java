package Task1;

public class Task1Main {
    public static void main(String[] args) {
        WorkerMonthlySalary workerMonthlySalary = new WorkerMonthlySalary(24, 196, 350) ;
        WorkerHourlyWage  workerHourlyWage = new WorkerHourlyWage (20, 200);

        workerMonthlySalary.salary();
        workerHourlyWage.salary();


    }


}
