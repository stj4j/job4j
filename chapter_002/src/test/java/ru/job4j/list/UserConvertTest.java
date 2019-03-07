package ru.job4j.list;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by sergii on 3/6/19.
 */
public class UserConvertTest {
    @Test
    public void process(){
    UserConvert userConert = new UserConvert();
    List<User> inputData = new LinkedList<>();
    HashMap<Integer, User> expec = new HashMap<>();
    User temp;
        temp = new User(123, "Oleg", "Moscow");
        inputData.add(temp);
        expec.put(temp.getId(), temp);
        temp = new User(124, "Vlad", "Moscow");
        inputData.add(temp);
        expec.put(temp.getId(), temp);
        temp = new User(125, "Vitaly", "Samara");
        inputData.add(temp);
        expec.put(temp.getId(), temp);

    HashMap<Integer, User> rezult = new HashMap<>();
    rezult = userConert.process(inputData);

    assertEquals(expec, rezult);

    }
}