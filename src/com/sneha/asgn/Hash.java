package com.sneha.jav;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class Hash {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("Sneha", "Kashyap");
		map.put("Urvi", "patwa");
		map.put("Chaya", "Bk");
		map.put("Yuvraj", "Singh");
		
		//map.entrySet().stream().map(i -> i.getKey().concat(i.getValue()))
		//.collect(Collectors.toList());
		
		System.out.println(map.entrySet().stream().map(i -> i.getKey().concat(i.getValue()))
				.collect(Collectors.toList()));
	}
}
