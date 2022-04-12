import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        number1 = number1 * 1000;
        number2 = number2 * 1000;

        int number1Int = (int)number1;
        int number2Int = (int)number2;

        int comparatorResult = number1Int - number2Int;

        if(comparatorResult == 0){
            return true;
        }
        return false;
    }
}

