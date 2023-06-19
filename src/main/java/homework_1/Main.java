package homework_1;

public class Main {
    Person firstPerson = new Person();
    Person sesondPerson = new Person("Shamil Basaev",58);
    static Phone firstPhone = new Phone(2323432,"iPhone X",70.9F);
    static Phone secondPhone = new Phone(9379992,"Samsung A52",75.1F);

    public static void main(String[] args) {

        firstPhone.receiveCall("Jack");
        System.out.println(firstPhone.getNumber());
        secondPhone.receiveCall("unknown");
        System.out.println(secondPhone.getNumber());

    }
}
