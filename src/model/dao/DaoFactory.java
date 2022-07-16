package model.dao;

import model.dao.impl.SellerDaoJDBC;

//Classe auxiliar reponsável por instanciar os meus Daos
public class DaoFactory {

	//"Macete", para não precisar expor a implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
