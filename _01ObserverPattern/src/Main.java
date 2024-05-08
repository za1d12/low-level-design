public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay();

        weatherData.addObserver(display1);
        weatherData.removeObserver(display1);
        weatherData.setMeasurements(1f, 2f, 3f);
    }
}