package ro.fasttrackit.homework13;

import java.util.*;

public class DailyPlanner {
    private final List<DaySchedule> daySchedule = new ArrayList<>();

    public void addActivity(Days day, String activity) {
        if (activity == null) {
            throw new NoActivityException("activity is null");
        }
        var foundSchedule = getDaySchedule(day);
        if (foundSchedule == null) {
            foundSchedule = new DaySchedule(day);
            daySchedule.add(foundSchedule);
        }
        foundSchedule.addActivity(activity);
    }

    public DaySchedule getDaySchedule(Days day) {
        for (DaySchedule schedule : daySchedule) {
            if (schedule.getDay() == day) {
                return schedule;
            }
        }
        return null;
    }

    public void removeActivity(Days day, String activity) {
        DaySchedule daySchedule = getDaySchedule(day);
        if (daySchedule == null || !daySchedule.containsActivity(activity)) {
            throw new NoActivityException("Day " + day + " doesn't have activity");
        } else {
            daySchedule.removeActivity(activity);
        }
    }

    public List<String> getActivities(Days day) {
        DaySchedule schedule = getDaySchedule(day);
        if (schedule != null) {
            return schedule.getActivities();
        } else {
            return List.of();
        }
    }

    public Map<Days, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<Days, List<String>> result = new HashMap<>();
        for (Days day : Days.values()) {
            DaySchedule schedule = getDaySchedule(day);
            if (schedule == null || schedule.getActivities().isEmpty()) {
                throw new NoActivitiesForDayException("no activities for " + day);
            }
            result.put(schedule.getDay(), schedule.getActivities());
        }
        return result;
    }
}