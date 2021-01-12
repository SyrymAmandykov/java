import org.w3c.dom.ls.LSOutput;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.lang.Throwable;
import java.io.IOException;
import java.math.*;

public class Calculator {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        BigDecimal number1;
        BigDecimal number2;
        boolean onemore = true;
        while (onemore) {
            try {
                number1 = getInt();
                number2 = getInt();
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("ошибка 404");
                return;
            }
            String operation = getOperation();
            calc(number1, number2, operation);
            System.out.println("Это все? + y/n ");

            if (!s.next().equals("n")) {
                onemore = false;
            }
        }
    }
    private static void calc(BigDecimal number1, BigDecimal number2, String operation) {
        if(operation.equals("+")){
            System.out.println("Ваш результат: " + (number1.add(number2)));
        }
        if(operation.equals("-")){
            System.out.println("Ваш результат: " + (number1.subtract(number2)));
        }
        if(operation.equals("*")){
            System.out.println("Ваш результат: " + (number1.multiply(number2)));
        }
        if(operation.equals("/")){
            System.out.println("Ваш результат: " + (number1.divide(number2)));
        }
        if(!operation.equals("+")
                && !operation.equals("-")
                && !operation.equals("*")
                && !operation.equals("/")) {
            System.out.println("Ваш результат: " + "Ошибка" );
        }
    }

    private static String getOperation() {
        System.out.println("Введите операцию: ");
        return s.next();
    }

    public static BigDecimal getInt() {
        String test;
        System.out.println("Введите число:");
        test = s.next();
        BigDecimal test2 = new BigDecimal(test);
        return test2;
    }
}
