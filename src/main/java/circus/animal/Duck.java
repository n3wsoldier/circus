package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a circus.animal.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }
<<<<<<< HEAD:src/main/java/circus/animal/Duck.java

    @Override
    public void fly() {

    }
=======
>>>>>>> improved:src/main/java/Duck.java
}
