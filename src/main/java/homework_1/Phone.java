package homework_1;

public class Phone {
    private int number;
    private String model;
    private float weight;
    public Phone(int number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    void receiveCall(String name){
        System.out.println(name + " is calling.");
    }
    public int getNumber() {
        return number;
    }
}
