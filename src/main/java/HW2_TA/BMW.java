package HW2_TA;

import java.awt.*;

public class BMW extends Car {
    private String model;
    private String color;
    private int speed = 0;

    public BMW (String model)
    {
        super();
        this.model = model;
        this.color = String.valueOf(new Color((int)(Math.random() * 0x1000000)));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand("BMW");
    }

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public double speedUp() {
        return this.speed += 10;
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

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
