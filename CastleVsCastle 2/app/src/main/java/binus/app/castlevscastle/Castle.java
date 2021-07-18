package binus.app.castlevscastle;

import java.util.Vector;

public abstract class Castle {

    protected String name;
    protected String skin;
    protected Vector<Hero> heroes;
    protected Vector<Army>armies;
    private int boostValue;

    public Castle(String name, String skin,Vector<Hero>heroes,Vector<Army>armies) {
        super();
        this.name = name;
        this.skin = skin;
        this.heroes = heroes;
        this.armies = armies;
        boostValue = 0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Vector<Hero> getHeroes() {
        return heroes;
    }


    public void setHeroes(Vector<Hero> heroes) {
        this.heroes = heroes;
    }


    public Vector<Army> getArmies() {
        return armies;
    }


    public void setArmies(Vector<Army> armies) {
        this.armies = armies;
    }


    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getBoostValue() {
        return boostValue;
    }


    public void setBoostValue(int boostValue) {
        this.boostValue = boostValue;
    }

    public abstract void skinBoost();

    public abstract void deBoost();

    public void skinChange(String newSkin) {
        deBoost();
        this.skin = newSkin;
        skinBoost();
    }

    public void heroBoost() {
        for(int i=0;i<heroes.size();i++){
            for(int j=0;j<armies.size();j++) {
                String heroType = heroes.get(i).getType();
                String armyName = armies.get(j).getArmyName();
                if(heroType.equals(armyName)) {
                    armies.get(j).boostAttack();
                }
            }
        }
    }

    public void printData() {
        System.out.println("Player information\n");
        System.out.println("Castle Name : "+this.getName());
        System.out.println("Castle Skin : "+this.getSkin());
        System.out.println("");
        System.out.println("Hero List");
        System.out.println("");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println("Hero Name  : "+heroes.get(i).getName());
            System.out.println("Leader of  : "+heroes.get(i).getType());
            System.out.println("Hero Level : "+heroes.get(i).getLevel());
            System.out.println("Hero Power : "+heroes.get(i).getHeroPower());
            System.out.println("Hero Range : "+heroes.get(i).getRangeAttack());
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Army List");
        System.out.println("");
        for (int j = 0; j < armies.size(); j++) {
            System.out.println("Army Name   : "+armies.get(j).getArmyName()+" Army");
            System.out.println("Army Power  : "+armies.get(j).getArmyPower());
            System.out.println("Skill Power : "+armies.get(j).getSkillPower());
            System.out.println("");
        }
    }
}
