import java.text.DecimalFormat;

public class Arrays
{
    public static void main(String[] args)
    {
        int[] points = {65, 65, 60, 51, 50};
        String[] names = {"Tottenham ","Man City  ",
                "Arsenal   ", "Liverpool",
                "Aston Villa" };
        double[] ave = {2.5, 2.375, 2.25, 2.125, 2};
        int[] played = {8, 8, 8, 8, 8};
        int[] scored = {18, 17, 15, 18, 19};

        DecimalFormat df = new DecimalFormat("#0.###");
        System.out.println(df.format(ave[0]) + "\t");

        System.out.println("\tTeam\t\tPlayed\tFor\tAve\tPts");    // print header
        int noTeams = names.length;                   // loop array size times
        for (int i = 0; i < noTeams; i++)
        {
            System.out.print((i+1) + "\t");               // Print position
            System.out.print(names[i] + "\t");            // print team name
            System.out.print(played[i] + "\t\t");         // print played
            System.out.print(scored[i] + "\t");           // print goals scored
            ave[i] = (double)scored[i] / played[i];               // calc ave
            System.out.print(df.format(ave[i]) + "\t");   // print average
            System.out.println(points[i] + "\t");         // print points
        }
    }
}