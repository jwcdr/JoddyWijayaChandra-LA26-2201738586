package binus.app.castlevscastle;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    Vector<Player>lop = new Vector<>();
    Scanner scan = new Scanner(System.in);

    public void initialization() {
        //Player 1
        Player player1 = new Player();
        Vector<Army> army_1 = new Vector<>();
        Vector<Hero> hero_1 = new Vector<>();

        army_1.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_1.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_1.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_1.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_1.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_1.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_1.add(new ArcherArmy(200, "archer", 200, "crossbow"));

        hero_1.add(new Archer("Robin Hood", "archer", 50, 2600, 15, "golden bow"));
        hero_1.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_1.add(new Infantry("Arthur", "infantry", 50, 5000, 1, "Excalibur"));
        hero_1.add(new Catapult("Engineer", "Catapult", 50, 2000, 50, "Golden Wrench"));
        hero_1.add(new Catapult("Engineer", "Catapult", 50, 2000, 50, "Golden Wrench"));
        hero_1.add(new Catapult("Engineer", "Catapult", 50, 2000, 50, "Golden Wrench"));

        Horse castle1 = new Horse("Castle of Archer", "horse", hero_1, army_1);
        castle1.heroBoost();
        castle1.skinBoost();
        player1.setCastle(castle1);
        lop.add(player1);

        Player player2 = new Player();
        Vector<Army> army_2 = new Vector<>();
        Vector<Hero> hero_2 = new Vector<>();

        army_2.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_2.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_2.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_2.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_2.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_2.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_2.add(new CatapultArmy(200, "catapult", 200, "arbalest"));

        hero_2.add(new Archer("Robin Hood", "archer", 50, 2600, 15, "golden bow"));
        hero_2.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_2.add(new Infantry("Arthur", "infantry", 50, 5000, 1, "Excalibur"));
        hero_2.add(new Catapult("Engineer", "Catapult", 50, 2000, 50, "Golden Wrench"));
        hero_2.add(new Infantry("Knight", "infantry", 50, 5000, 1, "Long Sword"));
        hero_2.add(new Infantry("Knight", "infantry", 50, 5000, 1, "Great Sword"));

        Steel castle2 = new Steel("Castle of infantry", "infantry", hero_2, army_2);
        castle2.heroBoost();
        castle2.skinBoost();
        player2.setCastle(castle2);
        lop.add(player2);

        Player player3 = new Player();
        Vector<Army> army_3 = new Vector<>();
        Vector<Hero> hero_3 = new Vector<>();

        army_3.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_3.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_3.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_3.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_3.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_3.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_3.add(new InfantryArmy(200, "infantry", 200, "pikeman"));

        hero_3.add(new Archer("Robin Hood", "archer", 50, 2600, 15, "golden bow"));
        hero_3.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_3.add(new Infantry("Arthur", "infantry", 50, 5000, 1, "Excalibur"));
        hero_3.add(new Catapult("Engineer", "Catapult", 50, 2000, 50, "Golden Wrench"));
        hero_3.add(new Infantry("Knight", "infantry", 50, 5000, 1, "Great Sword"));
        hero_3.add(new Infantry("Knight", "infantry", 50, 5000, 1, "Great Sword"));

        Steel castle3 = new Steel("Castle of Knight", "infantry", hero_3, army_3);
        castle3.heroBoost();
        castle3.skinBoost();
        player3.setCastle(castle3);
        lop.add(player3);

        Player player4 = new Player();
        Vector<Army> army_4 = new Vector<>();
        Vector<Hero> hero_4 = new Vector<>();

        army_4.add(new ArcherArmy(200, "archer", 200, "crossbow"));
        army_4.add(new InfantryArmy(200, "infantry", 200, "pikeman"));
        army_4.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_4.add(new CatapultArmy(200, "catapult", 200, "arbalest"));
        army_4.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_4.add(new CavalryArmy(200, "cavalry", 200, "lance"));
        army_4.add(new CavalryArmy(200, "cavalry", 200, "lance"));

        hero_4.add(new Archer("Robin Hood", "archer", 50, 2600, 15, "golden bow"));
        hero_4.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_4.add(new Infantry("Arthur", "infantry", 50, 5000, 1, "Excalibur"));
        hero_4.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_4.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));
        hero_4.add(new Cavalry("Napoleon", "cavalry", 50, 3000, 5, "cavalry horse"));

        Steel castle4 = new Steel("Castle of cavalry", "infantry", hero_4, army_4);
        castle4.heroBoost();
        castle4.skinBoost();
        player4.setCastle(castle4);
        lop.add(player4);
    }

    public Main() {
        // TODO Auto-generated constructor stub
        initialization();
        for(int i=0;i<lop.size();i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println("");
            }
            Castle castle = lop.get(i).getCastle();
            castle.printData();
            scan.nextLine();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main();
    }

}
