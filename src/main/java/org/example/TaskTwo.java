package org.example;

/*
2. Область видимости параметров метода:
Задача: Передайте параметр в метод.
Попробуйте использовать этот параметр вне метода и определите, что произойдет.
 */
public class TaskTwo {
    public static void main(String[] args) {
        int a = 5;
        int b = someMethod(a);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        /*
        a не поменялась потому что переменные в метод передаюся по значению,
        а не по адрессу в память
         */

        SomeModel someModel1 = new SomeModel(5);
        System.out.println("someField before : " +someModel1.getSomeField());
        SomeModel someModel2 = someMethod1(someModel1);
        System.out.println("someField after : " +someModel1.getSomeField());
        System.out.println("someField new : " +someModel2.getSomeField());

        /*
        обьекты передаются так же по значению, мы скопировали ссылку на память,
        значения - ссылка на память
        в этом методе мы просто создали новое место в памяти и вернули его
        по этому старая ссылка показывает то же значение
         */

        SomeModel someModel = new SomeModel(5);
        System.out.println("someField before :" +someModel.getSomeField());
        someMethod2(someModel);
        System.out.println("someField after : " +someModel.getSomeField());
        /*
        было 5 стало 15

        мы передали ссылку на память и работая с этой ссылкой поменяли знчение в обьекте
        обьект в методе и обьект в мейне смотрели на один обьект в памяти
         */
    }

    private static int someMethod(int a){
        a = 15;
        return a;
    }

    private static SomeModel someMethod1(SomeModel model) {
        model = new SomeModel(55);
        return model;
    }

    private static void someMethod2(SomeModel model) {
        model.setSomeField(15);
    }
}
