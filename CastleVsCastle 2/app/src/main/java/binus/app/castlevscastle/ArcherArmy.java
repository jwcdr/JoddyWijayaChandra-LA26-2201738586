package binus.app.castlevscastle;

public class ArcherArmy extends Army{

    private String archerType;

    public ArcherArmy(int armyPower, String armyName, int skillPower, String archerType) {
        super(armyPower, armyName, skillPower);
        this.archerType = archerType;
    }

}
