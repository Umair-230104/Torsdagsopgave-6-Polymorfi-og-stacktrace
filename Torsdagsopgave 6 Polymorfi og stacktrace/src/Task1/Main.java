package Task1;

public class Main {

    public static void main(String[] args) {
        Flows flows = new Flows();

        System.out.println("flows.methodA(\"Hej\");");
        flows.methodA("Hej");

        System.out.println("flows.methodC(\"aaaa\");");
        flows.methodC("aaaa");

        System.out.println("flows.methodD(29);");
        flows.methodD(29);
    }
}
