import java.util.ArrayList;

public class User
{
    public static ArrayList<ArrayList<String>> userNum(int num)
    {
        ArrayList<ArrayList<String>> user = new ArrayList<>();
        for (int i = 0; i < num; i++)
        {
            user.add(new ArrayList<>());
        }

        return user;
    }

}
