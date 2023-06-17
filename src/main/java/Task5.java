public class Task5 {
    public interface Engine {
        public void start();
    }
    public class Car {
        private Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }
    public class PetrolEngine implements Engine {
        public void start() {
        }
    }
}
