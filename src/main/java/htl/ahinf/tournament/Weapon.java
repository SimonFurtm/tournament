package htl.ahinf.tournament;

public abstract class Weapon {
    private String description;
    private char type;

    public Weapon(String description, char type) {
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public char getType() {
        return type;
    }
}
