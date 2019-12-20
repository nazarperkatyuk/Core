import java.util.*;

public class Cinema {
    private ArrayList<Movie> movieLibrary;
    private TreeMap<Days, Schedule> daysScheduleTreeMap;
    private Time openTime;
    private Time closeTime;

    public Cinema(Time openTime, Time closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        daysScheduleTreeMap = new TreeMap<>();
        movieLibrary = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movieLibrary.add(movie);
    }


    public void addSeance(Seance seance, Days day) {
        Optional<Days> thatDay = daysScheduleTreeMap.keySet().stream().filter(x -> x.compareTo(day) == 0).findFirst();
        if (thatDay.isPresent()) {
            daysScheduleTreeMap.get(thatDay.get()).addSeance(seance);
            if (!movieLibrary.contains(seance.getMovie())) {
                movieLibrary.add(seance.getMovie());
            }
        } else {
            boolean isDayExists = false;
            for (Days item : Days.values()) {
                if (item.compareTo(day) == 0) {
                    isDayExists = true;
                    Schedule schedule = new Schedule();
                    if (isCinemaFree(day, seance.getStartTime(), seance.getEndTime())) {
                        schedule.addSeance(seance);
                        daysScheduleTreeMap.put(day, schedule);
                        if (!movieLibrary.contains(seance.getMovie())) {
                            movieLibrary.add(seance.getMovie());
                        }
                    }
                }
            }
            if (!isDayExists) {
                System.out.println("There is not such a day");
            }
        }
    }

    public void removeMovie(Movie movie) {
        Iterator<Map.Entry<Days, Schedule>> iterator = daysScheduleTreeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            Iterator<Seance> iterator1 = next.getValue().getSeances().get().iterator();
            while (iterator1.hasNext()) {
                Seance next1 = iterator1.next();
                if (next1.getMovie().equals(movie)) {
                    iterator1.remove();
                }
            }
        }
        movieLibrary.remove(movie);
    }

    public void removeSeance(Seance seance, Days day) {
        Optional<Days> thatDay = daysScheduleTreeMap.keySet().stream().filter(x -> x.compareTo(day) == 0).findFirst();
        if (thatDay.isPresent()) {
            daysScheduleTreeMap.get(thatDay.get()).removeSeance(seance);
        } else {
            System.out.println("There is not such a day");
        }
    }

    public boolean isCinemaFree(Days day, Time begin, Time end) {
        if (openTime.compareTo(begin) <= 0
                && closeTime.compareTo(begin) >= 0
                && openTime.compareTo(end) <= 0
                && closeTime.compareTo(end) >= 0) {
            Schedule schedule = daysScheduleTreeMap.get(day);
            Optional<TreeSet<Seance>> treeSetOptional = Optional.empty();
            try {

                treeSetOptional = schedule.getSeances();
            } catch (NullPointerException e) {
                schedule = new Schedule();
                schedule.setSeances(new TreeSet<>());
            }

            if (treeSetOptional.isPresent()) {
                return schedule.getSeances().get().last().getEndTime().compareTo(begin) <= 0;
            }
            return true;

        }
        return false;
    }

    public TreeMap<Days, Schedule> getDaysScheduleTreeMap() {
        return daysScheduleTreeMap;
    }

    public void setDaysScheduleTreeMap(TreeMap<Days, Schedule> daysScheduleTreeMap) {
        this.daysScheduleTreeMap = daysScheduleTreeMap;
    }

    public ArrayList<Movie> getMovieLibrary() {
        return movieLibrary;
    }

    public void setMovieLibrary(ArrayList<Movie> movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Time getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Time closeTime) {
        this.closeTime = closeTime;
    }
}