public class Task3 {
    public interface Shape {
        double area();
    }
    public class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }
    public class Cube implements Shape {
        private int edge;
        public Cube(int edge) {
            this.edge = edge;
        }
        @Override
        public double area() {
            return 6 * edge * edge;
        }

        public double volume() {
            return edge * edge * edge;
        }
    }
}
