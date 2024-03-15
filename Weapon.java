public class Weapon {

    private String type;
    private int damage;
    private int manaCost;
    private int durability;
    private String itemDescription;

    public Weapon(String type, int damage, int manaCost, int durability, String itemDescription) {
        this.type = type;
        this.damage = damage;
        this.manaCost = manaCost;
        this.durability = durability;
        this.itemDescription = itemDescription;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getManaCost() {
        return manaCost;
    }
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String toString(){
    String displayWeapon = "Weapon: " + type + "\n" + "\n" + 
                            "Damage: " + damage + "\n" +
                            "Mana Cost: " + manaCost + "\n" +
                            "Durability " + durability + "\n" +
                            itemDescription;
                            
        return displayWeapon;
    }
}
