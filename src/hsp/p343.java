package hsp;

public class p343 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("XYY", 18, "STUDENT");
        p[1] = new Person("XYY", 6, "STUDENT");
        p[2] = new Person("XYY", 22, "STUDENT");
        //输出当前对象数组
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        //使用冒泡排序
        for (int i = 0; i < p.length-1; i++) { //外层循环
            for (int j = 0; j < p.length-1-i; j++) { //内层循环
                if(p[i].getAge()>p[i+1].getAge()){
                    Person temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
    class Person{
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
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

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    '}';
        }
    }

