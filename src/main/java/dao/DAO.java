package main.java.dao;

import java.util.List;
import java.util.Optional;

import main.java.main.DuplicateEntityException;

/**Interfez que implementa los m�todos de DAOFactory haciendo uso de Java Generics
 * @versi�n 1.0 23/05/2020
 * @author Serverkillers
 *
 */
public interface DAO<T> {
	public int add(T t) throws DuplicateEntityException;
	public void saveAll();
    public T get(String id); 
    public List<T> list();
    public boolean loadData();

}
