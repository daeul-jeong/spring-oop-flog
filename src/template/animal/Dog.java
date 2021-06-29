package template.animal;

public class Dog extends Animal {
    @Override
    void play() {
        System.out.println("강아지 놀이");
    }

    @Override
    void runSomething() {
        System.out.println("멍!멍! ~~");
    }
}
