package L6;
/*
        1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
            В качестве параметра каждому методу передается величина, означающая или длину препятствия
             (для бега и плавания), или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
             прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
         (Например, dog1.run(150); -> результат: run: true)
        5.* Добавить подсчет созданных котов, собак и животных.
        6. * Добавить животным разброс в ограничениях.
            То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

*/


import L6.Animals.*;

import L6.Birds.Duck;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Vertolet - bird ", "white", 4);
        duck.voice();
        duck.fly();
        duck.info();

        System.out.println();
        System.out.println();

        Animal[] animals = {
                new Cat("Kabachok - cat", "grey", 2),
                new Dog("Fedya - dog ", "braun", 3),
                new Cat2("Krosh - cat ", "grey", 2),
        };
        for (int i = 0; i < animals.length; i++) {
         //   if (a)


                animals[i].info();
                animals[i].run();
                animals[i].jump();
                animals[i].swim();
            System.out.println();
        }
    }
}
