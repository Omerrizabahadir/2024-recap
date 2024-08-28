package recap.design_patterns.state_design_pattern;

public class SickEmployeeState implements EmployeeState{
    @Override
    public void handleRequest(Context context) {

        System.out.println("Çalışan hasta. İş yapamaz.");

        // Durumu değiştirebilirsiniz
        //context.setEmployeeState(new LeaveEmployeeState());
    }
}
