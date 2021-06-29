package template.animal;

public class Cat extends Animal{
    @Override
    void play() {
        System.out.println("고양이 놀이");
    }

    @Override
    void runSomething() {
        System.out.println("야옹 야옹~~~~");
    }
}
