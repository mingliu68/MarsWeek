import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {

        Thread.sleep(500);

        System.out.println("Welcome Back!!!");

        List<String> rocks = new ArrayList<String>();
        System.out.println("\nRock data downloading..... Done.");
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println(rocks);
        System.out.println("\nOne of the item is not an actual rock.  Please remove that from the list.");
        rocks.remove("not rock");
        System.out.println(rocks);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water" );
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        Scanner scan = new Scanner(System.in);
        System.out.print("\nWhich of the fossils would you like to learn more about? (Bird, fish, or tooth) ");
        String selection = scan.nextLine();

        if( selection.equalsIgnoreCase("Bird")) {
            System.out.println("You've selected " + selection + " fossil. It is " + fossils.get("Bird Fossil") );
        } else if( selection.equalsIgnoreCase("Fish")) {
            System.out.println("You've selected " + selection + " fossil. It is " + fossils.get("Fish Fossil") );
        } else if( selection.equalsIgnoreCase("Tooth")) {
            System.out.println("You've selected " + selection + " fossil. It is " + fossils.get("Tooth Fossil") );
        } else {
            System.out.println("We don't have that in the Fossil data.");
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Super Energy Shield");
        supplies.add("Instant Life Boost");
        supplies.add("Mega Strength");

        System.out.println("\n****___Supplies Before Expedition___****");
        Iterator itr = supplies.iterator();

        while(itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }

        supplies.remove("Mega Strength");

        System.out.println("\n****___Supplies After Expedition___****");

        itr = supplies.iterator();

        while(itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }

        scan.close();

    }
}
