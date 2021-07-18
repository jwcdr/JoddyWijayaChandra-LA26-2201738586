package binus.app.castlevscastle;

import java.util.Vector;

public class Steel extends Castle{

    public Steel(String name, String skin, Vector<Hero> heroes, Vector<Army> armies) {
        super(name, skin, heroes, armies);
        // TODO Auto-generated constructor stub
    }


    public void skinBoost() {
        // TODO Auto-generated method stub
        for(int i=0;i<armies.size();i++) {
            if(armies.get(i).getArmyName().equalsIgnoreCase("infantry")) {
                int boostValue = armies.get(i).boostSkill();
                this.setBoostValue(boostValue);
            }
        }
    }

    @Override
    public void deBoost() {
        // TODO Auto-generated method stub
        for(int i=0;i<armies.size();i++) {
            if(armies.get(i).getArmyName().equalsIgnoreCase("cavalry")) {
                int newPower = armies.get(i).getSkillPower() - getBoostValue();
                armies.get(i).setSkillPower(newPower);
                this.setBoostValue(0);
            }
        }
    }
}
