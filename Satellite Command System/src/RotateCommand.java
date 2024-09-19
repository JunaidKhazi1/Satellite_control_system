public class RotateCommand implements Command {
    private Satellite satellite;
    private String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        // check the direction
        if (direction.equalsIgnoreCase("North") ||
                direction.equalsIgnoreCase("South") ||
                direction.equalsIgnoreCase("East") ||
                direction.equalsIgnoreCase("West")) {
            satellite.setOrientation(direction);
            System.out.println("Orientation set to " + direction);
        } else {
            System.out.println("Invalid direction. Use North, South, East, or West.");
        }
    }
}
