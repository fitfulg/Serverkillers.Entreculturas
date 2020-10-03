/**
 * 
 */
package main.java.main;

/**Excepci�n personalizada que trata formatos de fecha que no son v�lidos
 * @versi�n 1.0 23/05/2020
 * @author suare
 *
 */
public class DateFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public DateFormatException(String date) {
        super("La fecha " + date + " no tiene un formato correcto (dd/mm/yyyy)");
    }

}
