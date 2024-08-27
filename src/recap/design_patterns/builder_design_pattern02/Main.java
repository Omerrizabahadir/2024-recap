package recap.design_patterns.builder_design_pattern02;

public class Main {
    public static void main(String[] args) {
        // BMW için Car nesnesi oluşturma
        Car bmw = new BMWBuilder(2023,true)
                .build();


        // AUDİ için Car nesnesi oluşturma
        Car audi = new AudiBuilder(2020,true)
                .build();

        //sonuçları ekrana yazdırma
        printCarDetails(bmw);
        printCarDetails(audi);

    }
    private static void printCarDetails(Car car){
        System.out.println("Brand : " + car.getBrand());
        System.out.println("Age : " +car.getAge());
        System.out.println("Has air conditioner : " + car.isAirConditioner());
        System.out.println("Has screen : " + car.isScreen());
        System.out.println("Has ABS brake system : " + car.isAbsBrakeSystem());
        System.out.println();
    }
}
