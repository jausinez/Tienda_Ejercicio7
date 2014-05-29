/**
 */
package tienda_Ejercicio7;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package
 * @generated
 */
public interface Tienda_Ejercicio7Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tienda_Ejercicio7Factory eINSTANCE = tienda_Ejercicio7.impl.Tienda_Ejercicio7FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tienda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tienda</em>'.
	 * @generated
	 */
	Tienda createTienda();

	/**
	 * Returns a new object of class '<em>Empleado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empleado</em>'.
	 * @generated
	 */
	Empleado createEmpleado();

	/**
	 * Returns a new object of class '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto</em>'.
	 * @generated
	 */
	Producto createProducto();

	/**
	 * Returns a new object of class '<em>Venta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Venta</em>'.
	 * @generated
	 */
	Venta createVenta();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Lacteo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lacteo</em>'.
	 * @generated
	 */
	Lacteo createLacteo();

	/**
	 * Returns a new object of class '<em>Fruta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fruta</em>'.
	 * @generated
	 */
	Fruta createFruta();

	/**
	 * Returns a new object of class '<em>Postre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postre</em>'.
	 * @generated
	 */
	Postre createPostre();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tienda_Ejercicio7Package getTienda_Ejercicio7Package();

} //Tienda_Ejercicio7Factory
