package singleton;

public class Client {
    public static void main(String[] args) {
        //private 이라서 new로 생성 불가
//        Singleton s = new Singleton();

        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
