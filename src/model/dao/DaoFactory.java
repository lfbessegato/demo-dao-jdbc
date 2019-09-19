package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	// Retorna um Seller
	public static SellerDao createSellerDao() {
		
		//Deixa protegido a implementação somente a instaciação
		return new SellerDaoJDBC();
	}

}
