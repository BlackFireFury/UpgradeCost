import java.util.Scanner;
class UpgradeCost
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last level of Monster (400 probably?)");
        int LastLvl = sc.nextInt();
        System.out.println("Enter Cost increase on each level of Monster (5 or 500)");
        int CostPerLvl = sc.nextInt();
        System.out.println("Enter Current level of required Monster");
        int CurrentLvl = sc.nextInt();
        
        int temp = 0, total = 0;
        for(int i=CurrentLvl; i<=LastLvl; i++)
        {
            total = total + (i * CostPerLvl);
            temp = total;
        }
        System.out.println("Amount of coins needed to get to lvl " + LastLvl + " is roughly = " + total);
    }
}