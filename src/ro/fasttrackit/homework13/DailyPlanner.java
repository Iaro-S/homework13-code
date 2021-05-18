package ro.fasttrackit.homework13;

import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> activities = new ArrayList<>();

    public DailyPlanner(Collection<DaySchedule> activities) {
        this.activities.addAll(activities);
    }

    public List<List<DaySchedule>> addActivity(Days day, String newActivity) {
        List<List<DaySchedule>> result = new ArrayList<>();
        for (DaySchedule activity : activities) {
            if (activity.getDay().equals(day) && activity.getActivities() == null) {
                List<DaySchedule> newList = new ArrayList<>(day,addDailyActivity(newActivity));
                result.add(newList);
            }
        }
        return result;
    }

    private List<String> addDailyActivity(String newActivity, DaySchedule activity, Days day) {
        if (activity.getDay().equals(day)) {
            List<String> newList = new ArrayList<>(activity.getActivities());
            System.out.println(newList + " old list");
            if (activity.getActivities() == null) {
                newList = new ArrayList<>();
            }
            newList.add(newActivity + " new list");
            System.out.println(newList);
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