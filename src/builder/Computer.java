package builder;

public class Computer {
    //Required parameters
    private String processor;
    private String ram;

    //Optional parameters
    private String graphicsCard;
    private String ssd;

    private Computer(ComputerBuilder computerBuilder) {
        this.processor = computerBuilder.processor;
        this.ram = computerBuilder.ram;
        this.graphicsCard = computerBuilder.graphicsCard;
        this.ssd = computerBuilder.ssd;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private String processor;
        private String ram;

        private String graphicsCard;
        private String ssd;

        public ComputerBuilder(String processor, String ram) {
            this.processor = processor;
            this.ram = ram;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
