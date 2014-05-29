/**
 */
package tienda_Ejercicio7;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Venta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.Venta#getIdVenta <em>Id Venta</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Venta#getHora <em>Hora</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Venta#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Venta#getEmpleado <em>Empleado</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Venta#getCliente <em>Cliente</em>}</li>
 * </ul>
 * </p>
 *
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta()
 * @model
 * @generated
 */
public interface Venta extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Venta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Venta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Venta</em>' attribute.
	 * @see #setIdVenta(int)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta_IdVenta()
	 * @model
	 * @generated
	 */
	int getIdVenta();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Venta#getIdVenta <em>Id Venta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Venta</em>' attribute.
	 * @see #getIdVenta()
	 * @generated
	 */
	void setIdVenta(int value);

	/**
	 * Returns the value of the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora</em>' attribute.
	 * @see #setHora(Date)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta_Hora()
	 * @model
	 * @generated
	 */
	Date getHora();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Venta#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(Date)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta_Fecha()
	 * @model
	 * @generated
	 */
	Date getFecha();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Venta#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(Date value);

	/**
	 * Returns the value of the '<em><b>Empleado</b></em>' reference list.
	 * The list contents are of type {@link tienda_Ejercicio7.Empleado}.
	 * It is bidirectional and its opposite is '{@link tienda_Ejercicio7.Empleado#getVenta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empleado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empleado</em>' reference list.
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta_Empleado()
	 * @see tienda_Ejercicio7.Empleado#getVenta
	 * @model opposite="venta" required="true"
	 * @generated
	 */
	EList<Empleado> getEmpleado();

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tienda_Ejercicio7.Cliente#getVenta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cliente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' reference.
	 * @see #setCliente(Cliente)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getVenta_Cliente()
	 * @see tienda_Ejercicio7.Cliente#getVenta
	 * @model opposite="venta" required="true"
	 * @generated
	 */
	Cliente getCliente();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Venta#getCliente <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliente</em>' reference.
	 * @see #getCliente()
	 * @generated
	 */
	void setCliente(Cliente value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insVenta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modVenta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remVenta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visVenta();

} // Venta
