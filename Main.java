public class Main
{
    public static void main(String[] args)
    {
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));
        

    }
}
