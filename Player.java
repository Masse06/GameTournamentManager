public class Player {
    private String nameTag;
    private String name;
    private String surname;
    private int level;
    private int points;

    public Player(String nameTag, String name, String surname, int level, int points) {
        this.nameTag = nameTag;
        this.name = name;
        this.surname = surname;
        this.level = level;
        this.points = points;
    }

    public Player() {
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return nameTag + ", " + name + ", " + surname +
                ", " + level + ", " + points;
    }

    // Methods
    
    public void winPoints() {
        this.points += 10;
    }

    public void upgradeLevel() {
        if (this.points >= 100 && this.level < 100) {
            this.level++;
        }
    }
}
