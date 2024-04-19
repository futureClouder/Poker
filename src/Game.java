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
        String previousInput = "";
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("请输入您要出的牌： ");
            String currentInput = sc.nextLine();
            Map.Entry<String, List<String>> playerCard = list.get(i);
            while (!playerCard.getValue().contains(currentInput))
            {
                System.out.println("没有这张牌！ 请重试！");
                System.out.println("重新输入：");
                currentInput = sc.nextLine();
            }
            
            if (playerCard.getValue().contains(currentInput))
            {
                previousInput = Rule.gameRule(currentInput, previousInput);
                playerCard.getValue().remove(currentInput);
            }

            if(playerCard.getValue().isEmpty())
            {
                String user = playerCard.getKey();
                System.out.println(user + "赢得了游戏！");
                System.exit(1000);
            }
        }
    }
}
