public class Switch {
    public static void main(String[] args) {
        char charValue = 'G';

        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C':
                System.out.println("C was found");
                break;

            case 'D':
                System.out.println("D was found");
                break;

            case 'E':
                System.out.println("E was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D and E");
                break;
        }
    }
}
