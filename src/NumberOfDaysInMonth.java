public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(9000));
        System.out.println(isLeapYear(1924));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));


    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else {
            int leapYearDivided4 = year % 4;
            int leapYearDivided400 = year % 400;
            int leapYearDivided100 = year % 100;
            if (((leapYearDivided4 == 0) && (leapYearDivided100 != 0)) || leapYearDivided400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    numberOfDays = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
                default:
                    numberOfDays = -1;
                    break;
            }
        } else {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    numberOfDays = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
                default:
                    numberOfDays = 0;
                    break;
            }
        }
        return numberOfDays;
    }
}

