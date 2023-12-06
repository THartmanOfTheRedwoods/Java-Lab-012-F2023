class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    /**
     * Constructs a sun object
     * @param name in English
     * @param radius in km
     * @param mass in kg
     * @param temp in kelvin
     */
    public Sun(String name, double radius, double mass, double temp, double x, double y) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", temp=" + temp +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
