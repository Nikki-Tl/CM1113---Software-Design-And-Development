public class Moves {
    private String name;
    private String description;
    private int damage;

    public Moves(String name, String description, int damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString(){
        String displayMove = "Name: " + name + "\n" + 
                                "Description: " + description + "\n" +
                                "Damage: " + damage + "\n";        
            return displayMove;
    }
}
