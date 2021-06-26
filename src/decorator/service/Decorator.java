package decorator.service;

public class Decorator implements IService{
    IService service;

    @Override
    public String runSomething() {
        System.out.println("반환 결과에 장식을 더하는 것이 주 목적");
        service = new Service();

        return "데코! " + service.runSomething();
    }
}
