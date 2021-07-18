package binus.app.castlevscastle;

public class CavalryArmy extends Army{

    private String cavalrySize;

    public CavalryArmy(int armyPower, String armyName, int skillPower, String cavalrySize) {
        super(armyPower, armyName, skillPower);
        this.cavalrySize = cavalrySize;
    }

    public String getCavalrySize() {
        return cavalrySize;
    }

    public void setCavalrySize(String cavalrySize) {
        this.cavalrySize = cavalrySize;
    }

}
