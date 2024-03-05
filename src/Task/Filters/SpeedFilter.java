package Task.Filters;

import Task.Objects.Car;


/**
 * Represents a filter that checks if a   a specific condition.
 */
public class SpeedFilter implements Filter<Car> {
    private int minSpeed;

    /**
     * Constructor for the SpeedFilter class
     * @param minSpeed the minimum speed to check against
     */
    public SpeedFilter(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    /**
     * Checks if the car's max speed is greater than or equal to the condition
     * @param car      the item to check against the condition
     * @param condition the condition to apply
     * @return true if the car's max speed is greater than or equal to the condition, false otherwise
     */
    @Override
    public boolean matches(Car car, String condition) {
        try {
            int conditionSpeed = Integer.parseInt(condition);
            return car.getMaxSpeed() >= conditionSpeed;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
