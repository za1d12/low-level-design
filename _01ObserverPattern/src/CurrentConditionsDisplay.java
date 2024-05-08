public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void update(float temp, float pressure, float humidity) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display: ");
    }
}
