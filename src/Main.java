import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static Supplier<Days> daysSupplier = () -> {
        System.out.print("Input day of week: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (Days day : Days.values()) {
            if (day.toString().equalsIgnoreCase(string)) {
                return day;
            }
        }
        return Days.valueOf("MONDAY");
    };


    public static void main(String[] args) {
        System.out.println("Input time when cinema open");
        Time cinemaOpens = Time.getTimeSupplier();
        System.out.println("Input time when cinema close");
        Time cinemaCloses = Time.getTimeSupplier();
        Cinema cinema = new Cinema(cinemaOpens,cinemaCloses);
        System.out.print("Make your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        while (!choice.equalsIgnoreCase("quit")) {
            switch (choice) {
                case "1":
                    System.out.println("You are adding seance to the cinema: ");
                    cinema.addSeance(Seance.getSeanceSupplier(), daysSupplier.get());
                    break;
                case "2":
                    System.out.println("You are adding movie to the cinema library:");
                    cinema.addMovie(Movie.getMovieSupplier());
                    break;
                case "3":
                    System.out.println("You are removing seance from the cinema:");
                    cinema.removeSeance(Seance.getSeanceSupplier(), daysSupplier.get());
                    break;
                case "4":
                    System.out.println("You are removing movie from the cinema library:");
                    cinema.removeMovie(Movie.getMovieSupplier());
                    break;
                case "5":
                    System.out.println("All movies:");
                    cinema.getMovieLibrary().forEach(x -> System.out.println("\t" + x));
                    break;
                case "6":
                    System.out.println("All schedules");
                    Iterator<Map.Entry<Days, Schedule>> iterator = cinema.getDaysScheduleTreeMap().entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<Days, Schedule> next = iterator.next();
                        System.out.println(next.getKey() + "\nMovies:");
                        next.getValue().getSeances().get().forEach(x -> System.out.println("\t" + x));
                    }

                    break;
                case "7":
                    System.exit(0);
                    break;

            }
            System.out.println("Make your choice again");
            choice = scanner.nextLine();

        }
    }
}