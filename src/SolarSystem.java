import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private List<Planet> planets;

    private Sun theSun;

    public SolarSystem() {
        planets = new ArrayList<>();

    }
    public void addPlanet(Planet planet) {
        planets.add(planet);

    }
    public void addSun(Sun sun) {
        this.theSun = sun;

    }
    public void showSun() {
        System.out.println(theSun.toString());
    }
    public void showPlanets() {
        for(Planet p : planets) {
            System.out.println(p.toString());
        }

    }
    public void movePlanets() {
            double G = 0.1;
            double dt = 0.001;

            for(Planet p : this.planets) {
                p.moveTo(p.getXPos() + dt * p.getXVel(),
                        p.getYPos() + dt * p.getYVel());

                double rx = this.theSun.getXPos() - p.getXPos();
                double ry = this.theSun.getYPos() - p.getYPos();
                double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

                double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
                double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

                p.setXVel(p.getXVel() + dt * accX);
                p.setYVel(p.getYVel() + dt * accY);
            }
        }

    }

