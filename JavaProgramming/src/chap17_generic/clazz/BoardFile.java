package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T> {
	//T == FreeBoard는 boardNo == fBoardNo
	//T == NoticeBoard는 boardNo == nBoardNo
	
	private int boardNo;
	//1. 자게 2. 공지사항
	private int type;
	private String boardFileNm;
	
	private T t; // = Freeboard = fBoard
	
	private List<T> tList;
	
	//ResponseEntity<T> 요청에대한 응답을 받을때 만드는 객체

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getBoardFileNm() {
		return boardFileNm;
	}

	public void setBoardFileNm(String boardFileNm) {
		this.boardFileNm = boardFileNm;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", boardFileNm=" + boardFileNm + ", t=" + t + "]";
	}
	
}
