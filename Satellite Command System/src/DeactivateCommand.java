public class DeactivateCommand implements Command {
    private Satellite satellite;

    public DeactivateCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        if (!satellite.areSolar_Panels_Active()) {
            System.out.println("Solar panels are already deactivated.");
        } else {
            satellite.Deactivate_Solar_Panels();
            System.out.println("Solar panels deactivated.");
        }
    }
}
