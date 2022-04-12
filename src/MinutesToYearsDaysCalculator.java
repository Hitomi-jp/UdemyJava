public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long days = (minutes / 60) / 24;
            long remainingDays = days % 365;
            long year = days / 365;

            String yearString = year + " y and ";
            if (year < 0) {
                System.out.print("Invalid Value");
            }
            System.out.print(minutes +" min = " + yearString);

            String daysString = remainingDays + " d";
            if (days < 0) {
                System.out.println("Invalid Value");
            }
            System.out.println(daysString);
        }
    }
}
