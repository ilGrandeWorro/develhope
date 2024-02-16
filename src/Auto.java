package develhope.src;

public class Auto {


    private String brand; //get
    private String model; //get
    private String carRegistration; //set-get
    private int engineCapacity; //get

    public Auto(String model, String brand, String carRegistration, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
        this.engineCapacity = engineCapacity;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

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


