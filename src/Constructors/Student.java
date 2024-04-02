package Constructors;

public class Student {
    private int roll;
    private String name;
    private double per;

    public Student(){
        System.out.println("Object Created!!");
        roll=10;
        name="ravi";
        per=79.78;
    }
    public void show() {
        System.out.println("roll="+roll+",name="+name+",per"+per);
    }


}
