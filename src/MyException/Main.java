package MyException;

public class Main {
public static void ex() throws MyException{
    System.out.println("Здесь моя ошибка!");
    throw new MyException();

}
    public static void main(String[] args) {
    try {
        ex();
    } catch (MyException e){
        e.printStackTrace(System.err);
    }
    }
}
