package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean power;

    public TemperatureSensor() {
        this.power = false;
    }

    @Override
    public boolean isOn() {
        return power;
    }

    @Override
    public void setOn() {
        power = true;
    }

    @Override
    public void setOff() {
        power = false;
    }

    @Override
    public int read() {

        if (!isOn()){
            throw new IllegalStateException();
        }
        return new Random().nextInt(61)-30;
    }
}
