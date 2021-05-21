package ro.fasttrackit.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedule mySchedule = new DaySchedule(Days.MONDAY);
        List<String> act = mySchedule.getActivities();
        System.out.println();
        act.add("Hackermann");
        System.out.println(mySchedule.getActivities());
        mySchedule.addActivity("activity1");
        System.out.println(mySchedule.getActivities());
        DailyPlanner planer = new DailyPlanner();
        planer.addActivity(Days.THURSDAY, "Activity2");
        System.out.println(planer.getDaySchedule(Days.THURSDAY));
        planer.addActivity(Days.SUNDAY, "Activity3");
        System.out.println(planer.getDaySchedule(Days.FRIDAY));
        planer.removeActivity(Days.THURSDAY, "Activity2");
        System.out.println(planer.getDaySchedule(Days.THURSDAY));
        planer.removeActivity(Days.MONDAY, "test");
        System.out.println(planer.getActivities(Days.MONDAY));
        try {
            System.out.println(planer.endPlanning());
        } catch (NoActivitiesForDayException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
