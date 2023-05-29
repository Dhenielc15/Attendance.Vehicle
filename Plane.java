// Plane class (subclass of Vehicle)
class Plane extends Vehicle {
    private double wingsSpan;

    public void fly() {
        System.out.println("Plane is flying.");
    }

    // Getter and setter for wingsSpan
    public double getWingsSpan() {
        return wingsSpan;
    }

    public void setWingsSpan(double wingsSpan) {
        this.wingsSpan = wingsSpan;
    }
}

// U-2 Spy Plane class (subclass of Plane)
class U2SpyPlane extends Plane {
    public U2SpyPlane(double wingsSpan) {
        setWingsSpan(wingsSpan);
    }
    @Override
    public void fly() {
    	System.out.println();
        System.out.println("U-2 Spy Plane is flying.");
       
    }
}
