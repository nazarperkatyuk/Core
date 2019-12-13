import java.util.Scanner;

public class RunnableThread implements Runnable {

    @Override
    public void run() {

        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.println("\nВведіть кількість чисел Фібоначі: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        int [] fibonachi = new int[numb];
        fibonachi[0] = n1;
        fibonachi[1] = n2;

        for (int i = 0; i < numb; i++) {
            n3 = n2 + n1;
            fibonachi[i] = n3;
            n1 = n2;
            n2 = n3;
        }

        System.out.print("Потік Runnable: ");
        for (int i = numb - 1; i >= 2 ; i--) {
            System.out.print(fibonachi[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(fibonachi[1] + " ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(fibonachi[0] + " ");

    }
}
