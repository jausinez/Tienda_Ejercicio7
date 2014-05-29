/**
 */
package tienda_Ejercicio7.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tienda_Ejercicio7.Cliente;
import tienda_Ejercicio7.Empleado;
import tienda_Ejercicio7.Fruta;
import tienda_Ejercicio7.Lacteo;
import tienda_Ejercicio7.Postre;
import tienda_Ejercicio7.Producto;
import tienda_Ejercicio7.Tienda;
import tienda_Ejercicio7.Tienda_Ejercicio7Factory;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;
import tienda_Ejercicio7.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tienda_Ejercicio7PackageImpl extends EPackageImpl implements Tienda_Ejercicio7Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ventaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lacteoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frutaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postreEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tienda_Ejercicio7.Tienda_Ejercicio7Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tienda_Ejercicio7PackageImpl() {
		super(eNS_URI, Tienda_Ejercicio7Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Tienda_Ejercicio7Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tienda_Ejercicio7Package init() {
		if (isInited) return (Tienda_Ejercicio7Package)EPackage.Registry.INSTANCE.getEPackage(Tienda_Ejercicio7Package.eNS_URI);

		// Obtain or create and register package
		Tienda_Ejercicio7PackageImpl theTienda_Ejercicio7Package = (Tienda_Ejercicio7PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tienda_Ejercicio7PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tienda_Ejercicio7PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTienda_Ejercicio7Package.createPackageContents();

		// Initialize created meta-data
		theTienda_Ejercicio7Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTienda_Ejercicio7Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tienda_Ejercicio7Package.eNS_URI, theTienda_Ejercicio7Package);
		return theTienda_Ejercicio7Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTienda() {
		return tiendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_IdTienda() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Nombre() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Calle() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Ciudad() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_CodPostal() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Telefono() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Fax() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTienda_Tipo() {
		return (EAttribute)tiendaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTienda_Empleado() {
		return (EReference)tiendaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTienda__InsTienda() {
		return tiendaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTienda__ModTienda() {
		return tiendaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTienda__RemTienda() {
		return tiendaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTienda__VisTienda() {
		return tiendaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_IdEmpleado() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Nombre() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_ApellidoUno() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_ApellidoDos() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Cargo() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Tienda_asignada() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_Tienda() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_Producto() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_Venta() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmpleado__InsEmple() {
		return empleadoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmpleado__ModEmple() {
		return empleadoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmpleado__RemEmple() {
		return empleadoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmpleado__VisEmple() {
		return empleadoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProducto() {
		return productoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_IdProducto() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Nombre() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Precio() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_Descripcion() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProducto_IdTipo() {
		return (EAttribute)productoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProducto_Empleado() {
		return (EReference)productoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducto__InsProd() {
		return productoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducto__ModProd() {
		return productoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducto__RemProd() {
		return productoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProducto__VisProd() {
		return productoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVenta() {
		return ventaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenta_IdVenta() {
		return (EAttribute)ventaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenta_Hora() {
		return (EAttribute)ventaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVenta_Fecha() {
		return (EAttribute)ventaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVenta_Empleado() {
		return (EReference)ventaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVenta_Cliente() {
		return (EReference)ventaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVenta__InsVenta() {
		return ventaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVenta__ModVenta() {
		return ventaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVenta__RemVenta() {
		return ventaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVenta__VisVenta() {
		return ventaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_IdCliente() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Dni() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Nombre() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_CorreoElectronico() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_Venta() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__InsCliente() {
		return clienteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__ModCliente() {
		return clienteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__RemCliente() {
		return clienteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__VisCliente() {
		return clienteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLacteo() {
		return lacteoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLacteo_Proteinas() {
		return (EAttribute)lacteoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLacteo_Lactosa() {
		return (EAttribute)lacteoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLacteo_Animal() {
		return (EAttribute)lacteoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLacteo_PH() {
		return (EAttribute)lacteoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFruta() {
		return frutaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFruta_Glucidos() {
		return (EAttribute)frutaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFruta_Fibra() {
		return (EAttribute)frutaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFruta_Vitaminas() {
		return (EAttribute)frutaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFruta_Sales_minerales() {
		return (EAttribute)frutaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostre() {
		return postreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostre_Calorias() {
		return (EAttribute)postreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostre_HidratosDeCarbono() {
		return (EAttribute)postreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostre_Azucares() {
		return (EAttribute)postreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostre_EpocaDeConsumo() {
		return (EAttribute)postreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tienda_Ejercicio7Factory getTienda_Ejercicio7Factory() {
		return (Tienda_Ejercicio7Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tiendaEClass = createEClass(TIENDA);
		createEAttribute(tiendaEClass, TIENDA__ID_TIENDA);
		createEAttribute(tiendaEClass, TIENDA__NOMBRE);
		createEAttribute(tiendaEClass, TIENDA__CALLE);
		createEAttribute(tiendaEClass, TIENDA__CIUDAD);
		createEAttribute(tiendaEClass, TIENDA__COD_POSTAL);
		createEAttribute(tiendaEClass, TIENDA__TELEFONO);
		createEAttribute(tiendaEClass, TIENDA__FAX);
		createEAttribute(tiendaEClass, TIENDA__TIPO);
		createEReference(tiendaEClass, TIENDA__EMPLEADO);
		createEOperation(tiendaEClass, TIENDA___INS_TIENDA);
		createEOperation(tiendaEClass, TIENDA___MOD_TIENDA);
		createEOperation(tiendaEClass, TIENDA___REM_TIENDA);
		createEOperation(tiendaEClass, TIENDA___VIS_TIENDA);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__ID_EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__NOMBRE);
		createEAttribute(empleadoEClass, EMPLEADO__APELLIDO_UNO);
		createEAttribute(empleadoEClass, EMPLEADO__APELLIDO_DOS);
		createEAttribute(empleadoEClass, EMPLEADO__CARGO);
		createEAttribute(empleadoEClass, EMPLEADO__TIENDA_ASIGNADA);
		createEReference(empleadoEClass, EMPLEADO__TIENDA);
		createEReference(empleadoEClass, EMPLEADO__PRODUCTO);
		createEReference(empleadoEClass, EMPLEADO__VENTA);
		createEOperation(empleadoEClass, EMPLEADO___INS_EMPLE);
		createEOperation(empleadoEClass, EMPLEADO___MOD_EMPLE);
		createEOperation(empleadoEClass, EMPLEADO___REM_EMPLE);
		createEOperation(empleadoEClass, EMPLEADO___VIS_EMPLE);

		productoEClass = createEClass(PRODUCTO);
		createEAttribute(productoEClass, PRODUCTO__ID_PRODUCTO);
		createEAttribute(productoEClass, PRODUCTO__NOMBRE);
		createEAttribute(productoEClass, PRODUCTO__PRECIO);
		createEAttribute(productoEClass, PRODUCTO__DESCRIPCION);
		createEAttribute(productoEClass, PRODUCTO__ID_TIPO);
		createEReference(productoEClass, PRODUCTO__EMPLEADO);
		createEOperation(productoEClass, PRODUCTO___INS_PROD);
		createEOperation(productoEClass, PRODUCTO___MOD_PROD);
		createEOperation(productoEClass, PRODUCTO___REM_PROD);
		createEOperation(productoEClass, PRODUCTO___VIS_PROD);

		ventaEClass = createEClass(VENTA);
		createEAttribute(ventaEClass, VENTA__ID_VENTA);
		createEAttribute(ventaEClass, VENTA__HORA);
		createEAttribute(ventaEClass, VENTA__FECHA);
		createEReference(ventaEClass, VENTA__EMPLEADO);
		createEReference(ventaEClass, VENTA__CLIENTE);
		createEOperation(ventaEClass, VENTA___INS_VENTA);
		createEOperation(ventaEClass, VENTA___MOD_VENTA);
		createEOperation(ventaEClass, VENTA___REM_VENTA);
		createEOperation(ventaEClass, VENTA___VIS_VENTA);

		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__ID_CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__DNI);
		createEAttribute(clienteEClass, CLIENTE__NOMBRE);
		createEAttribute(clienteEClass, CLIENTE__CORREO_ELECTRONICO);
		createEReference(clienteEClass, CLIENTE__VENTA);
		createEOperation(clienteEClass, CLIENTE___INS_CLIENTE);
		createEOperation(clienteEClass, CLIENTE___MOD_CLIENTE);
		createEOperation(clienteEClass, CLIENTE___REM_CLIENTE);
		createEOperation(clienteEClass, CLIENTE___VIS_CLIENTE);

		lacteoEClass = createEClass(LACTEO);
		createEAttribute(lacteoEClass, LACTEO__PROTEINAS);
		createEAttribute(lacteoEClass, LACTEO__LACTOSA);
		createEAttribute(lacteoEClass, LACTEO__ANIMAL);
		createEAttribute(lacteoEClass, LACTEO__PH);

		frutaEClass = createEClass(FRUTA);
		createEAttribute(frutaEClass, FRUTA__GLUCIDOS);
		createEAttribute(frutaEClass, FRUTA__FIBRA);
		createEAttribute(frutaEClass, FRUTA__VITAMINAS);
		createEAttribute(frutaEClass, FRUTA__SALES_MINERALES);

		postreEClass = createEClass(POSTRE);
		createEAttribute(postreEClass, POSTRE__CALORIAS);
		createEAttribute(postreEClass, POSTRE__HIDRATOS_DE_CARBONO);
		createEAttribute(postreEClass, POSTRE__AZUCARES);
		createEAttribute(postreEClass, POSTRE__EPOCA_DE_CONSUMO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lacteoEClass.getESuperTypes().add(this.getProducto());
		frutaEClass.getESuperTypes().add(this.getProducto());
		postreEClass.getESuperTypes().add(this.getProducto());

		// Initialize classes, features, and operations; add parameters
		initEClass(tiendaEClass, Tienda.class, "Tienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTienda_IdTienda(), ecorePackage.getEString(), "idTienda", "", 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Nombre(), ecorePackage.getEString(), "nombre", "", 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Calle(), ecorePackage.getEString(), "calle", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Ciudad(), ecorePackage.getEString(), "ciudad", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_CodPostal(), ecorePackage.getEInt(), "codPostal", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Telefono(), ecorePackage.getEInt(), "telefono", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Fax(), ecorePackage.getEInt(), "fax", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTienda_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTienda_Empleado(), this.getEmpleado(), this.getEmpleado_Tienda(), "empleado", null, 1, -1, Tienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTienda__InsTienda(), null, "insTienda", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTienda__ModTienda(), null, "modTienda", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTienda__RemTienda(), null, "remTienda", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTienda__VisTienda(), null, "visTienda", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_IdEmpleado(), ecorePackage.getEInt(), "idEmpleado", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_ApellidoUno(), ecorePackage.getEString(), "apellidoUno", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_ApellidoDos(), ecorePackage.getEString(), "apellidoDos", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Cargo(), ecorePackage.getEString(), "cargo", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Tienda_asignada(), ecorePackage.getEString(), "tienda_asignada", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_Tienda(), this.getTienda(), this.getTienda_Empleado(), "tienda", null, 1, -1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_Producto(), this.getProducto(), this.getProducto_Empleado(), "producto", null, 0, -1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_Venta(), this.getVenta(), this.getVenta_Empleado(), "venta", null, 0, -1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEmpleado__InsEmple(), null, "insEmple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmpleado__ModEmple(), null, "modEmple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmpleado__RemEmple(), null, "remEmple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmpleado__VisEmple(), null, "visEmple", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProducto_IdProducto(), ecorePackage.getEInt(), "idProducto", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProducto_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Precio(), ecorePackage.getEDouble(), "precio", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProducto_IdTipo(), ecorePackage.getEInt(), "idTipo", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducto_Empleado(), this.getEmpleado(), this.getEmpleado_Producto(), "empleado", null, 1, -1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProducto__InsProd(), null, "insProd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProducto__ModProd(), null, "modProd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProducto__RemProd(), null, "remProd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProducto__VisProd(), null, "visProd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ventaEClass, Venta.class, "Venta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVenta_IdVenta(), ecorePackage.getEInt(), "idVenta", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVenta_Hora(), ecorePackage.getEDate(), "hora", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVenta_Fecha(), ecorePackage.getEDate(), "fecha", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVenta_Empleado(), this.getEmpleado(), this.getEmpleado_Venta(), "empleado", null, 1, -1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVenta_Cliente(), this.getCliente(), this.getCliente_Venta(), "cliente", null, 1, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVenta__InsVenta(), null, "insVenta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVenta__ModVenta(), null, "modVenta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVenta__RemVenta(), null, "remVenta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVenta__VisVenta(), null, "visVenta", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_IdCliente(), ecorePackage.getEInt(), "idCliente", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Dni(), ecorePackage.getEInt(), "dni", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_CorreoElectronico(), ecorePackage.getEString(), "correoElectronico", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCliente_Venta(), this.getVenta(), this.getVenta_Cliente(), "venta", null, 1, -1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCliente__InsCliente(), null, "insCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCliente__ModCliente(), null, "modCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCliente__RemCliente(), null, "remCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCliente__VisCliente(), null, "visCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lacteoEClass, Lacteo.class, "Lacteo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLacteo_Proteinas(), ecorePackage.getEFloat(), "proteinas", null, 0, 1, Lacteo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLacteo_Lactosa(), ecorePackage.getEFloat(), "lactosa", null, 0, 1, Lacteo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLacteo_Animal(), ecorePackage.getEString(), "animal", null, 0, 1, Lacteo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLacteo_PH(), ecorePackage.getEFloat(), "pH", null, 0, 1, Lacteo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frutaEClass, Fruta.class, "Fruta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFruta_Glucidos(), ecorePackage.getEFloat(), "glucidos", null, 0, 1, Fruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFruta_Fibra(), ecorePackage.getEString(), "fibra", null, 0, 1, Fruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFruta_Vitaminas(), ecorePackage.getEFloat(), "vitaminas", null, 0, 1, Fruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFruta_Sales_minerales(), ecorePackage.getEFloat(), "sales_minerales", null, 0, 1, Fruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postreEClass, Postre.class, "Postre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostre_Calorias(), ecorePackage.getEFloat(), "calorias", null, 0, 1, Postre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostre_HidratosDeCarbono(), ecorePackage.getEFloat(), "hidratosDeCarbono", null, 0, 1, Postre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostre_Azucares(), ecorePackage.getEFloat(), "azucares", null, 0, 1, Postre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostre_EpocaDeConsumo(), ecorePackage.getEString(), "epocaDeConsumo", null, 0, 1, Postre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Tienda_Ejercicio7PackageImpl
