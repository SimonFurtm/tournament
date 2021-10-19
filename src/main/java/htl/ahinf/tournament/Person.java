package htl.ahinf.tournament;

public abstract class Person {

    private String name;
    private int phoneNr;

    public Person(String name, int phoneNr) {
        this.name = name;
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNr=" + phoneNr +
                '}';
    }
}
