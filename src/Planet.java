class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        // Set initial position based on distance
        this.x = distance;
        this.y = 0.0;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public void moveTo(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getXVel() {
        return velX;
    }

    public double getYVel() {
        return velY;
    }

    public void setXVel(double newVelX) {
        velX = newVelX;
    }

    public void setYVel(double newVelY) {
        velY = newVelY;
    }

    @Override
    public String toString() {
        return "Planet{name='" + name + "', radius=" + radius + ", mass=" + mass +
                ", distance=" + distance + ", x=" + x + ", y=" + y +
                ", velX=" + velX + ", velY=" + velY + '}';
    }
}
