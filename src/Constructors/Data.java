package Constructors;

public class Data {
    private int roll;
    private String name;
    private double per;

    public Data(int r, String n, double p){
        roll=r;
        name=n;
        per=p;

    }
    public void show()
    {
        System.out.println("roll="+roll+",name="+name+",per="+per);
    }

}
