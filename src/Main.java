import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "R - Republican\tD - Democrat\tI - Independent\tO - Other\nChoose your affiliation: ";

        System.out.print(menu);
        menuChoice = in.nextLine();

        if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person!");
        }
        else if(menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You are affiliate with another party!");
        }
    }
}