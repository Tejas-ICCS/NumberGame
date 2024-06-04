import java.util.Random;
import java.util.Scanner;

class check{

    public void gameRule()
    {
        System.out.println("\t ' Each level has 5 rounds ' ");
    }

    public int checkScore(int value){
        int score=0;

        if(value == 1)
            score = 10;

        else if(value == 2)
            score = 8;

        else if(value == 3)
            score = 6;

        else if(value == 4)
            score = 4;

        else if(value == 5)
            score = 2;

        else 
            score = 0;

        return score;
    }
}

public class Number {
    public static void main(String[] args) {
        int count = 0,flag = 0,i = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        check cs = new check();

        System.out.println("\n\t\tNUMBER GAME ");
        System.out.println("----------------------------------------------");
        cs.gameRule();
        while(true)
        {
            
            System.out.print("\n\n\t1 . Start Game \t\t2. Stop Game  ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    int x = rand.nextInt(100);
                    System.out.println(x);
                while(count<=4)
                {
                    count++;
                    i++;
                    System.out.print("\n\t"+ i + ") Enter number between 0 to 100  ");
                    int us = sc.nextInt();
                    
                    if(us == x)
                    {
                        flag = 1;
                        System.out.println("\tCongratulations You win ");
                        int score = cs.checkScore(count);
                        System.out.println("\tYour score is "+score);
                        System.out.println("----------------------------------------------");
                        count = 0;
                        i = 0;
                        break;
                    }
                    else if(us < x)
                    {
                        System.out.println("\t\tTo close ");
                    }
                    else
                    {
                        System.out.println("\t\tTo High ");
                    }
                }
                if(flag == 0){
                    
                    System.out.println("\tYour Score is 0");
                    System.out.println("\tGenerated Number is "+ x);
                    System.out.println("----------------------------------------------");
                }
                    
                break;

                case 2:
                    System.exit(1);
                    break;
            }
        }
    }
}
