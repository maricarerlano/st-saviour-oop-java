class Glockenspiel extends TunedPercussion {
    private int numberOfKeys;
    private String malletType;

    public Glockenspiel(String model, String sound, String pitch, int numberOfKeys, String malletType) {
        super(model, sound, pitch);
        this.numberOfKeys = numberOfKeys;
        this.malletType = malletType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getMalletType() {
        return malletType;
    }

    public void setMalletType(String malletType) {
        this.malletType = malletType;
    }

    public void switchMallet() {
        System.out.println("Switching to a different mallet for " + getModel());
    }

    public void glissando() {
        System.out.println("Performing a glissando on " + getModel());
    }
}