package patterns.abstractfactory;

import patterns.abstractfactory.factories.ComputerFactory;
import patterns.abstractfactory.factories.PcFactory;
import patterns.abstractfactory.factories.ServerFactory;
import patterns.abstractfactory.services.Computer;

public class Test {

    public static void main(String[] args) {
        Computer server = ComputerFactory.getComputerInstance(new ServerFactory("serverram", "serverhdd", "servercup"));
        System.out.println(server.getCpu());
        System.out.println(server.getHdd());
        System.out.println(server.getRam());

        Computer pc = ComputerFactory.getComputerInstance(new PcFactory("pcram", "pchdd", "pccup"));
        System.out.println(pc.getCpu());
        System.out.println(pc.getHdd());
        System.out.println(pc.getRam());
    }
}
