/**
 * Objects package
 */
package Task.Objects;

/**
 * Car class
 */
public class Car {
    private String company;
    private String model;
    private int maxSpeed;

    /**
     * Constructor for the Car class
     * @param company
     * @param model
     * @param maxSpeed
     */
    public Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Get the company of the car
     * @return the company of the car
     */
    public String getCompany() {
        return company;
    }
    /**
     * Get the model of the car
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }
    /**
     * Get the maximum speed of the car
     * @return the maximum speed of the car
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
