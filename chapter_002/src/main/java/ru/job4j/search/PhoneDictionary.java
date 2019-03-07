package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Sergii.
 */
public class PhoneDictionary {

        private List<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        /**
         * Вернуть список всех пользователей, который содержат key в любых полях.
         * @param key Ключ поиска.
         * @return Список подощедщих пользователей.
         */
        public List<Person> find(String key) {
            List<Person> result = new ArrayList<>();
            String inputData;

            for (Person item : persons) {
              inputData = item.getName()
                      + System.lineSeparator()
                      + item.getSurname()
                      + System.lineSeparator()
                      + item.getPhone()
                      + System.lineSeparator()
                      + item.getAddress();
              if (inputData.contains(key)) {
                  result.add(item);
              }
            }

            return result;
        }
}
