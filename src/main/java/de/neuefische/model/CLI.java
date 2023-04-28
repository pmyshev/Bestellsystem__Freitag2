package de.neuefische.model;

import java.util.HashMap;
import java.util.Map;

public class CLI {
    String leftAlignFormat = "| %-8s | %-18s |%n";
    Map<String, String> commandsDescription = Map.ofEntries(
            Map.entry("1","Produktliste"),
            Map.entry("2","Zum Warenkorb hinzufügen"),
            Map.entry("3","Meine Bestellungen"),
            Map.entry("0^0-1=?","Überraschung"),
            Map.entry("q","Beenden")
    );

    public void printMainMenu(){
        System.out.format("+------------+------------------+%n");
        System.out.format("|   Befehl   |   Beschreibung   |%n");
        System.out.format("+------------+------------------+%n");
        for (Map.Entry<String, String> entry : commandsDescription.entrySet()) {
            System.out.format(leftAlignFormat, entry.getKey(), entry.getValue());
        }
        System.out.format("+----------+--------------------+%n");
    }

    public void printPoem(){
        String[] poem = {
                "Zu spät, zu spät,",
                "die Java-Coaches sind zu spät,",
                "sie kommen trödelnd an den Raum,",
                "doch der Professor wartet nicht im Traum.",
                "Sie hätten früher aufstehen müssen,",
                "nun müssen sie die Konsequenzen büßen,",
                "denn der Unterricht hat längst begonnen,",
                "ohne sie wird er weitergesponnen.",
                "Zu spät, zu spät,",
                "jetzt müssen sie sich beeilen und rennen,",
                "damit sie nicht den ganzen Stoff verpennen.",
                "",
                "Kit Na-In\n" +
                        " "};

        System.out.println();
        for (int i=0; i <poem.length; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( poem[i] );
        }
    }
}
