package com.ict.model;

import org.springframework.stereotype.Service;

@Service
public class Paging {
	private int nowPage = 1;//현재 페이지
	private int nowBlock = 1;//현재 블록
	private int totalRecord=0;//전체 게시물 수
	private int totalPage=0;//전체 페이지 수
	private int totalBlock=0;//전체 블록 수 
	private int numPerpage=3;//현재 페이지안에 존재하는 원글 의 수
	private int pagePerBlock=3;//한블록안에 존재하는 블록의 수 
	
	private int begin = 0;//시작번호
	private int end=0;//끝번호
	private int beginBlock=0;//시작블록
	private int endBlock = 0;//끝블록
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNowBlock() {
		return nowBlock;
	}
	public void setNowBlock(int nowBlock) {
		this.nowBlock = nowBlock;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getNumPerpage() {
		return numPerpage;
	}
	public void setNumPerpage(int numPerpage) {
		this.numPerpage = numPerpage;
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getBeginBlock() {
		return beginBlock;
	}
	public void setBeginBlock(int beginBlock) {
		this.beginBlock = beginBlock;
	}
	public int getEndBlock() {
		return endBlock;
	}
	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}
	
	
	
	
}
