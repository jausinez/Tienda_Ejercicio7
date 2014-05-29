/**
 */
package tienda_Ejercicio7;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.Cliente#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Cliente#getDni <em>Dni</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Cliente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Cliente#getCorreoElectronico <em>Correo Electronico</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Cliente#getVenta <em>Venta</em>}</li>
 * </ul>
 * </p>
 *
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Cliente</em>' attribute.
	 * @see #setIdCliente(int)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente_IdCliente()
	 * @model
	 * @generated
	 */
	int getIdCliente();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Cliente#getIdCliente <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Cliente</em>' attribute.
	 * @see #getIdCliente()
	 * @generated
	 */
	void setIdCliente(int value);

	/**
	 * Returns the value of the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dni</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dni</em>' attribute.
	 * @see #setDni(int)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente_Dni()
	 * @model
	 * @generated
	 */
	int getDni();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Cliente#getDni <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dni</em>' attribute.
	 * @see #getDni()
	 * @generated
	 */
	void setDni(int value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Cliente#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correo Electronico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correo Electronico</em>' attribute.
	 * @see #setCorreoElectronico(String)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente_CorreoElectronico()
	 * @model
	 * @generated
	 */
	String getCorreoElectronico();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Cliente#getCorreoElectronico <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correo Electronico</em>' attribute.
	 * @see #getCorreoElectronico()
	 * @generated
	 */
	void setCorreoElectronico(String value);

	/**
	 * Returns the value of the '<em><b>Venta</b></em>' reference list.
	 * The list contents are of type {@link tienda_Ejercicio7.Venta}.
	 * It is bidirectional and its opposite is '{@link tienda_Ejercicio7.Venta#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Venta</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venta</em>' reference list.
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getCliente_Venta()
	 * @see tienda_Ejercicio7.Venta#getCliente
	 * @model opposite="cliente" required="true"
	 * @generated
	 */
	EList<Venta> getVenta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visCliente();

} // Cliente
