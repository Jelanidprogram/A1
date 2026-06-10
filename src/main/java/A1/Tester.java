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
    }
}