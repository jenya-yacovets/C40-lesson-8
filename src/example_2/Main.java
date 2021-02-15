package example_2;

public class Main {
    public static void main(String[] args) {

        try {
            int result = Calculation.calc(4);
            System.out.println(result);
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}