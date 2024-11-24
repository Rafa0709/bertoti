class PhoneDisplay implements Observer {
    private String displayName;

    public PhoneDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(displayName + " Display: Temperature updated to " + temperature + "°C");
    }
}

class WindowDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Window Display: Temperature updated to " + temperature + "°C");
    }
}
