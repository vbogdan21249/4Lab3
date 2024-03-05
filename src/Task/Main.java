/**
 * Package for Task
 * @package Task
 */
package Task;

import Task.Objects.Car;
import Task.Filters.IntegerGreaterThanFilter;
import Task.Filters.SpeedFilter;
import Task.Filters.StringContainsFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Client class
 */
public class Main {
    public static void main(String[] args) {

        // ------------ String ------------
        List<String> stringData = List.of("apple", "banana", "cherry");
        MyTable<String> stringTable = new MyTable<>(stringData);

        StringContainsFilter stringFilter = new StringContainsFilter();
        List<String> filteredStrings = stringTable.performSelection(stringFilter, "an");

        System.out.println("Filtered strings: " + filteredStrings);

        // ------------ Integer ------------
        List<Integer> intData = List.of(5, 10, 15, 20);
        MyTable<Integer> intTable = new MyTable<>(intData);

        IntegerGreaterThanFilter intFilter = new IntegerGreaterThanFilter();
        List<Integer> filteredIntegers = intTable.performSelection(intFilter, "12");

        System.out.println("Filtered integers: " + filteredIntegers);

        // ------------ Car ------------
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 180));
        cars.add(new Car("Honda", "Civic", 170));
        cars.add(new Car("BMW", "M5", 300));
        cars.add(new Car("Tesla", "Model S", 250));

        SpeedFilter speedFilter = new SpeedFilter(200); // Minimum speed of 200 km/h
        List<Car> fastCars = new MyTable<>(cars).performSelection(speedFilter, "200");

        System.out.println("Fast cars: [");
        for (Car car : fastCars) {
            System.out.print(car.getModel() + "\n");
        }
        System.out.print("]");
    }
}
