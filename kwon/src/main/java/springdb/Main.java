package springdb;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdb.controller.StockController;
import springdb.dao.StockHibernateDao;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		StockController stockController = context.getBean("stockController", StockController.class);
		stockController.insertStock();
		//stockController.getAll();
		//stockController.get
		//stockController.updateStock();
		//stockController.deleteStock();

		context.close();

	}

}
