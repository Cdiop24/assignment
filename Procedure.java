package classwork;

public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    private double charges;

    // No-arg constructor
    public Procedure() {
    }

    // Constructor with name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor with all attributes
    public Procedure(String procedureName, String procedureDate, String practitioner, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    // Accessors
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitioner() { return practitioner; }
    public double getCharges() { return charges; }

    // Mutators
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }
    public void setCharges(double charges) { this.charges = charges; }

    public String toString() {
        return procedureName + "\t" + procedureDate + "\t" + practitioner + "\t$" + String.format("%.2f", charges);
    }
}

