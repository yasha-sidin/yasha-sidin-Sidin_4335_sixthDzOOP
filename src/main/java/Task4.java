public class Task4 {
    public class Figure {
        private int area;

        public void setArea(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }

    }
    public class Rectangle extends Figure {
        private int width;
        private int height;

        public int getHeight() {
            return height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int area() {
            return this.width * this.height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }
    }

    public class Square extends Figure {
        private int width;

        public void setWidth(int width) {
            this.width = width;
        }

        public int getWidth() {
            return width;
        }

        public int area() {
            return this.width * this.width;
        }

    }
}
