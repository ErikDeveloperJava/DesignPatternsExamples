package design.pattern.test.structure_patterns.facade;

/**
 * All classes or interfaces are Facade which have money private logic but from outside can see a few public methods
 **/
public class WashingMachine {

    public void heavilySoiled() {
        setWaterTemperature(100);
        setWashCycleDuration(90);
        setSpinCycleDuration(10);
        addDetergent();
        addFabricSoftener();
        heatWater();
        startWash();
    }

    public void lightlySoiled() {
        setWaterTemperature(40);
        setWashCycleDuration(20);
        setSpinCycleDuration(10);
        addDetergent();
        heatWater();
        startWash();
    }

    private void startWash() {

    }

    private void heatWater() {

    }

    private void addFabricSoftener() {

    }

    private void addDetergent() {

    }

    private void setSpinCycleDuration(int i) {

    }

    private void setWashCycleDuration(int i) {

    }

    private void setWaterTemperature(int i) {

    }
}
