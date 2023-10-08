import java.util.HashMap;
import java.util.Map;

public class Service {

    //THIS IS OUR DATABASE. USERNAME IS UNIQUE
    Map<String, User> database = new HashMap<>();

    //REGISTRATION
    public boolean register(User user){
        boolean result = false;
        boolean exist = database.containsKey(user.getUsername());
        if (!exist){
            database.put(user.getUsername(), user);
            result = true;
        }
        return result;
    }

    //LOGIN
    public User login (String username, String password){
        boolean exist = database.containsKey(username);
        if(exist){
            User user = database.get(username);
            if (user.getPassword().equals(password)) return user;
        }
        return null;
    }

}
