public class Main
{
    public static void main(String[] args) 
    {
    Feeder f = new Feeder();
    System.out.println(f);
    //System.out.println(f.currentFood);
    System.out.println(f.getCurrentFood());
    Feeder g = new Feeder(500);
    System.out.println(g.getCurrentFood());
    g.simulateOneDay(12);
    //System.out.println(Math.random());  = 0.248924827482......
    //double random = Math.random() * 10;    
    //System.out.println(random);  = 4.59375375......
    //int random = (int) Math.random() * 10;
    //System.out.println(random);   = 0
    //int random = (int)(Math.random() * 10);
    //System.out.println(random);    = 2
    int random = (int)(Math.random() * 10 + 1);
    System.out.println(random);
    }
}