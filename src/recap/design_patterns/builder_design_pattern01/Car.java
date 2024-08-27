package recap.design_patterns.builder_design_pattern01;

public class Car {
    private String brand;
    private int age;
    private boolean airConditioner;
    private boolean screen;
    private boolean absBrakeSystem;

    //Car sınıfına ait constructor içerisine Builder alacak.Elinle yaz kendisi oluşturmaz hatalı yazpıyor
    public Car(CarBuilder carBuilder) {
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

    public static class CarBuilder{
        private String brand;
        private int age;
        private boolean airConditioner;
        private boolean screen;
        private boolean absBrakeSystem;

        //CarBuilder constructor'unda gerekli alanları belirledim
        public CarBuilder(String brand, int age, boolean airConditioner) {
            this.brand = brand;
            this.age = age;
            this.airConditioner = airConditioner;
        }
//belirlediğim alanlar dışındakileri setle
        public CarBuilder setScreen(boolean screen) {
            this.screen = screen;
            return this;
        }

        public CarBuilder setAbsBrakeSystem(boolean absBrakeSystem) {
            this.absBrakeSystem = absBrakeSystem;
            return this;
        }

        //builder sınıfında build() metodu olmalı
        public Car build(){
            return new Car(this);
        }
    }
}

