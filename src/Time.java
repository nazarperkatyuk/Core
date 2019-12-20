import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;

public class Time implements Comparable<Time>{
    private int minutes;
    private int hours;
    private Optional<Time> isTimePresent;
    private static Supplier<Time> timeSupplier = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hours: ");
        int h = scanner.nextInt();
        System.out.print("Input minutes: ");
        int m = scanner.nextInt();
        Time res = new Time(h, m);
        if (res.isTimePresent.isPresent()) {
            return res;
        } else {
            System.out.println("\nEmpty time");
            return res;
        }
    };

    public Time(int hours, int minutes) {
        isTimePresent = Optional.of(this);
        setHours(hours);
        setMinutes(minutes);
    }
    public Time(){
        this.hours = 0;
        this.minutes = 0;
    }

    public int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) {
        if (isTimePresent.isPresent()) {
            try {
                if (minutes < 0 || minutes >= 60) {
                    isTimePresent = Optional.empty();
                    throw new IllegalArgumentException();
                }
                this.minutes = minutes;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value for minutes");
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }

    public int getHours() {
        return hours;
    }

    private void setHours(int hours) {
        try {
            if (minutes < 0 || minutes >= 24) {
                isTimePresent = Optional.empty();
                throw new IllegalArgumentException();
            }
            this.hours = hours;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value for hours");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public Optional<Time> getIsTimePresent() {
        return isTimePresent;
    }

    public static Time getTimeSupplier() {
        return timeSupplier.get();
    }

    @Override
    public String toString() {
        return String.format("%s:%s", hours, minutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return minutes == time.minutes &&
                hours == time.hours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours);
    }

    @Override
    public int compareTo(Time o) {
        return (hours - o.getHours())*60 +(minutes - o.getMinutes());
    }
}