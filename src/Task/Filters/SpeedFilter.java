package Task.Filters;

import Task.Objects.Car;

public class SpeedFilter implements Filter<Car> {
    private int minSpeed;

    public SpeedFilter(int minSpeed) {
        this.minSpeed = minSpeed;
    }

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
