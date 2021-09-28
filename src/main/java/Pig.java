public class Pig implements Tradable, Drivable, Domesticatable{
    private int maxSpeed;
    public Pig() {
        this.maxSpeed = 30;
    }

    @Override
    public String sound() {
        return "heeeer!";
    }

    @Override
    public void upgradeSpeed() {this.maxSpeed += 10;}

    @Override
    public void downgradeSpeed() {this.maxSpeed -= 10;}

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 99;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + " Price: "+this.getPrice() + ")";
    }
}
