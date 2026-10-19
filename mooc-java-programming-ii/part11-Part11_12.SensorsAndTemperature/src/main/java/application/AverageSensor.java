package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> readingsList;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if (sensorList.isEmpty()){
            return false;
        }
        for (Sensor sensor : sensorList){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensorList){
            sensor.setOn();
        }

    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensorList){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sensorTotal = 0;
        if (!isOn()){
            throw new IllegalStateException();
        }

        for (Sensor sensor : sensorList){
            sensorTotal += sensor.read();
        }

        sensorTotal = sensorTotal/sensorList.size();

        readingsList.add(sensorTotal);
                
        return sensorTotal;
    }

    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    public List<Integer> readings(){
        return readingsList;
    }
}
