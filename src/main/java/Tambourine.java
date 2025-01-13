class Tambourine extends UntunedPercussion {
    private int jinglesCount;
    private boolean hasSkin;

    public Tambourine(String model, String sound, int dynamics, int jinglesCount, boolean hasSkin) {
        super(model, sound, dynamics);
        this.jinglesCount = jinglesCount;
        this.hasSkin = hasSkin;
    }

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

    public void roll() {
        System.out.println(getModel() + " performs a roll with jingles.");
    }
}
