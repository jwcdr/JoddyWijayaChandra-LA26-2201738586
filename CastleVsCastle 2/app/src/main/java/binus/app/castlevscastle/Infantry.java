package binus.app.castlevscastle;

public class Infantry extends Hero{

    private String swordType;

    public Infantry(String name, String type, int level, int heroPower, int rangeAttack, String swordType) {
        super(name, type, level, heroPower, rangeAttack);
        // TODO Auto-generated constructor stub
        this.swordType = swordType;
    }

    public String getSwordType() {
        return swordType;
    }

    public void setSwordType(String swordType) {
        this.swordType = swordType;
    }

}

