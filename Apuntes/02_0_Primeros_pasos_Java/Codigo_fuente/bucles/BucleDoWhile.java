import javax.sound.sampled.SourceDataLine;

public class BucleDoWhile {

    public static void main(String[] args) {
        int fin = 10;
        int i = 0;
        do {
            System.out.println("Interación número :" + i + ".");
            i = i + 1;
        } while (i < fin);
    }
}
