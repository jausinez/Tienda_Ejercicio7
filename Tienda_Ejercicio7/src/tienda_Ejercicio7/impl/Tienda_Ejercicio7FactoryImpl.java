/**
 */
package tienda_Ejercicio7.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tienda_Ejercicio7.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tienda_Ejercicio7FactoryImpl extends EFactoryImpl implements Tienda_Ejercicio7Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tienda_Ejercicio7Factory init() {
		try {
			Tienda_Ejercicio7Factory theTienda_Ejercicio7Factory = (Tienda_Ejercicio7Factory)EPackage.Registry.INSTANCE.getEFactory(Tienda_Ejercicio7Package.eNS_URI);
			if (theTienda_Ejercicio7Factory != null) {
				return theTienda_Ejercicio7Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tienda_Ejercicio7FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda_Ejercicio7FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tienda_Ejercicio7Package.TIENDA: return createTienda();
			case Tienda_Ejercicio7Package.EMPLEADO: return createEmpleado();
			case Tienda_Ejercicio7Package.PRODUCTO: return createProducto();
			case Tienda_Ejercicio7Package.VENTA: return createVenta();
			case Tienda_Ejercicio7Package.CLIENTE: return createCliente();
			case Tienda_Ejercicio7Package.LACTEO: return createLacteo();
			case Tienda_Ejercicio7Package.FRUTA: return createFruta();
			case Tienda_Ejercicio7Package.POSTRE: return createPostre();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda createTienda() {
		TiendaImpl tienda = new TiendaImpl();
		return tienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empleado createEmpleado() {
		EmpleadoImpl empleado = new EmpleadoImpl();
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Producto createProducto() {
		ProductoImpl producto = new ProductoImpl();
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venta createVenta() {
		VentaImpl venta = new VentaImpl();
		return venta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lacteo createLacteo() {
		LacteoImpl lacteo = new LacteoImpl();
		return lacteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fruta createFruta() {
		FrutaImpl fruta = new FrutaImpl();
		return fruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postre createPostre() {
		PostreImpl postre = new PostreImpl();
		return postre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda_Ejercicio7Package getTienda_Ejercicio7Package() {
		return (Tienda_Ejercicio7Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tienda_Ejercicio7Package getPackage() {
		return Tienda_Ejercicio7Package.eINSTANCE;
	}

} //Tienda_Ejercicio7FactoryImpl
