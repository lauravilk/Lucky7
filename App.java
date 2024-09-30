import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int money;
        String input; 
        

        System.out.println("Kuinka paljon rahaa on käytettävissä?");
        input = in.nextLine();
        money = Integer.parseInt(input);

        int i = 0;
        while (money >0) { //toistaa looppia niin kauan kun rahaa on enemmän kuin 0e
        // arvotaan ja tulostetaan numerot
        int num1 = random.nextInt(10)+1;
        int num2 = random.nextInt(10)+1;
        int num3 = random.nextInt(10)+1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //vähennetään money-1 jokaisella kierroksella
        money = money-1;

        // Tarkista onko joku luvuista 7
        if (num1==7 || num2==7 || num3==7)
        {
            System.out.println("Onnea voitit 3e");
            money = money +3;
        }

        else if (num1==7 && num2==7 || num1==7 && num3==7 || num2==7 && num3==7)
        {
            System.out.println("Onnea voitit 5e");
            money = money+5;
        }

        else if (num1==7 && num2==7 && num3==7)
        {
            System.out.println("Onnea voitit 7e");
            money = money+7;
        }

        else 
        {
            System.out.println("Hävisit!");
        }

        // Rahaa jäljellä
        System.out.println("Rahaa jäljellä " +money + "e");
        System.out.println();

        // Jos rahaa jäljellä 0, break
        if (money == 0)
        {
            break;
        }

        // Kysytään haluaako pelata uudestaan
        System.out.println("Haluatko pelata uudestaan? (yes or no)");
        input = in.nextLine();

        if (input.equals("yes"))
        {
            i++;
            continue;
        }

        else if (input.equals("no"))
        {
            break;
        }
    }

        System.out.println();
        System.out.println("Thank you for playing!");
    }
}
