package calc;

import java.util.Scanner;

/*
калькулятор принимает на вход поочередно:
1- целое число
2- знак математического действия (сложение, вычитание, деление, умножение)
3- целое число
Затем проводит действия между числами на основе заданного действия
Учесть деление на 0, отдать ошибку (если смогёшь, то exception, гугль попробуй спросить (: )
Желательно отдельно написать методы для каждой операции, а не в одном методе ( если разберешься)
getCalcResult() - должен отдавать на выход строку в формате Result = 4.
*если в одном из входных параметров передано "exit" - то программа должна выйти. (System.exit(0))
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getCalcResult();
    }

    private static void getCalcResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели: " + a);
        System.out.println("Введите операцию: ");
        String act = scanner.next();
        System.out.println("Второе целое число: ");
        int b = scanner.nextInt();
        System.out.println("Вы ввели: " + b);
        System.out.println("Результат = " + result(a, b, act));

        static String result(int a, int b, String act){
            switch(act) {
                case "+":
                    return String.valueof(a + b);
                case "-":
                    return String.valueOf(a - b);
                case "*":
                    if (a == 0||b = 0){
                        return String.valueOf(0);
                    }else{
                        return String.valueOf(a * b);
                    }
                case "/":
                    if (b == 0) {
                        return byZero(a);
                    }else{
                        return String.valueOf(a / b);
                    }
                default:
                    return String.valueOf(0);
            }
        }
        static String byZero(int a) {return String.valueof("Ошибка");}
    }


}
