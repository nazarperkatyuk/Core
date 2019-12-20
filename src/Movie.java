import java.util.Objects;
import java.util.Scanner;
import java.util.function.Supplier;

public class Movie {
    private String title;
    private Time duration;
    private static Supplier<Movie> movieSupplier = () -> {

        System.out.print("Input Title of movie: ");
        Scanner scanner = new Scanner(System.in);
        String titl = scanner.nextLine();
        System.out.print("Input duration of movie: \n");
        return new Movie(titl,Time.getTimeSupplier());
    };

    public Movie(){
        duration = new Time();
    }

    public Movie(String title, Time duration) {
        this.title = title;
        if (duration.getIsTimePresent().isPresent()) {
            this.duration = duration;
        }
    }

    public String getTitle() {
        return title;
    }

    public Time getDuration() {
        return duration;
    }

    public static Movie getMovieSupplier() {
        return movieSupplier.get();
    }

    @Override
    public String toString() {
        return "Title: " + title + ", duration: " + duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(duration, movie.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}