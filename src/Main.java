//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("System Started");

        Emp e1=new Emp();
        e1.setId(100);
        e1.setEname("Pratibha");
        e1.setSalary(99.99f);
        e1.display();

        Emp e2=new Emp();
        e2.setId(200);
        e2.setSalary(98.98f);
        e2.setEname("Surabhi");
        e2.display();


        
    }
}