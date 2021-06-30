package factory.ship;

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications
//배를 만드는 일만하는 공장입니다. 배의 생성을 캡슐화하여 수정을 할 수있는 곳이 한곳뿐입니다.

public class EnemyShipFactory{

    // This could be used as a static method if we
    // are willing to give up subclassing it
    //서브 클래싱을 포기하려는 경우 정적 메서드로 사용할 수 있습니다.

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if (newShipType.equals("U")){

            return new UFOEnemyShip();

        } else

        if (newShipType.equals("R")){

            return new RocketEnemyShip();

        } else

        if (newShipType.equals("B")){

            return new BigUFOEnemyShip();

        } else return null;

    }

}