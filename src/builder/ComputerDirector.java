package builder;

public class ComputerDirector {
    private Computer.ComputerBuilder computerBuilder;

    public void setComputerBuilder(Computer.ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer createGamingComputer() {
        return this.computerBuilder
                .setGraphicsCard("Nvidea GTX 8GB")
                .setSsd("1TB Nvme")
                .build();
    }

    public Computer createBusinessComputer() {
        return this.computerBuilder
                .setSsd("256 GB Nvme")
                .build();
    }
}
