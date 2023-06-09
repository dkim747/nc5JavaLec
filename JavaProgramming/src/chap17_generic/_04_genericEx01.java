package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i + 1);
		}
		
		System.out.println(_04_genericEx01.<Integer>getEven(intList));
		
		//Number상속받는 T
		//return 타입은 List<T> getEven(List<T> list)	
	}
	
//	public static <T extends Number> List<T> getEven(List<T> tlist){
//		List<T> getEven = (List<T>) tlist.get(0);
//		
//		for(int i = 0; i < tlist.size(); i++) {
//			if((List<T>)tlist.get(i)%2 == 0) {
//				return tlist;
//			}
//		}
//	}
	
	public static <T extends Number> List<T> getEven(List<T> list){
		List<T> returnList = new ArrayList<T>();
		
		for(T t : list) {
			if(t.intValue()%2 == 0) {
				returnList.add(t);
			}
		}
		return returnList;
	}
	
	public static <T extends Number> List<T> getEven2(List<T> list){
		List<T> evenlist = new ArrayList<T>();
		
		for(T i : list) {
			if(i.intValue()%2 == 1) {
				evenlist.add(i);
			}
		}
		return evenlist;
	}
}
