package com.assignment.day6.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class q6_hashmap {
	public static HashMap<String, Integer>
		city_Population(HashMap<String, Integer> hm)
		{
			List<Map.Entry<String,Integer>>list= new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String, Integer> >() {
					public int compare(Map.Entry<String, Integer> object1,Map.Entry<String, Integer> object2)
					{
						return (object1.getValue()).compareTo(object2.getValue());
					}
				});
             HashMap<String, Integer> result= new LinkedHashMap<String, Integer>();
			for (Map.Entry<String, Integer> me : list) {
				result.put(me.getKey(), me.getValue());
			}
    return result;
		}
    public static void main(String[] args)
		{
		HashMap<String, Integer> hashmap= new HashMap<String, Integer>();
            hashmap.put("akola", 12000);
			hashmap.put("amravati", 150000);
			hashmap.put("pune", 56000);
			hashmap.put("nagpur", 30000);
			hashmap.put("mumbai", 34000);
			hashmap.put("nashik", 60000);
       Map<String, Integer> map = city_Population(hashmap);
       for (Map.Entry<String, Integer> entry:map.entrySet()) {
	System.out.println("Key : " + entry.getKey()+ ", Value : "+ entry.getValue());
			}
		}
	}


