package recap.design_patterns.builder_design_pattern02;

public class Car {
    private String brand;
    private int age;
    private boolean airConditioner;
    private boolean screen;
    private boolean absBrakeSystem;

    // Car sınıfına ait constructor içerisine Builder alacak
    Car(CarBuilder carBuilder){
      this.brand = carBuilder.brand;
      this.age = carBuilder.age;
      this.airConditioner = carBuilder.airConditioner;
      this.screen = carBuilder.screen;
      this.absBrakeSystem = carBuilder.absBrakeSystem;
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public boolean isScreen() {
        return screen;
    }

    public boolean isAbsBrakeSystem() {
        return absBrakeSystem;
    }

    //inner class-->Builder
    public static abstract class CarBuilder {
        private String brand;
        private int age;
        private boolean airConditioner;
        private boolean screen;
        private boolean absBrakeSystem;

        //builder'ın constructor'ı
        public CarBuilder(String brand, int age, boolean airConditioner) {
            this.brand = brand;
            this.age = age;
            this.airConditioner = airConditioner;


        }

        //setterları void yapıyor onları return olacak şekilde CarBuilder yap!!!!!
        public CarBuilder setScreen(boolean screen) {
            this.screen = screen;
            return this;
        }

        public CarBuilder setAbsBrakeSystem(boolean absBrakeSystem) {
            this.absBrakeSystem = absBrakeSystem;
            return this;
        }

        //abstract old. için gövdesiz metod
        public abstract Car build();
    }
}