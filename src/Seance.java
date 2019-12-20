import java.util.Objects;
import java.util.function.Supplier;

public class Seance implements Comparable<Seance> {
    private static Supplier<Seance> seanceSupplier = () -> new Seance(Movie.getMovieSupplier(), Time.getTimeSupplier());
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
        movie = new Movie();

    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        if (startTime.getIsTimePresent().isPresent()) {
            this.endTime = new Time(startTime.getMinutes() + this.movie.getDuration().getMinutes(),
                    startTime.getHours() + this.movie.getDuration().getHours());
        }
    }

    public static Seance getSeanceSupplier() {
        Movie movieS = Movie.getMovieSupplier();
        System.out.println("Input when movie starts:");
        Time timeS = Time.getTimeSupplier();
        return new Seance(movieS,timeS);
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return String.format("%s, starts in %s ends in %s", movie, startTime, endTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public int compareTo(Seance o) {
        return (this.startTime.getHours() - o.startTime.getHours()) * 60 + (this.startTime.getMinutes() - o.startTime.getMinutes());
    }
}