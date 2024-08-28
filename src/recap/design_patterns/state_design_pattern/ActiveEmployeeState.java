package recap.design_patterns.state_design_pattern;

public class ActiveEmployeeState implements EmployeeState{
    @Override
    public void handleRequest(Context context) {
        System.out.println("Çalışan şu an Aktif. İş yapabilir.");

        //Durumu değiştirebilirsin
        //context.setEmployeeState(new SickEmployeeState());
    }
}
