package recap.design_patterns.builder_design_pattern01;

public class Main {
    public static void main(String[] args) {

        //CarBuilder constructor'unu çağırıyoruz. Orada ben age ve airConditioner gelsin istediğim için ->onlar zorunlu. Ama istersen zorunlu olmayanlarıda set leyebilirsin
        //BMW nesnesi olşturma
        Car bmw = new Car.CarBuilder("BMW",2024, true)
                .build();



        //AUDİ nesnesi oluşturma. İstersen zorunlu olmayan alanşlarıda kullanabilirsin
        Car audi = new Car.CarBuilder("AUDİ",2020,true)
                .setScreen(true)
                .setAbsBrakeSystem(true)
                .build();



        //MERCEDES NESNESİ OLUŞTURMA
        Car mercedes = new Car.CarBuilder("MERCEDES",2022,true)
                .build();


        System.out.println("BMW Age is : "+ bmw.getAge() + "\t" + "BMW has Air Conditioner : "+ bmw.isAirConditioner());
        System.out.println("AUDI Age is : "+ audi.getAge() + "\t" + "AUDI has Air Conditioner : "+ audi.isAirConditioner());
        System.out.println("MERCEDES Age is : "+ mercedes.getAge() + "\t" + "MERCEDES has Air Conditioner : "+ mercedes.isAirConditioner());
    }
}
