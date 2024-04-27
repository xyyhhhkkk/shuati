package polyparameter_;

public class PrimaryEmployee extends Employee{
    public PrimaryEmployee(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("这里是普通员工在加班");
    }
    public double getAnnual(){

        return super.getAnnual();
    }
}
