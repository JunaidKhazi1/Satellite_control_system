package ActivateCommand;
import Command.Command;
import Satellite.Satellite;

public class ActivateCommand implements Command {
    private Satellite satellite;

    public ActivateCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        if (satellite.areSolar_Panels_Active()) {
            System.out.println("Solar panels are already activated.");
        } else {
            satellite.Activate_Solar_Panels();
            System.out.println("Solar panels activated.");
        }
    }
}
