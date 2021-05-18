package ro.fasttrackit.homework13;

import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Days day;
    private final List<String> activities;

    public DaySchedule(Days day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public Days getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DaySchedule)) return false;
        DaySchedule that = (DaySchedule) o;
        return getDay() == that.getDay() && Objects.equals(getActivities(), that.getActivities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getActivities());
    }
}