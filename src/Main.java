//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        //Stampa le varie versioni
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'OffsetDateTime dalla stringa
        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        // Formattazione della data in FULL, MEDIUM e SHORT
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        // Stampa delle varie versioni formattate della data
        System.out.println("Data formattata in stile FULL: " + dateTime.format(fullFormatter));
        System.out.println("Data formattata in stile MEDIUM: " + dateTime.format(mediumFormatter));
        System.out.println("Data formattata in stile SHORT: " + dateTime.format(shortFormatter));
    }
}