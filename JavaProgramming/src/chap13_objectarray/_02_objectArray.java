package chap13_objectarray;

import chap13_objectarray.clazz.English;
import chap13_objectarray.clazz.ILecture;
import chap13_objectarray.clazz.Mathematics;
import chap13_objectarray.clazz.Programming;

public class _02_objectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ILecture[] arr = new ILecture[3];
		
		arr[0] = new English("영어", 28, 30);
		arr[1] = new Mathematics("수학", 28, 30);
		arr[2] = new Programming("자바", 28, 30);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].proceedLecture();
		}
		
	}

}
