import java.util.ArrayList;

public class PercussionTest {
    public static void main(String[] args) {
        // array list to store instruments
        ArrayList<PercussiveInstruments> instruments = new ArrayList<>();
        
        // specific instances of Glockenspiel and Tambourine
        Glockenspiel glockenspiel = new Glockenspiel("Yamaha Glockenspiel", "Bright chime", "C5", 37, "Rubber Mallet");
        Tambourine tambourine = new Tambourine("Pearl Tambourine", "Jingle sound", 8, 16, true);

        // adds the created instruments to array list
        instruments.add(glockenspiel);
        instruments.add(tambourine);

        // loops over list of instruments
        for (PercussiveInstruments instrument : instruments) {
            instrument.play();

            // checks if instrument is adjustable
            if (instrument instanceof Adjustable) {
                ((Adjustable) instrument).adjust();
            }

            // checks if  instrument is a glockenspiel
            if (instrument instanceof Glockenspiel) {
                ((Glockenspiel) instrument).glissando();
            }

            // checks if instrument is a tambourine
            if (instrument instanceof Tambourine) {
                ((Tambourine) instrument).roll();
            }
        }
    }
}
