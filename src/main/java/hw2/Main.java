package hw2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    /**
     * Создайте абстрактный класс "Animal" с полями "name" и "age".
     * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
     * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
     * Выведите на экран информацию о каждом объекте.
     * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
     *
     * @param args
     */
    public static <Mathod> void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> cat = Class.forName("hw2.Cat");
        Class<?> dog = Class.forName("hw2.Dog");
        Constructor[] catconst = cat.getConstructors();
        Constructor[] dogconst = dog.getConstructors();
        Animal cat2 = (Animal) catconst[0].newInstance("Marusya", 1);
        Animal cat1 = (Animal) catconst[0].newInstance("Musya", 2);
        Animal cat3 = (Animal) catconst[0].newInstance("Vasya", 1);
        Animal dog1 = (Animal) dogconst[0].newInstance("Bob", 1);
        Animal dog2 = (Animal) dogconst[0].newInstance("Boris", 3);
        Animal dog3 = (Animal) dogconst[0].newInstance("Dusya", 2);
        Animal[] animals = {cat1, dog2, dog1, cat3, cat2, dog3};
        for (Animal animal : animals) {
            Method printcons = animal.getClass().getDeclaredMethod("printConsole");
            printcons.setAccessible(true);
            System.out.print(printcons.invoke(animal));
            Method makesound = animal.getClass().getDeclaredMethod("makeSound");
            makesound.setAccessible(true);
            makesound.invoke(animal);
        }
    }
}
