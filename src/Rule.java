import java.util.*;
import java.util.stream.Collectors;

public class Rule
{

    /*
    old：函数传参为Set<Map.Entry<String, List<String>>> set，之后在main函数里面根据用户数量选择调动次数
    例如如果有三个玩家，那么就选择在main函数里面调动三次，四个则调动四次，但是发现无法确保set每次都能更新

     */
   public static String gameRule(String currentInput, String previousInput)
   {
       String results = "";
       int current = currentInput.charAt(currentInput.length()-1);
       int previous = previousInput.charAt(previousInput.length()-1);
       if(current > previous)
       {
           results = currentInput;
       }
       else
       {
           System.out.println("请换一张牌！");
       }
       return results;
   }
}
