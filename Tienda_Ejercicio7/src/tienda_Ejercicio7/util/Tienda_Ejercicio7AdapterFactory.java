/**
 */
package tienda_Ejercicio7.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tienda_Ejercicio7.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package
 * @generated
 */
public class Tienda_Ejercicio7AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tienda_Ejercicio7Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda_Ejercicio7AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tienda_Ejercicio7Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tienda_Ejercicio7Switch<Adapter> modelSwitch =
		new Tienda_Ejercicio7Switch<Adapter>() {
			@Override
			public Adapter caseTienda(Tienda object) {
				return createTiendaAdapter();
			}
			@Override
			public Adapter caseEmpleado(Empleado object) {
				return createEmpleadoAdapter();
			}
			@Override
			public Adapter caseProducto(Producto object) {
				return createProductoAdapter();
			}
			@Override
			public Adapter caseVenta(Venta object) {
				return createVentaAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseLacteo(Lacteo object) {
				return createLacteoAdapter();
			}
			@Override
			public Adapter caseFruta(Fruta object) {
				return createFrutaAdapter();
			}
			@Override
			public Adapter casePostre(Postre object) {
				return createPostreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Tienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Tienda
	 * @generated
	 */
	public Adapter createTiendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Empleado
	 * @generated
	 */
	public Adapter createEmpleadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Producto
	 * @generated
	 */
	public Adapter createProductoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Venta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Venta
	 * @generated
	 */
	public Adapter createVentaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Lacteo <em>Lacteo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Lacteo
	 * @generated
	 */
	public Adapter createLacteoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Fruta <em>Fruta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Fruta
	 * @generated
	 */
	public Adapter createFrutaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tienda_Ejercicio7.Postre <em>Postre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tienda_Ejercicio7.Postre
	 * @generated
	 */
	public Adapter createPostreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tienda_Ejercicio7AdapterFactory
