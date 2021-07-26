package HW2_TA;

import java.awt.*;

public class Mercedes extends Car{
    private String color;
    private String model;
    private int speed = 0;

    public Mercedes(String model)
    {
        super();
        this.model = model;
        this.color = String.valueOf(new Color((int)(Math.random() * 0x1000000)));

    }

    @Override
    public void setBrand(String brand) {
        super.setBrand("Mercedes");
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public double speedUp() {
        return this.speed+=10;
    }

    @Override
    public double slowDown() {
        if(this.speed >=10){
            return this.speed -=10;}
        else return 0;
    }

    @Override
    public String turnAlarmOn() {
        return super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return super.turnAlarmOff();
    }
}
