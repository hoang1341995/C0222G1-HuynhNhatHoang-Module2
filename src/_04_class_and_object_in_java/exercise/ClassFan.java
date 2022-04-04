package _04_class_and_object_in_java.exercise;

public class ClassFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(3, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    static class Fan {
        private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
        private int speed, radius;
        private boolean on;
        private String color;

        public Fan() {
            this.speed = SLOW;
            this.on = false;
            this.radius = 5;
            this.color = "blue";
        }

        public Fan(int speed, boolean on, int radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            if (this.speed == 1) {
                return SLOW;
            } else if (this.speed == 2) {
                return MEDIUM;
            } else if (this.speed == 3) {
                return FAST;
            } else {
                return this.speed;
            }
        }

        public int setSpeed(int val) {
            return this.speed = val;
        }

        public boolean isOn() {
            return this.on;
        }

        public boolean setOn(boolean val) {
            return this.on = val;
        }

        public int getRadius() {
            return this.radius;
        }

        public int setRadius(int val) {
            return this.radius = val;
        }

        public String getColor() {
            return this.color;
        }

        public String setColor(String val) {
            return this.color = val;
        }

        public String toString() {
            if (isOn()) {
                return getSpeed() + ", " + getColor() + ", " + getRadius() + ", fan is on";
            } else {
                return getColor() + ", " + getRadius() + ", fan is off";
            }
        }

    }
}
