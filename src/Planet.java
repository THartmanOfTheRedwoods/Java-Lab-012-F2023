public class Planet {
    private String name;
    private double mass;
    private double radius;
    private double velX;
    private double velY;
    private double x;
    private double y;
    private double distance;
    public Planet(String name, double mass, double radius, double distance, double velX, double velY){
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        this.y = 0.0;
        this.x = distance;

    }
    public double getXPos(){
        return x;
    }
    public double getYPos(){
        return y;
    }
    public double getVelX(){
        return this.velX;
    }
    public double getVelY(){
        return this.velY;
    }
    public void moveTo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }
    public void setXVel(double newVelX){
        this.velX = newVelX;
    }
    public void setYVel(double newVelY){
        this.velY = newVelY;
    }
    @Override
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Distance: %f", name, x, y, velX, velY, distance);
    }
}
