import java.util.ArrayList;

public class PercussionTest {
    public static void main(String[] args) {
        ArrayList<PercussiveInstruments> instruments = new ArrayList<>();

        Glockenspiel glockenspiel = new Glockenspiel("Yamaha Glockenspiel", "Bright chime", "C5", 37, "Rubber Mallet");
        Tambourine tambourine = new Tambourine("Pearl Tambourine", "Jingle sound", 8, 16, true);

        instruments.add(glockenspiel);
        instruments.add(tambourine);

        for (PercussiveInstruments instrument : instruments) {
            instrument.play();

            if (instrument instanceof Adjustable) {
                ((Adjustable) instrument).adjust();
            }

            if (instrument instanceof Glockenspiel) {
                ((Glockenspiel) instrument).glissando();
            }

            if (instrument instanceof Tambourine) {
                ((Tambourine) instrument).roll();
            }
        }
    }
}
