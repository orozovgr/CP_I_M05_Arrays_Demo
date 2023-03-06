import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        String[] users = {"Gavkhar", "Murodbek", "Gulshan", "Sanam", "Mokhinur", "Shokhista","Dunyo"};
        int[]  ages = {18, 6, 25, 24, 20, 15, 2};

        System.out.println(users[0]);
        System.out.println(users[users.length - 1]); //

        for(int x = 0; x < users.length; x++)
            System.out.printf("%8s\t%3d\n", users[x],ages[x]);

        int[] data = new int[100]; //Creates an array of 100 ints index 0 - 99

        for(int x=0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
            System.out.printf("%-4d\t", data[x]);
        }

        //Sum and Average
        int sum = 0;
        double average = 0.0;

        for(int x=0; x < data.length; x++)
        {
            sum = sum + data[x]; //sum += data[x]
        }

        System.out.println();

        average = (double)sum / data.length;

        System.out.printf("%-6d\t%5.2f", sum, average );

        // What is the average age?

        int ageSum = 0;

        for(int x = 0; x < ages.length; x++)
            ageSum += ages[x];

        System.out.println("Age total is " + ageSum);

        double ageAverage = 0.0;

        ageAverage = (double)ageSum / ages.length;

        System.out.printf("Average age: %5.2f" , ageAverage);

        // Linear search
        int target = 23;

        for(int x=0; x < data.length; x++)
        {
            if(data[x] == target)
                System.out.println(target + " found at " + x);
        }

        //min and max
        int min = data[0];
        int max = data[0];

        for(int x=0; x < data.length; x++)
        {
            if(data[x] > max)
                max = data[x];
            if(data[x] < min)
                min = data[x];

        }
        System.out.printf("\nMin: %4d Max: %4d\n", min, max);


    }
}