package com.deepu;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("myName","Deepu");
        map.put("actor","shivau");
        map.put("Ceo","Deepu");
        map.put("Don","Deepu");
        Set<String> Keys =map.keySet();

        for (String Key : Keys)
        {
            System.out.println(Key +" " +map.get(Key));
        }



    }
}
