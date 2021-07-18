package binus.app.castlevscastle;

public class InfantryArmy extends Army{

    private String specialization;

    public InfantryArmy(int armyPower, String armyName, int skillPower, String specialization) {
        super(armyPower, armyName, skillPower);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
