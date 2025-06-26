public class Laptop {

    private String owner;
    private Processor processor;
    private RAM ram;
    private HDD hdd;

    public Laptop(String owner, Processor processor, RAM ram, HDD hdd) {
        this.owner=owner;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void displayConfiguration()
    {
        System.out.println("Computer Configuration for "+ owner);
        processor.display();
        ram.display();
        hdd.display();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "owner='" + owner + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
}
