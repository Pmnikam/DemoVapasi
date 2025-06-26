public class RAM {
    private String generation;
    private int size;

    public RAM(String generation, int size) {
        this.generation = generation;
        this.size = size;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void display()
    {
        System.out.println("Generation: "+ generation +","+"Size: "+ this.size);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "generation='" + generation + '\'' +
                ", size=" + size +
                '}';
    }
}
