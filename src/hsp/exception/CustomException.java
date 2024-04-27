package hsp.exception;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        // 要求范围在18-120之间，否则抛出异常
        if(!(age>=18 && age<=120)){
            throw new AgeException("年龄必须在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String mes) {   //构造器
        super(mes);
    }
}
