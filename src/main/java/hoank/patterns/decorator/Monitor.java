package hoank.patterns.decorator;

public class Monitor extends ComponentDecorator {
    Computer computer;
    public Monitor (Computer cp) {
        this.computer = cp;
    }

    @Override
    public String description() {
        return this.computer.description() + " and a monitor";
    }
}
