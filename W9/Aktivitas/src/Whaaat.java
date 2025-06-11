class Animal{
    void eat(){
        System.out.println("AKU MAKAN");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("AKU GONG");
    }
}
class Pig extends Animal{
    void oink(){
        System.out.println("AKU OINK");
    }
}

public class Whaaat {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Pig pig = new Pig();
        pig.oink();
        pig.eat();
    }
}
