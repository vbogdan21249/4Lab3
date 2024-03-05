package Task.Objects;

public class Car {
    private String company;
    private String model;
    private int maxSpeed;

    public Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
