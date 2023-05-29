// Base class
class Vehicle {
    private int speed;
    private String color;
    private double price;

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Getters and setters for speed, color, and price
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
