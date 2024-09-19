public class CollectDataCommand implements Command {
    private Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.Collect_Data();
        System.out.println("the data is collected"+"  "+satellite.getData_Collected());
    }
}
