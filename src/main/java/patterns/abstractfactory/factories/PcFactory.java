package patterns.abstractfactory.factories;

import patterns.abstractfactory.services.Computer;
import patterns.abstractfactory.services.Pc;

public class PcFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new Pc(this.ram, this.hdd, this.cpu);
    }

    public PcFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
}
