package recap.design_patterns.state_design_pattern;

public class Context {
    private  EmployeeState employeeState;

    public Context(EmployeeState employeeState) {
        this.employeeState = employeeState;
    }

    public void setEmployeeState(EmployeeState employeeState) {
        this.employeeState = employeeState;
    }
    public void request(){
        employeeState.handleRequest(this);
    }
}
