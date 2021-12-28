package springdb.domain;

import java.util.Date;

public class StockDTO {
	private int stock_num;
	private String stock_name;
	private int stock_current;
	private int stock_maintain;
	private Date stock_manu_date;
	private Date stock_expire_date;
	
	public int getStock_num() {
		return stock_num;
	}
	public void setStock_num(int stock_num) {
		this.stock_num = stock_num;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public int getStock_current() {
		return stock_current;
	}
	public void setStock_current(int stock_current) {
		this.stock_current = stock_current;
	}
	public int getStock_maintain() {
		return stock_maintain;
	}
	public void setStock_maintain(int stock_maintain) {
		this.stock_maintain = stock_maintain;
	}
	public Date getStock_manu_date() {
		return stock_manu_date;
	}
	public void setStock_manu_date(Date stock_manu_date) {
		this.stock_manu_date = stock_manu_date;
	}
	public Date getStock_expire_date() {
		return stock_expire_date;
	}
	public void setStock_expire_date(Date stock_expire_date) {
		this.stock_expire_date = stock_expire_date;
	}
	@Override
	public String toString() {
		return "stockDTO [stock_num=" + stock_num + ", stock_name=" + stock_name + ", stock_current=" + stock_current
				+ ", stock_maintain=" + stock_maintain + ", stock_manu_date=" + stock_manu_date + ", stock_expire_date="
				+ stock_expire_date + "]";
	}
	
	
}
