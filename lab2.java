class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showIdentity() {
        System.out.println("Name: " + name);
    }
}

class SupremeLeader extends Person {
    private String title;
    private String secretWeapon;

    public SupremeLeader(String name, String title) {
        super(name);
        this.title = title;
    }

    @Override
    public void showIdentity() {
        System.out.println("Supreme Leader " + name + ", also known as " + title);
    }

    public void issueDecree() {
        System.out.println(name + " has issued a supreme decree.");
    }

    public void setSecretWeapon(String weapon) {
        this.secretWeapon = weapon;
    }
}

class RoyalServant extends Person {
    private String title;
    private String loyaltyBadge;

    public RoyalServant(String name, String title, String loyaltyBadge) {
        super(name);
        this.title = title;
        this.loyaltyBadge = loyaltyBadge;
    }

    @Override
    public void showIdentity() {
        System.out.println("Royal Servant " + name + ", Title: " + title);
    }

    public void serveLeader() {
        System.out.println(name + " is serving the Supreme Leader.");
    }

    public String getLoyaltyBadge() {
        return loyaltyBadge;
    }
}

public class Main {
    public static void main(String[] args) {
        SupremeLeader leader = new SupremeLeader("Aladeen", "The Supreme");
        RoyalServant servant = new RoyalServant("Fadil", "Chief Bodyguard", "Loyalty to the Death");

        leader.showIdentity();
        servant.showIdentity();
        leader.issueDecree();
        servant.serveLeader();
        System.out.println("Royal Servant's loyalty badge: " + servant.getLoyaltyBadge());
        leader.setSecretWeapon("Pointy Nuclear Missile");
    }
}