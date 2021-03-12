package com.ict.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class DAO {
	private SqlSessionTemplate sqlSessionTemplate;
	private DataSourceTransactionManager transactionManager;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	//delete했을때 댓글 이 있으면 삭제가 안됀다.
	//이때 트랜 젝션 처리 를 해야 함
	public void setTransactionManager(DataSourceTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	
	
	//페이징 기법 전
	public List<BVO> getList() {
		List<BVO> list = null;
		list = sqlSessionTemplate.selectList("list");
		return list;
	}

	public MVO getLogin(MVO m_vo) {
		MVO mvo = null;
		mvo = sqlSessionTemplate.selectOne("login",m_vo);
		return mvo;
	}

	public int getTotal() {
		int result = 0;
		result = sqlSessionTemplate.selectOne("count");
		return result;
	}

	//페이징 후 리스트 
	public List<BVO> getList2(int begin, int end) {
		List<BVO> list = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("begin", begin);
		map.put("end", end);
		list = sqlSessionTemplate.selectList("list2",map);
		return list;
	}
	//조회수 업데이트 
	public int getHit(String b_idx) {
		int result = 0;
		result = sqlSessionTemplate.update("hitup",b_idx);
		return result;
	}
	//상세보기
	public BVO getOneList(String b_idx) {
		BVO bvo = null;
		bvo = sqlSessionTemplate.selectOne("onelist",b_idx);
		return bvo;
	}
	//댓글가져오기
	public List<CVO> getCommList(String b_idx) {
		List<CVO> c_list = null;
		c_list = sqlSessionTemplate.selectList("clist", b_idx);
		return c_list;
	}

	public int getC_Insert(CVO cvo) {
		int result = 0;
		result = sqlSessionTemplate.insert("c_insert", cvo);
		return result;
	}

	public int getC_Delete(String c_idx) {
		int result = 0;
		result = sqlSessionTemplate.delete("c_delete", c_idx);
		return result;
	}

	public int getInsert(BVO bvo) {
		int result = 0;
		result = sqlSessionTemplate.insert("write",bvo);
		return result;
	}

	public int getDelete(String b_idx){
		int result = 0;
		result = sqlSessionTemplate.delete("delete", b_idx);
		return result;
	}

	public int getc_AllDelete(String b_idx) {
		int result = 0;
		result = sqlSessionTemplate.delete("c_delete_all", b_idx);
		return result;
	}

	public int getUpdate(BVO bvo) {
		int result = 0;
		result = sqlSessionTemplate.update("update", bvo);
		return result;
	}

	

	
	
	
}
