public class Glockenspiel extends TunedPercussion {
    private int numberOfKeys;
    private String malletType;

    // constructor
    public Glockenspiel(String model, String sound, String pitch, int numberOfKeys, String malletType) {
        super(model, sound, pitch);
        this.numberOfKeys = numberOfKeys;
        this.malletType = malletType;
    }

    // setters and getters for number of keys and and mallet type
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

    // method to switch mallet
    public void switchMallet() {
        System.out.println("Switching to a different mallet for " + getModel());
    }

    // method to perform gliss
    public void glissando() {
        System.out.println("Performing a glissando on " + getModel());
    }
}