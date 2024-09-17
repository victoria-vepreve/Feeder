public class Main
{
    public static void main(String[] args)
    {

        Feeder g = new Feeder(500);

        System.out.println(g.getCurrentFood());
        // System.out.println(g.simulateOneDay());
        int random = (int) (Math.random() * 40 + 10);
        System.out.println(random);


    }
}
