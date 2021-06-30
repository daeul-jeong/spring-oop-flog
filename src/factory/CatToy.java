package factory;

public class CatToy extends AnimalToy{
    @Override
    void identify() {
        System.out.println("고양이 장난감");
    }
}
