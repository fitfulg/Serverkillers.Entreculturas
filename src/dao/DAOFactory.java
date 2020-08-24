package dao;

import main.Persona;
import main.Proyecto;
import main.Voluntario;
import main.Sede;
/**M�todos que devuelve el DAO de cada una de las clases
 * Se incluye (comentado) el caso para utilizar una base de datos relacional
 * @versi�n 1.0 23/05/2020
 * @author Serverkillers
 *
 */
public abstract class DAOFactory {
	public static final int XML = 1;
	public static final int MYSQL = 2;
 
	public abstract DAO<Persona> getXmlPersonasDAO();
	public abstract DAO<Sede> getXmlSedesDAO();
	public abstract DAO<Voluntario> getXmlVoluntariosDAO();
	public abstract DAO<Proyecto> getXmlProyectosDAO();
 
	public static DAOFactory getDAOFactory (int factoryType){
		switch (factoryType) {
        	case XML:
        		return new XmlDAOFactory();
            //case MYSQL:
            //	return new MySqlDAOFactory();
        	default:
        		return null;
		}
 	}
}