package chap19_multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _06_reasonOfThread {

	public static void main(String[] args) {
		
		//사용자들이 접속해서 게시판정보 목록 조회
		//2만명 넘는 사용자가 동시에 1억건의 데이터를 조회하면 DB가 데드락에 걸려서 현재 시스템 DB전체를 사용못함.
		//사용자가 몰렸을 때 한명씩 순차처리를 해주는게 스레드임!!
		//사용자 2만명에 대한 스레드 모두 생성 => 멀티스레드!
		Thread t = new Thread() {
			@Override
			public void run() {
				selectBoardList();
				
			}
		};
		
		t.start();
		
		//스레드의 순서를 sleep, join등을 이용해 제어를 한다.
	}
	
	static List<Map<String, String>> selectBoardList(){
		List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
		
		//boardList에 게시판 데이터를 담는다.
		//DB에서 게시판정보 목록을 조회(게시판 정보 1억건)
		
		return boardList;
	}

}
