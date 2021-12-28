package springdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springdb.domain.StockDTO;

//@Repository
public class StockDao {
	
	@Autowired
	//XML을 이용하는 MyBatis 사용 객체
	private SqlSession sqlSession;
	
	// method for data insert
	public int insertStock(StockDTO stockdto) {
		//stock namespace의 insertstock이라는 id를 가진 sql을 실행하는데
		//파라미터로 good을 대입 
		return sqlSession.insert("stock.insertstock", stockdto);
	}
	
	public Integer maxCode() {
		return sqlSession.selectOne("stock.maxcode");
				
	}
	
	public List<StockDTO> getAll() {
		// 데이터가 1개도 없으면 size가 0
		return sqlSession.selectList("stock.getall");
	}
	
	public StockDTO getStock(int stock_num) {
		// 조회되는 데이터가 없거나 1개인 경우 사용 
		// 데이터가 없으면 null을 리턴하고 1개인 경우 resultType 1개 리턴 
		// 2개 이상이면 예외 발생 
		return sqlSession.selectOne("stock.getstock", stock_num);
	}
	
	public int updateStock(StockDTO stockdto) {
		return sqlSession.update("stock.updatestock", stockdto);
	}
	
	public int deleteStock(int stock_num) {
		return sqlSession.delete("stock.deletestock", stock_num);
	}

}
