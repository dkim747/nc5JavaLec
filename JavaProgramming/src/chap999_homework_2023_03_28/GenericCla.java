package chap999_homework_2023_03_28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericCla<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static <T> String add(T t1, T t2) {
		StringBuffer sb1 = new StringBuffer((String)t1);
		StringBuffer sb2 = new StringBuffer((String)t2);
		StringBuffer sum = sb1.append(sb2);
		String a = sum.toString();
		
		return a;
	}
	
	//public static Integer add(List<?> list) {
		
		
	//}
	
	public void printArr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i%3 == 0) {
				System.out.println(arr[i]);
			}
		}			
	}
	
	public static <T extends Number> T getMin(T[] tArr){
		T min = tArr[0];

		for(int i = 0; i < tArr.length; i++) {
			if(tArr[i].doubleValue() < min.doubleValue()) {
				min = tArr[i];
			}
		}
		return min;
	}
	
	public static <K, V> void printOverTen(Map<K, V> map){
			for(Entry<K, V> i : map.entrySet()) {
				if(i.getValue().toString().length() >= 10) {
					System.out.println(i.getKey());
				}
		}
	}
	
	
}