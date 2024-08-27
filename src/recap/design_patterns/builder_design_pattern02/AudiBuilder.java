package recap.design_patterns.builder_design_pattern02;

public class AudiBuilder extends Car.CarBuilder{


    public AudiBuilder( int age, boolean airConditioner) {
        super("Audi", age, airConditioner);
    }

    @Override
    public Car build() {
        return new Car(this);
    }
}
