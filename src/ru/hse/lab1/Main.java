package ru.hse.lab1;
import ru.hse.lab1.second.Person;
/**
 * @author Васильева Альбина Сергеевна
 * @version 1.0
 * @since 2026
 */
public class Main{
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println("Иван: " + person.name);
        System.out.println("Возраст: " + person.age);

    }
}