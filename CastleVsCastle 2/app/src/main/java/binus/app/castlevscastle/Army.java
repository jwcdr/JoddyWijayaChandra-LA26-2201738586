package binus.app.castlevscastle;

public abstract class Army {

    protected int armyPower;
    protected String armyName;
    protected int skillPower;

    public Army(int armyPower, String armyName, int skillPower) {
        super();
        this.armyPower = armyPower;
        this.armyName = armyName;
        this.skillPower = skillPower;
    }

    public int getSkillPower() {
        return skillPower;
    }

    public void setSkillPower(int skillPower) {
        this.skillPower = skillPower;
    }

    public int getArmyPower() {
        return armyPower;
    }

    public void setArmyPower(int armyPower) {
        this.armyPower = armyPower;
    }

    public String getArmyName() {
        return armyName;
    }

    public void setArmyName(String armyName) {
        this.armyName = armyName;
    }

    public int boostSkill() {
        int boostPower = (this.skillPower *20)/100;
        this.skillPower = this.skillPower+boostPower;
        return boostPower;

    }

    public void boostAttack() {
        int boostPower = (this.skillPower *40)/100;
        this.skillPower = this.skillPower+boostPower;
    }
}