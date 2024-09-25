public class Feeder {
    public Feeder() {}

    public int currentFood;
    
    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05) currentFood = 0;

        else
        {
            int eaten = (int) (Math.random() * 41) + 10;
            currentFood -= eaten * numBirds;
            if (currentFood < 0) currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        while(numDays > 0)
        {
            simulateOneDay(numBirds);
            numDays--;
            days++;
            if(currentFood ==0 ) return days;
        }
        return days;
    }

    public String toString()
    {
        return "Current Food: " + currentFood;
    }
    public int getCurrentFood()
        {
            return currentFood;
        }

    public Feeder(int c)
    {
        currentFood = c;
    }

}