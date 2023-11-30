import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;
    public SolarSystem(){
        planets = new ArrayList<>();
    }
    public void addPlanet(Planet p){
        planets.add(p);
    }
    public void addSun(Sun s){
        this.theSun = s;
    }
    public void showPlanets(){
        for (Planet p : planets){
            System.out.println(p.toString());
        }
    }
    public void showSun(){
        System.out.println(theSun.toString());
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getVelX(),
                    p.getYPos() + dt * p.getVelY());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getVelX() + dt * accX);
            p.setYVel(p.getVelY() + dt * accY);
        }
    }


}
