package ru.job4j.list;

import java.util.HashMap;
import java.util.List;


/**
 * Created by Sergii.
 */
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> rezult = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            rezult.put(list.get(i).getId(), list.get(i));
        }
        return rezult;
    }
}
