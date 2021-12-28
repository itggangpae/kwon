package springdb.service;

import java.util.List;

import springdb.domain.StockDTO;

public interface StockService {
	
	public boolean insertStock();
	public List<StockDTO> getAll();
	public StockDTO getStock();
	public boolean updateStock();
	public boolean deleteStock();
	// Insert Delete Update은 모양이 다 같다 
	
}
