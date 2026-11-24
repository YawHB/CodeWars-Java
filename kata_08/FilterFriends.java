package kata_08;

import java.util.List;

public class FilterFriends {
    public static List<String> filterFriends(List<String> friends){

        return friends.stream().filter(f -> f.length() == 4).toList();

    }

}
