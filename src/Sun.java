public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        // Initialize other properties as needed...
    }

    public double getXVel() {
        return 0; // Sun is assumed to be stationary
    }

    public double getYVel() {
        return 0; // Sun is assumed to be stationary
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Sun{name='" + name + "', x=" + x + ", y=" + y + "}";
    }

    public double getYPos() {
        return y;
    }

    public double getXPos() {
        return x;
    }
}
