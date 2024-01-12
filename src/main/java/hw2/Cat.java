package hw2;

public class Cat extends Animal {
    private static final String ANIMALFAMILY = "Cat family";
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void makeSound() {
        System.out.println(" makeSound - Мяу!");
    }

    private String printConsole() {
        return String.format("%s - name: %s, age: %d", ANIMALFAMILY, this.name, this.age);
    }
}
