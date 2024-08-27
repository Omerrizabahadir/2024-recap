package recap.design_patterns.builder_design_pattern02;

public class BMWBuilder extends Car.CarBuilder{

    //BMW için zorunlu benim seçtiklerim builder da
    public BMWBuilder(int age, boolean airConditioner){
        super("BMW",2012,true);

    }

    @Override
    public Car build() {
        // BMW'ler için varsayılan ayarları yapabilirsiniz
        setScreen(true);
        setAbsBrakeSystem(true);
        return new Car(this);
    }
}
