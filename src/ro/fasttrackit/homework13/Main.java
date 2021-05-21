package ro.fasttrackit.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedule mySchedule = new DaySchedule(Days.MONDAY);
        List<String> act = mySchedule.getActivities();
        System.out.println();
        act.add("hackerman");
        System.out.println(mySchedule.getActivities());
        System.out.println(act);
        mySchedule.addActivity("running");
        System.out.println(mySchedule.getActivities());
        DailyPlanner planer = new DailyPlanner();
        planer.addActivity(Days.THURSDAY, "inot");
        planer.addActivity(Days.THURSDAY, "chitara");
        System.out.println(planer.getDaySchedule(Days.THURSDAY));
        planer.removeActivity(Days.THURSDAY, "inot");
        System.out.println(planer.getDaySchedule(Days.THURSDAY));
//		planer.removeActivity(Day.THURSDAY, "crosetat");
        System.out.println(planer.getDaySchedule(Days.THURSDAY));
        try {
            System.out.println(planer.endPlanning());
        } catch (NoActivitiesForDayException er) {
            System.err.println(er.getMessage());
        }
    }
}
