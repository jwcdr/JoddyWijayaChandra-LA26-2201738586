package binus.app.castlevscastle;

public class Cavalry extends Hero{

    private String armorType;

    public Cavalry(String name, String type, int level, int heroPower, int rangeAttack, String armorType) {
        super(name, type, level, heroPower, rangeAttack);
        // TODO Auto-generated constructor stub
        this.armorType = armorType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

}

