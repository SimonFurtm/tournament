package htl.ahinf.tournament;

public abstract class Weapon {
    private String description;
    private String type;

    public Weapon(String description, String type) {
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "description='" + description + '\'' +
                '}';
    }
}
