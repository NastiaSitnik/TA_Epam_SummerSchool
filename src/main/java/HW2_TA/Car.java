package HW2_TA;

public abstract class Car  implements Alarm, Vehicle {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract String getModel();
}
