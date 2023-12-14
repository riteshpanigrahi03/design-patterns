package builder;

public class BuilderDemo {
    public static void main(String[] args) {
//        Computer computer1 = new Computer.ComputerBuilder("Intel i7", "16 GB")
//                                        .setSsd("256 GB")
//                                        .build();
//        System.out.println("Computer1 - " + computer1);
//
//        Computer computer2 = new Computer.ComputerBuilder("Intel i9", "32 GB")
//                .setSsd("1 TB")
//                .setGraphicsCard("NVIDIA GTX 1660")
//                .build();
//        System.out.println("Computer2 - " + computer2);

        ComputerDirector computerDirector = new ComputerDirector();

        Computer.ComputerBuilder gamingComputerBuilder = new Computer.ComputerBuilder("Intel i9", "32GB");
        computerDirector.setComputerBuilder(gamingComputerBuilder);
        Computer gamingComputer = computerDirector.createGamingComputer();
        System.out.println("Gaming Computer - " + gamingComputer);

        Computer.ComputerBuilder businessComputerBuilder = new Computer.ComputerBuilder("Intel Xeon", "16GB");
        computerDirector.setComputerBuilder(businessComputerBuilder);
        Computer businessComputer = computerDirector.createBusinessComputer();
        System.out.println("Business Computer - " + businessComputer);
    }
}
