package lab_03;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab03, 100 point Version\n");

        int miliseconds = 10000123;
        int mili_seconds_remainder = miliseconds % 1000;
        int seconds = miliseconds / 1000;
        int hours = seconds / 3600;
        int hours_remainder = seconds % 3600;
        int minutes = hours_remainder / 60;
        int seconds_remainder = hours_remainder % 60;

        System.out.println("Starting mili-seconds: " + miliseconds);
        System.out.println("Hours:                 " + hours);
        System.out.println("Minutes:               " + minutes);
        System.out.println("Seconds:               " + seconds_remainder);
        System.out.println("Mili-seconds:          " + mili_seconds_remainder);

    }

}
