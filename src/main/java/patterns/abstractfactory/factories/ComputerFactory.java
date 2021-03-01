package patterns.abstractfactory.factories;

import patterns.abstractfactory.services.Computer;

public class ComputerFactory {

    public static Computer getComputerInstance(ComputerAbstractFactory caf) {
        return caf.createComputer();
    }

}
