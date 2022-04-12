public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milsPerHour = 0;
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            milsPerHour = Math.round(kilometersPerHour / 1.609);
            return milsPerHour;
        } else
            return 0;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
