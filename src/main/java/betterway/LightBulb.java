package betterway;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("badExample.LightBulb: Bulb tuned on ...");
    }

    @Override
    public void turnOff() {
        System.out.println("badExample.LightBulb: Bulb tuned off ... ");
    }
}