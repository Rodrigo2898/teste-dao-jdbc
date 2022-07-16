package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//Classe auxiliar repons�vel por instanciar os meus Daos
public class DaoFactory {

	//"Macete", para n�o precisar expor a implementa��o
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
