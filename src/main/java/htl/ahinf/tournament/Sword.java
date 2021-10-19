package htl.ahinf.tournament;

public class Sword extends Weapon {
    private String type;

    public Sword(String description, String type, String type1) {
        super(description, type);
        this.type = type1;
    }
}
