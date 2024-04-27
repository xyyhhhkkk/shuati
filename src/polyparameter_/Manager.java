package polyparameter_;

import polyarr_.Person;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAnnual(){
        return super.getAnnual()+bonus;
    }


    public void manage(){
        System.out.println("经理来管理");
    }
}
