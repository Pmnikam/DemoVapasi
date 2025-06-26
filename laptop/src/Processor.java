public class Processor {
    private String generation;
    private int ghz;

    public Processor(String generation, int ghz) {
        this.generation = generation;
        this.ghz = ghz;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getGhz() {
        return ghz;
    }

    public void setGhz(int ghz) {
        this.ghz = ghz;
    }

    void display()
    {
        System.out.println("Generation: "+ this.generation +","+"GHz: "+ this.ghz);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "generation='" + generation + '\'' +
                ", ghz=" + ghz +
                '}';
    }
}
