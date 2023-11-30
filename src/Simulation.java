public class Simulation {
    public static void main(String[] args){
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("Sun",432690, 5000, 1000, 0, 0);
        Planet mercury = new Planet("Mercury", 10000, 1516, 3641, 47, 5.78);
        ss.addSun(theSun);
        ss.addPlanet(mercury);
        for(int l = 1; l < 10; l++){
            ss.movePlanets();
            ss.showPlanets();
            ss.showSun();
        }
    }
}
