package hsp;

public class p345 {
    private String name;
    private int age;
    private String post;
    private double salary;

    public p345(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce(){
        System.out.println("name:"+getName()+" age:"+getAge()+" post:"+getPost()+" salary:"+getSalary());
    }
}

class Professor extends p345{

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public void introduce(){
        System.out.println("name:"+getName()+" age:"+getAge()+" post:"+getPost()+" salary:"+"1.3");
    }
}


class DeProfessor extends p345{

    public DeProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public void introduce(){
        System.out.println("name:"+getName()+" age:"+getAge()+" post:"+getPost()+" salary:"+"1.2");
    }
}

class Teacher extends p345{

    public Teacher(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public void introduce(){
        System.out.println("name:"+getName()+" age:"+getAge()+" post:"+getPost()+" salary:"+"1.1");
    }
}

