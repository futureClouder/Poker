import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User
{
    // userNum：玩家数量
    // card：调用洗牌算法后的扑克牌
    public static Map<String, List<String>> userConfig (int userNum, ArrayList<String> card)
    {

        Map<String,List<String>> user = new HashMap<>();
        List<String> poker = new ArrayList<>();
        int remainCardNum = 0;
        if(card.size() % userNum ==0)
        {
            remainCardNum = userNum;
        }
        else
        {
            remainCardNum = userNum + (card.size() % userNum);
        }

        for (int i = 0; i < userNum; i++)
        {
            for (int j = 0; j < card.size(); j++)
            {
              poker.add(card.remove(j));
              user.put("玩家" + (i+1) + ": ", poker);
            }
        }
        List<String> remainCard = new ArrayList<>();
        for (int i = 0; i < card.size()-remainCardNum; i++)
        {
            remainCard.add(card.get(i));
        }
        user.put("底牌: ",remainCard );
        return user;
    }
}
