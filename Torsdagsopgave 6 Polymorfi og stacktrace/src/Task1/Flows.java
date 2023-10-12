package Task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        System.out.println("A");
        if (input.equals("Hej")) {
            System.out.println("V");
            methodB("Hej");
        }
    }

    public void methodB(String Hej) {
        System.out.println("A");
    }

    public void methodC(String input) {
        System.out.println("E");
        if (input.equals("Farvel")) {
            System.out.println("N");
        } else {
            System.out.println("R");
        }
    }

    public void methodD(int number) {
        System.out.println("S");
        System.out.println("J");
        if (number < 30 || number > 20) {
            System.out.println("O");
        }
        System.out.println("V");

        if (number == 25) {
            System.out.println("K");
        } else {
            System.out.println("T");
        }
    }
}
