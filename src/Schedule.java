import java.util.Optional;
import java.util.TreeSet;

public class Schedule {
    private TreeSet<Seance> seances;

    public Schedule() {
        this.seances = new TreeSet<>();
    }

    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        seances.remove(seance);
    }

    public Optional<TreeSet<Seance>> getSeances() {
        return Optional.ofNullable(seances);
    }

    public void setSeances(TreeSet<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}