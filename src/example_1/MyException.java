package example_1;

public class MyException extends Exception{
    private String value;

    public MyException(String value) {
        this.value = value;
    }

    public String getMessage() {
        return "Нельзя использовать " + value;
    }
}
