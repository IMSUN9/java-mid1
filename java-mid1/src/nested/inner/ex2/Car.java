package nested.inner.ex2;

public class Car
{
    private String model;
    private int chrgeLevel;
    private Engine engine;

    public Car(String model, int chrgeLevel) {
        this.chrgeLevel = chrgeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    public void start()
    {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine
    {
        public void start()
        {
            System.out.println("충전 레벨 확인: " + chrgeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
