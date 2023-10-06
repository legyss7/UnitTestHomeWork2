package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Subaru", "OutBack", 2020);
        motorcycle = new Motorcycle(
                "Kawasaki", "Ninja", 2021);
    }

    /**
     * 1. Проверить, что экземпляр объекта Car
     * также является экземпляром транспортного
     * средства; (instanceof)
     */
    @Test
    void checkThatCarObjectInstanceIsVehicleInstance() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * 2. Проверить, что объект Car создается с 4-мя колесами
     */
    @Test
    void checkThatTheCarObjectIsCreatedWith4Wheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    /**
     * 3. Проверить, что объект Motorcycle создается с 2-мя колесами
     */
    @Test
    void checkThatTheMotorcycleObjectIsCreatedWith2Wheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    /**
     * 4. Проверить, что объект Car развивает скорость 60 в
     * режиме тестового вождения (testDrive())
     */
    @Test
    void checkThatCarObjectReachesSpeedOf60InTestDrivingMode() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    /**
     * 5. Проверить, что объект Motorcycle развивает скорость 75 в
     * режиме тестового вождения (testDrive())
     */
    @Test
    void checkThatMotorcycleObjectReachesSpeedOf60InTestDrivingMode() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    /**
     * 6. Проверить, что в режиме парковки (сначала testDrive,
     * потом park, т.е эмуляция движения транспорта) машина
     * останавливается (speed = 0)
     */
    @Test
    void checkThatCarStopsInParkingMode() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    /**
     * 7. Проверить, что в режиме парковки (сначала testDrive,
     * потом park т.е эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0)
     */
    @Test
    void checkThatMotorcycleStopsInParkingMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }

}