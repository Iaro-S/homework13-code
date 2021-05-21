package ro.fasttrackit.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Days day;
    private final List<String> activities;

    public DaySchedule(Days day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public Days getDay() {
        return day;
    }

    public List<String> getActivities() {
        return new ArrayList<>(activities);
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    public boolean containsActivity(String activity) {
        return activities.contains(activity);
    }
}