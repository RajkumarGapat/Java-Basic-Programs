package pkg1;

abstract class Subject {
    public abstract void study();
}

class ComputerScience extends Subject {
    public void study() {
        System.out.println("Studying computer science");
    }
}

class Biology extends Subject {
    public void study() {
        System.out.println("Studying biology");
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        Subject subject1 = new ComputerScience();
        Subject subject2 = new Biology();

        subject1.study();
        subject2.study();
    }
}