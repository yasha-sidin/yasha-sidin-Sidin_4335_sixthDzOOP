public class Task2 {
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle, Double ratio) {
            return vehicle.getMaxSpeed() * ratio;
        }
    }
    public class Vehicle {
        int maxSpeed;
        String type;
        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }
        public int getMaxSpeed() {
            return this.maxSpeed;
        }
        public String getType() {
            return this.type;
        }
    }

    public class Car extends Vehicle {
        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
    }

    public class Bus extends Vehicle {
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
    }
}
