package binus.app.castlevscastle;


    public abstract class Hero {

        protected String name;
        protected String type;
        protected int level;
        protected int heroPower;
        protected int rangeAttack;


        public Hero(String name, String type, int level, int heroPower, int rangeAttack) {
            super();
            this.name = name;
            this.type = type;
            this.level = level;
            this.heroPower = heroPower;
            this.rangeAttack = rangeAttack;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getLevel() {
            return level;
        }
        public void setLevel(int level) {
            this.level = level;
        }
        public int getHeroPower() {
            return heroPower;
        }
        public void setHeroPower(int heroPower) {
            this.heroPower = heroPower;
        }
        public int getRangeAttack() {
            return rangeAttack;
        }
        public void setRangeAttack(int rangeAttack) {
            this.rangeAttack = rangeAttack;
        }

        public void levelUp() {
            this.level = this.level+1;
        }

    }


