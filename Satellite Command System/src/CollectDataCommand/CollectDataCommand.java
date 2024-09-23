package CollectDataCommand;
import Satellite.Satellite;
import Command.Command;
public class CollectDataCommand implements Command {
        private Satellite satellite;

        public CollectDataCommand(Satellite satellite) {
            this.satellite = satellite;
        }

        @Override
        public void execute() {

            if (satellite.areSolar_Panels_Active()) {
                satellite.Collect_Data();  // Assuming there's a method to increment data
                System.out.println("Data collected. Current data: " + satellite.getData_Collected());
            } else {
                System.out.println("Activate solar panels first to collect data.");
            }
        }
}
