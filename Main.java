
public class Main {
    public static void main(String[] args) {
        ToyotaVIOS toyotaVIOS = new ToyotaVIOS("All-weather");
        toyotaVIOS.drive();
        toyotaVIOS.stop();
        toyotaVIOS.setColor("Red");
        toyotaVIOS.setSpeed(200);
        toyotaVIOS.setPrice(20000.0);

        U2SpyPlane u2SpyPlane = new U2SpyPlane(80.5);
        u2SpyPlane.fly();
        u2SpyPlane.stop();
        u2SpyPlane.setPrice(1000000.0);
        u2SpyPlane.setColor("Gray");
        u2SpyPlane.setSpeed(800);

        FandangoYacht fandangoYacht = new FandangoYacht("Blue");
        fandangoYacht.floatOnWater();
        fandangoYacht.stop();
        fandangoYacht.setSpeed(30);
        fandangoYacht.setColor("Yellow");
        fandangoYacht.setPrice(500000.0);
        
        System.out.println();
        System.out.println("Toyota VIOS color: " + toyotaVIOS.getColor());
        System.out.println("Toyota VIOS speed: " + toyotaVIOS.getSpeed());
        System.out.println("Toyota VIOS price: $" + toyotaVIOS.getPrice());
        System.out.println();

        System.out.println("U-2 Spy Plane color: " + u2SpyPlane.getColor());
        System.out.println("U-2 Spy Plane speed: " + u2SpyPlane.getSpeed());
        System.out.println("U-2 Spy Plane price: $" + u2SpyPlane.getPrice());
        System.out.println();

        System.out.println("Fandango Yacht color: " + fandangoYacht.getColor());
        System.out.println("Fandango Yacht speed: " + fandangoYacht.getSpeed());
        System.out.println("Fandango Yacht price: $" + fandangoYacht.getPrice());
    }
}
