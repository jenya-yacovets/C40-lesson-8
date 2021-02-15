package example_2;

public class Calculation {
    public static int calc (int a) throws MyException {
        if (a == 4) {
            throw new MyException("Число " + a);
        }
        return a*a;
    }
}
