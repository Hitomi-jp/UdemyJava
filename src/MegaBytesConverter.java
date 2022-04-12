public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = 0;
        int remainingKiloBytes = 0;

        megabytes = kiloBytes / 1024;
        remainingKiloBytes = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
