public class Main
{
    public static void main(String[] args)
    {
        // Test Case 1
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a);

        //Test Case 2
        Feeder b = new Feeder(1000);
        b.simulateOneDay(22);
        
        //Test Case 3
        Feeder c = new Feeder(100);
        c.simulateOneDay(5);

        //Test Case 4
        Feeder d = new Feeder(2400);
        d.simulateManyDays(10,4);
        System.out.println(d);

        //Test Case 5
        Feeder e = new Feeder(250);
        e.simulateManyDays(10, 5);

        //Test Case 6
        Feeder f = new Feeder(0);
        f.simulateManyDays(5, 10);


    }
}
