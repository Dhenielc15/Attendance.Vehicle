// Car class (subclass of Vehicle)
class Car extends Vehicle {
    private String tireType;

    public void drive() {
        System.out.println("Car is driving.");         

    }

    // Getter and setter for tireType
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
}

// Toyota VIOS class (subclass of Car)
class ToyotaVIOS extends Car {
    public ToyotaVIOS(String tireType) {
        setTireType(tireType);
    }

    @Override
    public void drive() {
    	System.out.println();
        System.out.println("Toyota VIOS is driving.");
        

    }
}