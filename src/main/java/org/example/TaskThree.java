package org.example;
/*
3. Глобальные переменные:
Задача: Объявите глобальную переменную в классе.
Используйте ее в различных методах и убедитесь, что она видна везде в классе.
 */
public class TaskThree {
    public int someGlobalField = 99;


    public static void main(String[] args) {
      TaskThree taskThree = new TaskThree();
        System.out.println(taskThree.someGlobalField);
        taskThree.iPrint();
        System.out.println(taskThree.someGlobalField);
        taskThree.iChange();
        System.out.println(taskThree.someGlobalField);
        /*
        все методы имеют доступ и меняют поле, видят его одинаково
         */
    }

    private void iPrint(){
        System.out.println("Method prints: " + someGlobalField);
    }

    private void iChange(){
        someGlobalField = 100;
    }

}


