package ro.fasttrackit.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Days day;
    List<String> activities;

    public DaySchedule(Days day) {
        this.day = day;
        this.activities = new ArrayList<>(activities);
    }

    public Days getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    public boolean containsActivity(String activity) {
        return activities.contains(activity);
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