package springdb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springdb.domain.StockDTO;

@Repository
public class StockHibernateDao {
	//데이터베이스 연동 프레임워크 사용 인스턴스 주입 
	@Autowired
	private SessionFactory sessionFactory;
	
	// 데이터 삽입 
	public void insertStock(StockDTO stockdto) {
		Session session = sessionFactory.getCurrentSession();
		// Data insert
		session.save(stockdto);
		//sql 안썼음 
	}
}
