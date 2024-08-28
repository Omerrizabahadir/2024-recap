package recap.design_patterns.state_design_pattern;

public class Main {

    public static void main(String[] args) {
        Context context1 = new Context(new ActiveEmployeeState());      // Başlangıç durumu "Aktif"

        // Çalışanın isteklerini işleme
        context1.request();

        System.out.println();           //boşluk

        Context context2 = new Context(new SickEmployeeState());
        context2.request();

        System.out.println();           //boşluk

        Context context3 = new Context(new LeaveEmployeeState());
        context3.request();


    }


}
