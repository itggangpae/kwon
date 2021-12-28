package springdb.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springdb.dao.StockHibernateDao;
import springdb.domain.StockDTO;

@Service
public class StockHibernateServiceImpl implements StockHibernateService {
	
	@Autowired
	private StockHibernateDao stockHibernateDao;
	
	@Override
	@Transactional
	public void insertStock() {
		
		StockDTO stockdto = new StockDTO();
		stockdto.setStock_num(2);
		stockdto.setStock_name("천마");
		stockdto.setStock_current(4);
		stockdto.setStock_maintain(5);
		
		Calendar cal = new GregorianCalendar();
		stockdto.setStock_manu_date(new Date(cal.getTimeInMillis()));
		stockdto.setStock_expire_date(new Date(cal.getTimeInMillis()));
		
		stockHibernateDao.insertStock(stockdto);
		

	}

}
