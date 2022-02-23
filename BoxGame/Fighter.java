package BoxGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter fighter) {
        System.out.println("---------");
        System.out.println(this.name + " isimli boksör " + fighter.name + "'a " + this.damage + " hasar vurdu.");

        if (fighter.dodge()) {
            System.out.println(fighter.name + "gelen hasarı savurdu");
            return fighter.health;
        }
        return Math.max(fighter.health - this.damage, 0);
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
