package htl.ahinf.tournament;

public class Knight extends Person{
    private String nickname;
    private Scarce knightsScarce;
    private String scarceInfo = "";

    private Weapon knightsWeapon;
    private String weaponInfo = "";
    private char weaponType;

    public Knight(String name, String phoneNr, String nickname) {
        super(name, phoneNr);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        if (knightsScarce != null){
            scarceInfo = "\n\t" + knightsScarce.toString();
        }
        if (knightsWeapon != null){
            weaponInfo = "\n\t" + knightsWeapon.toString();
        }
        return "knight{" +
                "name='" +  super.getName()+ '\'' +
                "phoneNR='" +  super.getPhoneNr()+ '\'' +
                "nickname='" + nickname + '\'' +
                '}' + scarceInfo + weaponInfo + "\n";
    }

    public void addScarce(String name, String phoneNr, int extraTraining){
        knightsScarce = new Scarce(name,phoneNr,10+extraTraining);
    }

    public void addWeapon(String description, char type, String property){
        switch (type){
            case 's': knightsWeapon = new Sword(description,type,property); weaponType = type; break;
            case 'l': knightsWeapon = new Lance(description,type,property); weaponType = type; break;
            default:
                System.out.println("Weapon type: " + type + "does not exist or is typed wrong.");
        }
    }

    public String getNickname() {
        return nickname;
    }

    public Scarce getKnightsScarce() {
        return knightsScarce;
    }

    public Weapon getKnightsWeapon() {
        return knightsWeapon;
    }

    public char getWeaponType() {
        return weaponType;
    }

}
