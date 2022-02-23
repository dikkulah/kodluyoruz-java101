package BoxGame;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            loop();
        } else System.out.println("Sporcular sikletleri uyumsuz.");
    }

    private void loop() {
        while (f1.health > 0 && f2.health > 0) {
            System.out.println("===== Yeni Round ======");
            if (randomStart() == 1) {
                System.out.println("Rounda " + f1.name + " başladı.");
                f2.health = f1.hit(f2);
                if (isWin()) break;
                f1.health = f2.hit(f1);
            } else {
                System.out.println("Rounda " + f2.name + " başladı.");
                f1.health = f2.hit(f1);
                if (isWin()) break;
                f2.health = f1.hit(f2);
            }
            if (isWin()) break;
            printScore();
        }


    }

    private void printScore() {
        System.out.println("--------");
        System.out.println(f1.name + "Kalan Can : " + f1.health);
        System.out.println(f2.name + "Kalan Can : " + f2.health);
    }

    private boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    private boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    int randomStart() {
        return (int) (Math.random() * 2);
    }
}
