package Satellite;

public class Satellite {
    private String Orientation = "North";
    private boolean Solar_Panel_Active = false;
    private int Data_Collected = 0;

    // Getters
    public String getOrientation() {
        return Orientation;
    }

    public boolean areSolar_Panels_Active() {
        return Solar_Panel_Active;
    }

    public int getData_Collected() {
        return Data_Collected;
    }

    // Setters
    public void setOrientation(String orientation) {
        this.Orientation = orientation;
    }

    public void Activate_Solar_Panels() {
        Solar_Panel_Active = true;
    }

    public void Deactivate_Solar_Panels() {
        Solar_Panel_Active = false;
    }

    public void Collect_Data() {
        if (Solar_Panel_Active) {
            Data_Collected += 10;
        } else {
            System.out.println("Solar panels are inactive. Data cannot be collected.");
        }
    }

    // Status
    public String getStatus() {
        return "Orientation: " + Orientation + ", Solar panels: " + (Solar_Panel_Active ? "Active" : "Inactive") + ", Data collected: " + Data_Collected;
    }
}
