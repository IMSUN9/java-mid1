package nested.inner.ex1;

public class Car
{
    private String model;
    private int chrgeLevel;
    private Engine engine;

    public Car(String model, int chrgeLevel) {
        this.chrgeLevel = chrgeLevel;
        this.model = model;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChrgeLevel() {
        return chrgeLevel;
    }

    public void start()
    {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
