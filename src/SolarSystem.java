import java.util.ArrayList;
import java.util.List;
public class SolarSystem {
    private final Sun sun;
    private final List<Planet> planets;

    public SolarSystem(Sun sun) {
        this.sun = sun;
        this.planets = new ArrayList<>();
    }

    public Sun getSun() {
        return sun;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }
}

