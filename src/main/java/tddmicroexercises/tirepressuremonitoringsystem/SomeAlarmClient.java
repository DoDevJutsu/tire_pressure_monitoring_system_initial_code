package tddmicroexercises.tirepressuremonitoringsystem;

public class SomeAlarmClient {

    public static void main(String[] args) {
        someCodeUsingAlarm();
        moreCodeUsingAlarm();
    }

    private static void someCodeUsingAlarm() {
        Alarm alarm = new Alarm();
        alarm.check();
        System.out.println("Some code using " + alarm.isAlarmOn());
    }

    private static void moreCodeUsingAlarm() {
        Alarm alarm = new Alarm();
        alarm.check();
        System.out.println("Other code using " + alarm.isAlarmOn());
    }
}
