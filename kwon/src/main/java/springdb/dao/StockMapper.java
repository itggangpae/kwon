package springdb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import springdb.domain.StockDTO;

@Repository
public interface StockMapper {
	// interface는 인스턴스를 만들 수 없는데 
	// @Repository는 인스턴스를 만드는 거임 
	// 인스턴스르 구현할 클래스를 만들 필요 없음 
	// 스프링의 프록시 패턴이라고 함 

	// 전체 데이터 가져오기 
	@Select("select * from stock")
	public List<StockDTO> getAll();

	// xml 파일과 메서드를 만들어야 하는 것을 모양만 만들고 

	@Select("select max(stock_num) from stock")
	public Integer maxCode();

	@Insert("insert into stock(stock_num, stock_name, stock_current, stock_maintain, stock_manu_date, stock_expire_date) "
			+ "values(#{stock_num}, #{stock_name}, #{stock_current}, #{stock_maintain}, #{stock_manu_date}, #{stock_expire_date})")
	public int insertStock();
	
	// Get one data 
	@Select("select from stock where stock_num = #{stock_num}")
	public StockDTO getStock(int stock_num);
	
	// update data
	@Update("update stock set stock_name=#{stock_name}, stock_current=#{stock_current}, stock_maintain=#{stock_maintain} where #{stock_num}")
	public int updateStock(StockDTO stockdto); 
	
	@Delete("delete from stock where stock_num = #{stock_num}")
	public int deleteStock(int stock_num);
}
