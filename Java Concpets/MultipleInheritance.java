
    // Interface 1
    interface Vehicle {
        void start();
        void stop();
    }

    // Interface 2
    interface Radio {
        void turnOnRadio();
        void turnOffRadio();
    }

    // Concrete class implementing both interfaces
    class Car implements Vehicle, Radio {
    public void boos(){
        System.out.println("car boosted");
    }
        @Override
        public void start() {
            System.out.println("Car is starting.");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopping.");
        }

        @Override
        public void turnOnRadio() {
            System.out.println("Radio is turned on in the car.");
        }

        @Override
        public void turnOffRadio() {
            System.out.println("Radio is turned off in the car.");
        }
    }

    public class MultipleInheritance {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.start();
            myCar.turnOnRadio();
            myCar.stop();
            myCar.turnOffRadio();
        }
    }

