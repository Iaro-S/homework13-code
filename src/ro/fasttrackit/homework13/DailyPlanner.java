package ro.fasttrackit.homework13;

import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> activities = new ArrayList<>();

    public DailyPlanner(Collection<DaySchedule> activities) {
        this.activities.addAll(activities);
    }

    public List<DaySchedule> addActivity(Days day, String newActivity) {
        List<DaySchedule> result = new ArrayList<>();
        /*for (DaySchedule activity : activities) {
            if (activity.getDay().equals(day) && activity.getActivities() == null) {
                result.add(1, addDailyActivity(day, newActivity));
            }
        }*/
        return result;
    }

    private DaySchedule addDailyActivity(Days day, String newActivity) {
        for (DaySchedule activity : activities) {
            if (activity.getDay().equals(day)) {
                List<String> newList = new ArrayList<>(activity.getActivities());
                if (activity.getActivities() == null) {
                    newList = new ArrayList<>();
                }
                newList.add(newActivity);
            }
        }
        return null;
    }

    public void removeActivity(Days day, String activity) {
    }

    public void getActivities(Days day) {
    }

    public void endPlanning(Map<Days, List<String>> activities) {
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "activities=" + activities +
                '}';
    }
}