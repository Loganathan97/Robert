package org.datatable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sample {
public static void main(String[] args) {
	//1d without header
	List<String> li =  new ArrayList<String>();
	li.add("logan");
	li.add("logan@gmail.com");
	li.add("logan@97");
	li.add("pblr");
	String string = li.get(2);
	System.out.println(string);
	//1d with header
	Map<String, String> mp = new LinkedHashMap<String, String>();
	mp.put("username","logan");
	mp.put("email", "logan@gmail.com");
	mp.put("password", "logan");
	mp.put("location", "pblr");
	String string2 = mp.get("password");
	System.out.println(string2);
	//2d without header
	List<ArrayList<String>> lis = new ArrayList<ArrayList<String>>();
	ArrayList<String> ai = new ArrayList<String>();
	ai.add("logan");
	ai.add("logan@gmail.com");
	ai.add("logan@97");
	ai.add("pblr");
	ArrayList<String> ai1 = new ArrayList<String>();
	ai1.add("pasumpon");
	ai1.add("pasumpon@gmail.com");
	ai1.add("pasumpon@95");
	ai1.add("mad");
	ArrayList<String> ai2 = new ArrayList<String>();
	ai2.add("vallava");
	ai2.add("vallava@gmail.com");
	ai2.add("vallava@91");
	ai2.add("tvl");
	
	lis.add(ai);
	lis.add(ai1);
	lis.add(ai2);
	ArrayList<String> arrayList = lis.get(0);
	String string3 = arrayList.get(0);
	System.out.println(string3);
	
	//2d without header
	List<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String,String>>();
	LinkedHashMap<String, String> lh = new LinkedHashMap<String, String>();
	lh.put("username","logan");
	lh.put("email", "logan@gmail.com");
	lh.put("password", "logan");
	lh.put("location", "pblr");
	LinkedHashMap<String, String> lh1 = new LinkedHashMap<String, String>();
	lh1.put("username","pasumpon");
	lh1.put("email", "pasumpon@gmail.com");
	lh1.put("password", "pasumpon@95");
	lh1.put("location", "mad");
	LinkedHashMap<String, String> lh2 = new LinkedHashMap<String, String>();
	lh2.put("username","vallava");
	lh2.put("email", "vallava@gmail.com");
	lh2.put("password", "vallava@91");
	lh2.put("location", "tvl");
	
	list.add(lh);
	list.add(lh1);
	list.add(lh2);
	LinkedHashMap<String, String> linkedHashMap = list.get(1);
	String string4 = linkedHashMap.get("location");
	System.out.println(string4);
	System.out.println(string4);
	System.out.println(string4);
	System.out.println(string4);
	System.out.println(string4);
	System.out.println(string4);
	
}
}
