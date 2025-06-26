public class HDD {

    private String type;
    private int size;

    public HDD(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void display()
    {
        System.out.println("Type: "+ this.type +","+"Size: "+ this.size);
    }
    @Override
    public String toString() {
        return "HDD{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
