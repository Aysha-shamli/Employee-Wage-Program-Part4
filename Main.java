package EmployyeWage;
public class Main {
    public static void main(String[] args) {
        System.out.println(Display.welcomeMessage);

        Attendance.checkAttendance("Employee1");
        Attendance.checkAttendance("Employee2");

        dailyWage.calculateDailyWage(20, 8);
    }
}
