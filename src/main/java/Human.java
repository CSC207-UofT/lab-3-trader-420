public class Human implements Tradable, Drivable, Domesticatable{

    private int maxSpeed; //max running speed in km/h
    private int price; //price of human in $CAD

    public Human(){
        this.maxSpeed = 100;
        this.price = 100;
    }

    /**
     * Return the sound made by this creature.
     *
     * @return    The sound made by this creature.
     **/
    @Override
    public String sound(){
        return "I love UofT";
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed(){
        this.maxSpeed += 100;
    }

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed(){
        this.maxSpeed -= 100;
    }


    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    /**
     * Return the current price of the human.
     *
     * @return    The current price of the human.
     **/
    @Override
    public int getPrice(){
        return this.price;
    }

    /**
     * Return the string representation of a Human.
     **/
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +" Price: "+this.getPrice()+")";
    }
}
