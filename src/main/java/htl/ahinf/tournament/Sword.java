package htl.ahinf.tournament;

public class Sword extends Weapon {
    //konstruktor Sword
    public Sword(String description, char type, String property) {
        super(description, type, property);
    }

    @Override
    public String toString() {
        return "Sword:\n" +
                "\t\tdescription= " + super.getDescription() + '\n' +
                "\t\ttype= " + super.getType() +'\n' +
                "\t\tproperty= " + super.getProperty() +
                ';';
    }
}
