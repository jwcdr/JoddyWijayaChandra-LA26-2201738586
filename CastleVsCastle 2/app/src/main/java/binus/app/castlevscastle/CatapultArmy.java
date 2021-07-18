package binus.app.castlevscastle;

public class CatapultArmy extends Army{

    private String catapultType;

    public CatapultArmy(int armyPower, String armyName, int skillPower, String catapultType) {
        super(armyPower, armyName, skillPower);
        this.catapultType = catapultType;
    }

    public String getCatapultType() {
        return catapultType;
    }

    public void setCatapultType(String catapultType) {
        this.catapultType = catapultType;
    }


}
