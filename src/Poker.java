import java.util.*;

public class Poker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       Collection<String> card = cardConfig();
       ArrayList<String> Card = new ArrayList<>(card);
       Card = cardShuffle(Card);
       playerConfig(Card,sc);


    }

    public static Collection<String> cardConfig()
    {
        Collection<String> configure = new ArrayList<>();
        String[] color = {"黑桃","红桃","梅花", "方片"};
        String [] number = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        configure.add("大王");
        configure.add("小王");
        for (int i = 0; i < color.length; i++)
        {
            for (int j = 0; j < number.length; j++)
            {
                configure.add(color[i]+number[j]);
            }
        }
        //System.out.println(configure.size());

        return configure;
    }

    public static ArrayList<String> cardShuffle(ArrayList<String> arrayList)
    {
         Collections.shuffle(arrayList);
         return arrayList;
    }

    public static void playerConfig(ArrayList<String> arrayList, Scanner sc)
    {
        Collection<String> player01 = new ArrayList<>();
        Collection<String> player02 = new ArrayList<>();
        Collection<String> player03 = new ArrayList<>();
        Collection<String> remainCard = new ArrayList<>();

        

        for (int i = 0; i < arrayList.size()-3; i++)
        {
            player01.add(arrayList.remove(i));
            player02.add(arrayList.remove(i));
            player03.add(arrayList.remove(i));
        }

       // remainCard = arrayList;

        for (int i = arrayList.size()-3; i < arrayList.size(); i++)
        {
           remainCard.add(arrayList.get(i));

        }

        System.out.println("是否选择明牌： Yes/No");
        String mode = sc.nextLine();
        if (mode.equals("Yes"))
        {
            System.out.println("玩家1: " + player01);
            System.out.println("玩家2: " + player02);
            System.out.println("玩家3: " + player03);
            System.out.println("底牌: " + remainCard);
        }
        else
        {
            System.out.println("游戏即将开始");
        }
    }
}
