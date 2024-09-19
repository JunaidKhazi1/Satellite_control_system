import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        Scanner scanner = new Scanner(System.in);
        String command;

        showMenu(satellite);


        command = scanner.nextLine().trim();
        while (!command.equalsIgnoreCase("exit")) {
            processCommand(command, satellite);
            showMenu(satellite);
            command = scanner.nextLine().trim();
        }


        scanner.close();
        System.out.println("Exiting program...");
        System.out.println("Final satellite state:");
        System.out.println(satellite.getStatus());
        System.out.println("deactivateingPanels......");
        System.out.println("P0rogramExited...");
    }

    // show menu
    private static void showMenu(Satellite satellite) {


        if (satellite.areSolar_Panels_Active()) {
            System.out.println("( Options: rotate <direction>, deactivatePanels, collectData, status, exit )");
        } else {
            System.out.println("(Options: rotate <direction>, activatePanels, status, exit)");
        }
    }

    // Function to process a given command
    private static void processCommand(String command, Satellite satellite) {
        String[] commandParts = command.split(" ", 2);  // Split  string into base and argument
        String baseCommand = commandParts[0].toLowerCase();           // Convert to lowercase for case-insensitive matching
        String argument = commandParts.length > 1 ? commandParts[1].trim() : "";  // Argument if available

        switch (baseCommand) {
            case "rotate":
                if (!argument.isEmpty()) {
                    Command rotateCommand = new RotateCommand(satellite, argument);  // Create RotateCommand object
                    rotateCommand.execute();
                } else {
                    System.out.println("Please specify a direction for rotation (e.g., rotate North).");
                }
                break;

            case "activatepanels":
                Command activatePanelsCommand = new ActivateCommand(satellite);  // Create ActivatePanelsCommand object
                activatePanelsCommand.execute();
                break;

            case "deactivatepanels":
                Command deactivatePanelsCommand = new DeactivateCommand(satellite);  // Create DeactivatePanelsCommand object
                deactivatePanelsCommand.execute();
                break;

            case "collectdata":
                Command collectDataCommand = new CollectDataCommand(satellite);  // Create CollectDataCommand object
                collectDataCommand.execute();
                break;

            case "status":
                System.out.println(satellite.getStatus());  // Print current status
                break;

            default:
                System.out.println("Invalid command. Please try again.");
                break;
        }
    }
    }


