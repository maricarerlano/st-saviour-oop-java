public class Tambourine extends UntunedPercussion {
    private int jinglesCount;
    private boolean hasSkin;

    // constructor
    public Tambourine(String model, String sound, int dynamics, int jinglesCount, boolean hasSkin) {
        super(model, sound, dynamics);
        this.jinglesCount = jinglesCount;
        this.hasSkin = hasSkin;
    }

    // setters and getters for number of jingles on tambourine, and hasSkin boolean
    public int getJinglesCount() {
        return jinglesCount;
    }

    public void setJinglesCount(int jinglesCount) {
        this.jinglesCount = jinglesCount;
    }

    public boolean isHasSkin() {
        return hasSkin;
    }

    public void setHasSkin(boolean hasSkin) {
        this.hasSkin = hasSkin;
    }

    // method to perform roll on tambourine
    public void roll() {
        System.out.println(getModel() + " performs a roll with jingles.");
    }
}
