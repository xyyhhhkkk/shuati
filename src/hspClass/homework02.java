package hspClass;
/*
定义一个Employee类，属性有（名字，性别，年龄，职位，薪水），
提供三个构造器，可以初始化
（1）（名字，性别，年龄，职位，薪水）
（2）（名字，性别，年龄）
（3）（职位，薪水）
要求充分复用构造器
*/
public class homework02 {
    public static void main(String[] args) {

    }
    class Employee {
        private String name;
        private String sex;
        private int age;
        private String position;
        private int salary;

        public Employee(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Employee(String position, int salary) {
            this.position = position;
            this.salary = salary;
        }

        public Employee(String name, String sex, int age, String position, int salary) {
            this(name, sex, age);
            this.position = position;
            this.salary = salary;
        }
    }

}
