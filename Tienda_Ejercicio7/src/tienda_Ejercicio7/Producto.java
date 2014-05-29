/**
 */
package tienda_Ejercicio7;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.Producto#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Producto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Producto#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Producto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Producto#getIdTipo <em>Id Tipo</em>}</li>
 *   <li>{@link tienda_Ejercicio7.Producto#getEmpleado <em>Empleado</em>}</li>
 * </ul>
 * </p>
 *
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Producto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Producto</em>' attribute.
	 * @see #setIdProducto(int)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_IdProducto()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	int getIdProducto();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Producto#getIdProducto <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Producto</em>' attribute.
	 * @see #getIdProducto()
	 * @generated
	 */
	void setIdProducto(int value);

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
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Producto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(double)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_Precio()
	 * @model
	 * @generated
	 */
	double getPrecio();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Producto#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(double value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Producto#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Id Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tipo</em>' attribute.
	 * @see #setIdTipo(int)
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_IdTipo()
	 * @model
	 * @generated
	 */
	int getIdTipo();

	/**
	 * Sets the value of the '{@link tienda_Ejercicio7.Producto#getIdTipo <em>Id Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tipo</em>' attribute.
	 * @see #getIdTipo()
	 * @generated
	 */
	void setIdTipo(int value);

	/**
	 * Returns the value of the '<em><b>Empleado</b></em>' reference list.
	 * The list contents are of type {@link tienda_Ejercicio7.Empleado}.
	 * It is bidirectional and its opposite is '{@link tienda_Ejercicio7.Empleado#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empleado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empleado</em>' reference list.
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#getProducto_Empleado()
	 * @see tienda_Ejercicio7.Empleado#getProducto
	 * @model opposite="producto" required="true"
	 * @generated
	 */
	EList<Empleado> getEmpleado();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void insProd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modProd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remProd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visProd();

} // Producto
