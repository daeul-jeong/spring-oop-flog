package template.animal;

public abstract class Animal {
    //템플릿 메서드
    public void playWithOwner(){
        System.out.println("let's take a walk");
        play();
        runSomething();
        System.out.println("good job");

    }
    //추상 메서드
    abstract void play();

    //Hook(갈고리) 메서드
    void runSomething(){
        System.out.println("~~~ ~~~");
    }

}
