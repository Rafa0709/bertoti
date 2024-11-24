class Observer {
    public static void main (String[] args){
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay1 = new PhoneDisplay("Alice's Phone");
        Observer phoneDisplay2 = new PhoneDisplay("Bob's Phone");
        Observer windowDisplay = new WindowDisplay();

        weatherStation.addObserver(phoneDisplay1);
        weatherStation.addObserver(phoneDisplay2);
        weatherStation.addObserver(windowDisplay);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(phoneDisplay2);

        weatherStation.setTemperature(28.0f);
    }
}