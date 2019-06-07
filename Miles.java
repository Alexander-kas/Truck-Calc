package CalcMiles;

public class Miles {

    private String km;
    private double cent;
    private double tax;
    private double exToMile;
    private int drop;
    private int hours;

    public Miles() {
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getExToMile() {
        return exToMile;
    }

    public void setExToMile(double exToMile) {
        this.exToMile = exToMile;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getCent() {
        return cent;
    }

    public void setCent(double cent) {
        this.cent = cent;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }
}



