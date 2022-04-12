public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){

        int leapYear = year % 4;
        int leapYear100 = year % 100;
        int leapYear400 = year % 400;

        if(leapYear == 0 && year >= 1 && year <= 9999){
            if(leapYear100 == 0){
                if(leapYear400 == 0){
                    return true;
                } else{
                    return false;
                }
            } else{
                return true;
            }
        }else {
            return false;
        }
    }
}
