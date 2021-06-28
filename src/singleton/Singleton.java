package singleton;

public class Singleton {
    static Singleton singleton; //정적 참조 변수

    private Singleton(){}; // private 생성자

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton =  new Singleton();
        }
        return singleton;
    }
}
