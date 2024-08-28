package sdet_assignments;

import java.lang.reflect.Method;
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        try {
          
            Calculator calculator = new Calculator();

            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter method name (add/subtract):");
            String methodName = scanner.nextLine();
            System.out.println("Enter first parameter (int):");
            int param1 = scanner.nextInt();
            System.out.println("Enter second parameter (int):");
            int param2 = scanner.nextInt();

            
            Method method = Calculator.class.getMethod(methodName, int.class, int.class);

            
            Object result = method.invoke(calculator, param1, param2);

           
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
