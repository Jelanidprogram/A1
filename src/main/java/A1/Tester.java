package A1;

public class Tester {
    public static void main(String[] args) {
        // Package p1 = new Package("Alice", "Bob", 5.0, 40, 30, 20, "Trinidad",
        //     false, 0.0);

        // Package p2 = new Package((" "), "Bob", 5.0, 40, 30, 20,
        //       "Trinidad", false, 0.0);
        // System.out.println(p1);
        //System.out.println(p2);

        FreightTerminal terminal = new FreightTerminal("Local Hub");
        Package p1;

        Package[] packages = {

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Bella", "Jackson", 2.2, 4, 12, 25, "Jamaica"),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),
                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0),

                new Package("Frank", "lynn", 5.4, 32, 22, 12, "Grenada", true,
                        0.0)

        };

        for (Package p : packages) {
            terminal.receivePackage(p);
        }
        System.out.println(terminal.getPendingCount());

    Package p13 = new Package("Frank", "lynn", 5.4, 60, 40, 40, "Grenada", true,
            0.0);
    System.out.println(p13.getVolumetricWeightKg());

    Package p14 = new Package("Frank", "lynn", 5.4, 20, 20, 20, "Grenada", true,
            0.0);
    System.out.println(p14.getVolumetricWeightKg());

    Package p15 = new Package("Frank", "lynn", 8.0, 32, 22, 12, "Grenada", true,
            0.0);

    System.out.println(p15.getBillableWeightKg());


        Package test1 = new Package("Alice", "Bob", 5.0, 40, 30, 20, "Trinidad", false, 0.0);
        System.out.println("\n\n\nTracking ID: " + test1.getTrackingId());
        System.out.println("Destination: "+ test1.getDestination());
        System.out.println("Billable weight: " + test1.getBillableWeightKg() + " kg");
        System.out.println(test1.getLengthCm()  + " x " +  test1.getWidthCm() + " x " + test1.getHeightCm());
        System.out.println("Is Fragile --> " + test1.getIsFragile());
        System.out.println(test1.getShippingCost());

// M7 Checki
      Package p =  new Package("Alice","Bob",5.0,40,30,20,"Trinidad");
      System.out.println(p);
    }
}


