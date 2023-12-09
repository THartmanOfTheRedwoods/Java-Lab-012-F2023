// Sun class
class Sun {
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
    }

    public double getX() {
        return 0; // Sun doesn't move in this simulation
    }

    public double getY() {
        return 0; // Sun doesn't move in this simulation
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                '}';
    }
}
