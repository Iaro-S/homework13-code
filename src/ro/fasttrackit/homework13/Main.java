package ro.fasttrackit.homework13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule(Days.MONDAY, List.of("activity1", "activity2", "activity3")),
                new DaySchedule(Days.TUESDAY, List.of("activity1")),
                new DaySchedule(Days.FRIDAY, List.of("activity1", "activity2", "activity3", "activity4"))
        ));
        System.out.println(dailyPlanner + "\n");
        System.out.println(dailyPlanner.addActivity(Days.SUNDAY, "activity4") + "\n");
        System.out.println(dailyPlanner + "\n");
    }
}
