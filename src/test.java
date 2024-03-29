import java.util.*;

public class test
{

    public static List<String> cardConfig()
    {
        List<String> configure = new ArrayList<>();
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

    public static List<String> cardShuffle(List<String> arrayList)
    {
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        List<String> card = cardConfig();
        System.out.println(card);
        System.out.println(card.size());
        List<String>  cardShuffle = cardShuffle(card);

        System.out.println(cardShuffle);
        System.out.println(cardShuffle.size());
        Map<String, List> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        int remainCard = 0;
        if (cardShuffle.size()% userNum ==0)
        {
            remainCard = userNum;

        }
        else
        {
            remainCard = userNum + (cardShuffle.size()% userNum);
        }
        System.out.println(remainCard);
        int userCardNum = (cardShuffle.size()-remainCard) / userNum;
        int fromIndex = 0;
        int toIndex = 0;
        for (int i = 0; i < userNum; i++) {
            List <String> cards = new ArrayList<>();

            toIndex = fromIndex + userCardNum -1;

            cards.addAll(cardShuffle.subList(fromIndex,toIndex));

            map.put("P"+ (i+1),cards);
           // System.out.println(fromIndex + " " + toIndex);
            fromIndex = toIndex + 1;


        }

        System.out.println(map);
    }
}
