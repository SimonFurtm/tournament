package htl.ahinf.tournament;

public class knight extends Person{
    private String nickname;
    private int id;

    public knight(String name, int phoneNr, String nickname) {
        super(name, phoneNr);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "knight{" +
                "nickname='" + nickname + '\'' +
                ", id=" + id +
                '}';
    }

    public void addScarce(){

    }

    public  void addWeapon(){

    }

    public void weaponType(){

    }
}
