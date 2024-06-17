package org.example;


/*
1. Область видимости локальных переменных:Задача: Создайте метод, внутри которого объявлены локальные переменные.
    Попробуйте обратиться к ним вне этого метода и проанализируйте результат.
 */

public class TaskOne {
    public static void main(String[] args) {
        newInt = 1;
    }
    /*
    ошибка компилятора
     java: cannot find symbol
        symbol:   variable newInt
        Область видимости метода, переменные остаются внутри,
        храняться внутри стек фрейма для каждого потока,
        когда поток закончил работу с методом переменные удаляются.
     */
    private void someMethod() {
        int newInt = 0;
        String string = new String();
    }
}
