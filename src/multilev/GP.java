package multilev;

class GP {
    String sName;
    String bg;

    public GP() {
        System.out.println("GP Constructor");
    }

    public GP(String sName, String bg) {
        this();
        this.sName = sName;
        this.bg = bg;
        System.out.println("GP pConstr");
    }

    void eat(){
        System.out.println("Eat Healthy and fresh food");
    }

    String canDrive(String car){
        System.out.println(car);
        return "car";
    }
}

class Parent extends GP{
    String name;

    void walk(){
        System.out.println("Parents like walking in garden");
    }

    int stepCount(int count){
        System.out.println(count);
        return count;

    }

    Parent(){
        super();
        System.out.println("Parent Constructor");
    }
    Parent(String name){
        super();
        this.name=name;
        System.out.println("Parent pConstru");
    }
}
class Child extends Parent{
    String gender;

    Child(){
        super();
        System.out.println("Child Constructor");
    }
    Child(String gender){
        super();
        this.gender=gender;
        System.out.println("Child pConstr---"+gender);
    }

    void lovePlay(){
        System.out.println("Children love playing in garden");
    }
}
class Main{
    public static void main(String[] args) {
        Child c1= new Child();
        c1.lovePlay();
        c1.stepCount(2000);
        c1.eat();
        c1.canDrive("Tata Punch");

        Child c2= new Child("male");
        c2.lovePlay();
        c2.stepCount(3000);
        c2.canDrive("i20");


    }
}
