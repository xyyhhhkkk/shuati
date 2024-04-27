package polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jacky",20);
        persons[1] = new Student("111",33,99);
        persons[2] = new Student("222",44,100);
        persons[3] = new Teacher("mm",23,11111);
        persons[4] = new Teacher("bb",55,22222);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
        }
    }
}
