public class Apple implements Tradable, Domesticatable{
    @Override
    public String sound() {
        return "*Sad apple noises";
    }

    @Override
    public int getPrice() {
        return 9999999;
    }
}
