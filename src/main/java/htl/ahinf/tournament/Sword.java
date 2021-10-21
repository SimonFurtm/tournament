package htl.ahinf.tournament;

public class Sword extends Weapon {
    private String sharpness;

    public Sword(String description, char type, String sharpness) {
        super(description, type);
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "description='" + super.getDescription() + '\'' +
                ", type='" + super.getType() + '\'' +
                "sharpness='" + sharpness + '\'' +
                '}';
    }

    public String getSharpness() {
        return sharpness;
    }
}
