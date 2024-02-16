package develhope;

public class Auto {

    private String brand; //get
    private String model; //get
    private String carRegistration; //set-get
    private int engineCapacity; //get

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Auto (String carRegistration){
        this.carRegistration = carRegistration;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carRegistration='" + carRegistration + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
