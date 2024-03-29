import java.util.*;

public class Poker
{

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


}
