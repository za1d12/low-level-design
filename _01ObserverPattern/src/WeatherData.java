import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private final List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
