package springdb.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdb.dao.StockDao;
import springdb.dao.StockMapper;
import springdb.domain.StockDTO;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	//private StockDao stockDao;
	private StockMapper stockDao;
	
	@Override
	public boolean insertStock() {
		boolean result = false;
		// 파라미터를 읽고 DAO의 파라미터를 생성 
		StockDTO stockdto = new StockDTO();
		if(stockDao.maxCode() != null	)
			stockdto.setStock_num(stockDao.maxCode()+1);
		else
			stockdto.setStock_num(1);
		stockdto.setStock_name("ginseng");
		stockdto.setStock_current(2);
		stockdto.setStock_maintain(3);
		Calendar cal = new GregorianCalendar();
		stockdto.setStock_manu_date(new Date(cal.getTimeInMillis()));
		stockdto.setStock_expire_date(new Date(cal.getTimeInMillis()));
		
		//DAO의 메서드 호출
		int r = stockDao.insertStock();
		if(r >= 0) {
			result=true;
			
			/*
			// 파일의 내용을 일을 수있는 스트림 생성 
			try{	
			FileInputStream fis = new FileInputStream("directory");
			byte [] tempo = new byte[fis.available()];

			stock.setImage(tempo);
			fis.close()
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
			 */
		}

		return result;
	}

	@Override
	public List<StockDTO> getAll() {
		return stockDao.getAll();
	}

	@Override
	public StockDTO getStock() {
		
		return stockDao.getStock(3);
	}

	@Override
	public boolean updateStock() {
		boolean result = false;
		
		StockDTO stockdto = new StockDTO();
		stockdto.setStock_num(2);
		stockdto.setStock_name("herb");
		stockdto.setStock_maintain(5);
		stockdto.setStock_current(1);
		
		int r = stockDao.updateStock(stockdto);
		
		if(r >= 0) {
			result = true;
		}
		
		return result;
	}

	@Override
	public boolean deleteStock() {
		boolean result = false;
		
		int r = stockDao.deleteStock(2);
		if(r >= 0) {
			result = true;
		}
		
		return result;
	}



}
