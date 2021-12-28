package springdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springdb.domain.StockDTO;
import springdb.service.StockHibernateService;
import springdb.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@Autowired
	private StockHibernateService stockHibernateService;
	
	public void insertStock() {	
		stockHibernateService.insertStock();
		System.out.println("data insert success");
	}
	
	/*
	//데이터 삽입 메서드 
	public void insertStock() {
		boolean r = stockService.insertStock();
		if(r==true) {
			System.out.println("data insertion success");
		}else {
			System.out.println("data insertion fail");
		}
	}
	*/
	
	// 테이블 전체 데이터 출력 메서드 
	public void getAll() {
		List<StockDTO> list = stockService.getAll();
		for(StockDTO stock : list) {
			System.out.println(stock);
		}
	}
	
	// 하나의 데이터를 조회하는 메서드 
	public void getStock() {
		StockDTO stockdto = stockService.getStock();
		if(stockdto == null) {
			System.out.println("There's no data");
		}else{
			System.out.println(stockdto);
		}
	}
	
	// 데이터를 수정하는 메서드 
	public void updateStock() {
		boolean result = stockService.updateStock();
		if(result == true) {
			System.out.println("Data update success");
		}else {
			System.out.println("Data update fail");
		}
	}
	
	public void deleteStock() {
		boolean result = stockService.deleteStock();
		if(result == true) {
			System.out.println("Data delete success");
		}else {
			System.out.println("Data delete fail");
		}
	}
}
