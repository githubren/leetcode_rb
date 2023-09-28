package flyweight;

import java.util.HashMap;

public class LibraryFactory {

    private final HashMap<String, LibraryManager> map = new HashMap<>();

    public void browse(String name,User user){
        if (!map.containsKey(name)){
            map.put(name,new LibraryManager(name));
        }
        map.get(name).browser(user);
    }
}
