package binus.app.castlevscastle;

public class Catapult extends Hero{


    private String catapultType;

    public Catapult(String name, String type, int level, int heroPower, int rangeAttack, String catapultType) {
        super(name, type, level, heroPower, rangeAttack);
        // TODO Auto-generated constructor stub
        this.catapultType = catapultType;
    }

    public String getCatapultType() {
        return catapultType;
    }

    public void setCatapultType(String catapultType) {
        this.catapultType = catapultType;
    }


}
