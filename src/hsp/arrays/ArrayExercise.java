package hsp.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book("111",10);
        books[1] = new Book("222",20);
        books[2] = new Book("333",30);

        Arrays.sort(books,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 =  (Book)o1;
                Book book2 =  (Book)o2;
                double val = book2.getPrice() - book1.getPrice();
                if(val>0){
                    return 1;
                }
                else if(val<0){
                    return -1;
                }else return 0;
            }
        });


    }

}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
