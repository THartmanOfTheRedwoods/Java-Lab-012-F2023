public class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun",10.0, 100.0, 273);
        Planet mercury = new Planet("Mercury", 0.5, .01, 50.0, 1.0, 1.0);
        ss.addSun(theSun);
        ss.addPlanet(mercury);

        for (int i = 1; i < 10; i++) {
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();

        }

    }
}
