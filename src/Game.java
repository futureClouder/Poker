import java.util.*;

public class Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户数量：");
        int userNum = sc.nextInt();
        ArrayList<String> card = Poker.cardShuffle(Poker.cardConfig());
        Map<String, List<String>> userConfig = User.userConfig(userNum,card);
        Set<Map.Entry<String, List<String>>> convertToSet = User.convertToSet(userConfig);
        List<Map.Entry<String, List<String>>> list = convertToSet.stream().toList();

    }
}
