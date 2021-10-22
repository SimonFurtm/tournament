package htl.ahinf.tournament;

public class Sword extends Weapon {

    public Sword(String description, char type, String property) {
        super(description, type, property);
    }

    @Override
    public String toString() {
        return "Sword{" +
                "description='" + super.getDescription() + '\'' +
                ", type='" + super.getType() +'\'' +
                ", property='" + super.getProperty() + '\'' +
                '}';
    }
}
