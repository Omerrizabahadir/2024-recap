package recap.design_patterns.state_design_pattern;

public class LeaveEmployeeState implements EmployeeState{
    @Override
    public void handleRequest(Context context) {

        System.out.println("Çalışan şu anda izinli. İş yapamaz");

        //Durumu değiştirebilirsin

    }
}
