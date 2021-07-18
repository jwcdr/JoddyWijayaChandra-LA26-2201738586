package binus.app.castlevscastle;

public class Archer extends Hero{

    private String bowType;

    public Archer(String name, String type, int level, int heroPower, int rangeAttack,String bowType) {
        super(name, type, level, heroPower, rangeAttack);
        // TODO Auto-generated constructor stub
        this.bowType = bowType;
    }

    public String getBowType() {
        return bowType;
    }

    public void setBowType(String bowType) {
        this.bowType = bowType;
    }

}
