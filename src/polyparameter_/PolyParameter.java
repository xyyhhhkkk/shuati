package polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        PrimaryEmployee p = new PrimaryEmployee("xiaodi",2500);
        Manager m = new Manager("dage",2500,2500);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.ShowEmpAnnual(p);
        polyParameter.ShowEmpAnnual(m);
    }
    public void ShowEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }
    public void testWork(Employee e){       //向下转型
        if(e instanceof PrimaryEmployee){
            ((PrimaryEmployee) e).work();
        }
        if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
