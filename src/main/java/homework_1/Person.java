package homework_1;

public class Person {
    private String fullName;
    private int age;
    void move(){
        System.out.println(fullName + " goes.");
    }
    void talk(){
        System.out.println(fullName + " talks.");
    }
    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        if(age<0){
            System.err.println("incorrect age value! ("+age+")");
            age = 0;
        }
        this.age = age;
    }
}
