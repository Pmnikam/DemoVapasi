//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Processor user1Proc=new Processor("14th Generation", 4);
        RAM user1Ram=new RAM("DDR5", 16);
        HDD user1Hdd= new HDD("SSD", 1024);
        Laptop user1Laptop=new Laptop("Ritu", user1Proc, user1Ram, user1Hdd);

        Processor user2Proc=new Processor("10th Generation", 2);
        RAM user2Ram=new RAM("DDR4", 8);
        HDD user2Hdd= new HDD("HDD", 2048);
        Laptop user2Laptop= new Laptop("Pratibha", user2Proc, user2Ram, user2Hdd);

        user1Laptop.displayConfiguration();
        user2Laptop.displayConfiguration();
        }
    }