package hoank.patterns.decorator;

public class Disk extends ComponentDecorator {
    Computer computer;

    public Disk(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return this.computer.description() + " and a disk";
    }
}
