/**
 */
package tienda_Ejercicio7;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tienda_Ejercicio7.Tienda_Ejercicio7Factory
 * @model kind="package"
 * @generated
 */
public interface Tienda_Ejercicio7Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tienda_Ejercicio7";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tienda_Ejercicio7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tienda_Ejercicio7";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tienda_Ejercicio7Package eINSTANCE = tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl.init();

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.TiendaImpl <em>Tienda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.TiendaImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getTienda()
	 * @generated
	 */
	int TIENDA = 0;

	/**
	 * The feature id for the '<em><b>Id Tienda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__ID_TIENDA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Calle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__CALLE = 2;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__CIUDAD = 3;

	/**
	 * The feature id for the '<em><b>Cod Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__COD_POSTAL = 4;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TELEFONO = 5;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__FAX = 6;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__TIPO = 7;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA__EMPLEADO = 8;

	/**
	 * The number of structural features of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Ins Tienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA___INS_TIENDA = 0;

	/**
	 * The operation id for the '<em>Mod Tienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA___MOD_TIENDA = 1;

	/**
	 * The operation id for the '<em>Rem Tienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA___REM_TIENDA = 2;

	/**
	 * The operation id for the '<em>Vis Tienda</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA___VIS_TIENDA = 3;

	/**
	 * The number of operations of the '<em>Tienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIENDA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.EmpleadoImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 1;

	/**
	 * The feature id for the '<em><b>Id Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__ID_EMPLEADO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Apellido Uno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__APELLIDO_UNO = 2;

	/**
	 * The feature id for the '<em><b>Apellido Dos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__APELLIDO_DOS = 3;

	/**
	 * The feature id for the '<em><b>Cargo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__CARGO = 4;

	/**
	 * The feature id for the '<em><b>Tienda asignada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TIENDA_ASIGNADA = 5;

	/**
	 * The feature id for the '<em><b>Tienda</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TIENDA = 6;

	/**
	 * The feature id for the '<em><b>Producto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__PRODUCTO = 7;

	/**
	 * The feature id for the '<em><b>Venta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__VENTA = 8;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Ins Emple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO___INS_EMPLE = 0;

	/**
	 * The operation id for the '<em>Mod Emple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO___MOD_EMPLE = 1;

	/**
	 * The operation id for the '<em>Rem Emple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO___REM_EMPLE = 2;

	/**
	 * The operation id for the '<em>Vis Emple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO___VIS_EMPLE = 3;

	/**
	 * The number of operations of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.ProductoImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 2;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID_PRODUCTO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRECIO = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Id Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID_TIPO = 4;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__EMPLEADO = 5;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Ins Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO___INS_PROD = 0;

	/**
	 * The operation id for the '<em>Mod Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO___MOD_PROD = 1;

	/**
	 * The operation id for the '<em>Rem Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO___REM_PROD = 2;

	/**
	 * The operation id for the '<em>Vis Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO___VIS_PROD = 3;

	/**
	 * The number of operations of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.VentaImpl <em>Venta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.VentaImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getVenta()
	 * @generated
	 */
	int VENTA = 3;

	/**
	 * The feature id for the '<em><b>Id Venta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA__ID_VENTA = 0;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA__HORA = 1;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA__FECHA = 2;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA__EMPLEADO = 3;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA__CLIENTE = 4;

	/**
	 * The number of structural features of the '<em>Venta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Ins Venta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA___INS_VENTA = 0;

	/**
	 * The operation id for the '<em>Mod Venta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA___MOD_VENTA = 1;

	/**
	 * The operation id for the '<em>Rem Venta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA___REM_VENTA = 2;

	/**
	 * The operation id for the '<em>Vis Venta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA___VIS_VENTA = 3;

	/**
	 * The number of operations of the '<em>Venta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENTA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.ClienteImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 4;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DNI = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CORREO_ELECTRONICO = 3;

	/**
	 * The feature id for the '<em><b>Venta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__VENTA = 4;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Ins Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___INS_CLIENTE = 0;

	/**
	 * The operation id for the '<em>Mod Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___MOD_CLIENTE = 1;

	/**
	 * The operation id for the '<em>Rem Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___REM_CLIENTE = 2;

	/**
	 * The operation id for the '<em>Vis Cliente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___VIS_CLIENTE = 3;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.LacteoImpl <em>Lacteo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.LacteoImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getLacteo()
	 * @generated
	 */
	int LACTEO = 5;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__ID_PRODUCTO = PRODUCTO__ID_PRODUCTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__NOMBRE = PRODUCTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__PRECIO = PRODUCTO__PRECIO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__DESCRIPCION = PRODUCTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Id Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__ID_TIPO = PRODUCTO__ID_TIPO;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__EMPLEADO = PRODUCTO__EMPLEADO;

	/**
	 * The feature id for the '<em><b>Proteinas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__PROTEINAS = PRODUCTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lactosa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__LACTOSA = PRODUCTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Animal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__ANIMAL = PRODUCTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>PH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO__PH = PRODUCTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lacteo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO_FEATURE_COUNT = PRODUCTO_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Ins Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO___INS_PROD = PRODUCTO___INS_PROD;

	/**
	 * The operation id for the '<em>Mod Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO___MOD_PROD = PRODUCTO___MOD_PROD;

	/**
	 * The operation id for the '<em>Rem Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO___REM_PROD = PRODUCTO___REM_PROD;

	/**
	 * The operation id for the '<em>Vis Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO___VIS_PROD = PRODUCTO___VIS_PROD;

	/**
	 * The number of operations of the '<em>Lacteo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LACTEO_OPERATION_COUNT = PRODUCTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.FrutaImpl <em>Fruta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.FrutaImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getFruta()
	 * @generated
	 */
	int FRUTA = 6;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__ID_PRODUCTO = PRODUCTO__ID_PRODUCTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__NOMBRE = PRODUCTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__PRECIO = PRODUCTO__PRECIO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__DESCRIPCION = PRODUCTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Id Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__ID_TIPO = PRODUCTO__ID_TIPO;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__EMPLEADO = PRODUCTO__EMPLEADO;

	/**
	 * The feature id for the '<em><b>Glucidos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__GLUCIDOS = PRODUCTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fibra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__FIBRA = PRODUCTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vitaminas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__VITAMINAS = PRODUCTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sales minerales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA__SALES_MINERALES = PRODUCTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA_FEATURE_COUNT = PRODUCTO_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Ins Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA___INS_PROD = PRODUCTO___INS_PROD;

	/**
	 * The operation id for the '<em>Mod Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA___MOD_PROD = PRODUCTO___MOD_PROD;

	/**
	 * The operation id for the '<em>Rem Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA___REM_PROD = PRODUCTO___REM_PROD;

	/**
	 * The operation id for the '<em>Vis Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA___VIS_PROD = PRODUCTO___VIS_PROD;

	/**
	 * The number of operations of the '<em>Fruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUTA_OPERATION_COUNT = PRODUCTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tienda_Ejercicio7.impl.PostreImpl <em>Postre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tienda_Ejercicio7.impl.PostreImpl
	 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getPostre()
	 * @generated
	 */
	int POSTRE = 7;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__ID_PRODUCTO = PRODUCTO__ID_PRODUCTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__NOMBRE = PRODUCTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__PRECIO = PRODUCTO__PRECIO;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__DESCRIPCION = PRODUCTO__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Id Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__ID_TIPO = PRODUCTO__ID_TIPO;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__EMPLEADO = PRODUCTO__EMPLEADO;

	/**
	 * The feature id for the '<em><b>Calorias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__CALORIAS = PRODUCTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidratos De Carbono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__HIDRATOS_DE_CARBONO = PRODUCTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Azucares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__AZUCARES = PRODUCTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Epoca De Consumo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE__EPOCA_DE_CONSUMO = PRODUCTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Postre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE_FEATURE_COUNT = PRODUCTO_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Ins Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE___INS_PROD = PRODUCTO___INS_PROD;

	/**
	 * The operation id for the '<em>Mod Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE___MOD_PROD = PRODUCTO___MOD_PROD;

	/**
	 * The operation id for the '<em>Rem Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE___REM_PROD = PRODUCTO___REM_PROD;

	/**
	 * The operation id for the '<em>Vis Prod</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE___VIS_PROD = PRODUCTO___VIS_PROD;

	/**
	 * The number of operations of the '<em>Postre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRE_OPERATION_COUNT = PRODUCTO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Tienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tienda</em>'.
	 * @see tienda_Ejercicio7.Tienda
	 * @generated
	 */
	EClass getTienda();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getIdTienda <em>Id Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tienda</em>'.
	 * @see tienda_Ejercicio7.Tienda#getIdTienda()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_IdTienda();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tienda_Ejercicio7.Tienda#getNombre()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getCalle <em>Calle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calle</em>'.
	 * @see tienda_Ejercicio7.Tienda#getCalle()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Calle();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see tienda_Ejercicio7.Tienda#getCiudad()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Ciudad();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getCodPostal <em>Cod Postal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Postal</em>'.
	 * @see tienda_Ejercicio7.Tienda#getCodPostal()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_CodPostal();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see tienda_Ejercicio7.Tienda#getTelefono()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see tienda_Ejercicio7.Tienda#getFax()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Fax();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Tienda#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see tienda_Ejercicio7.Tienda#getTipo()
	 * @see #getTienda()
	 * @generated
	 */
	EAttribute getTienda_Tipo();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Tienda#getEmpleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empleado</em>'.
	 * @see tienda_Ejercicio7.Tienda#getEmpleado()
	 * @see #getTienda()
	 * @generated
	 */
	EReference getTienda_Empleado();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Tienda#insTienda() <em>Ins Tienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ins Tienda</em>' operation.
	 * @see tienda_Ejercicio7.Tienda#insTienda()
	 * @generated
	 */
	EOperation getTienda__InsTienda();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Tienda#modTienda() <em>Mod Tienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mod Tienda</em>' operation.
	 * @see tienda_Ejercicio7.Tienda#modTienda()
	 * @generated
	 */
	EOperation getTienda__ModTienda();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Tienda#remTienda() <em>Rem Tienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rem Tienda</em>' operation.
	 * @see tienda_Ejercicio7.Tienda#remTienda()
	 * @generated
	 */
	EOperation getTienda__RemTienda();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Tienda#visTienda() <em>Vis Tienda</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vis Tienda</em>' operation.
	 * @see tienda_Ejercicio7.Tienda#visTienda()
	 * @generated
	 */
	EOperation getTienda__VisTienda();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see tienda_Ejercicio7.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getIdEmpleado <em>Id Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Empleado</em>'.
	 * @see tienda_Ejercicio7.Empleado#getIdEmpleado()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_IdEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tienda_Ejercicio7.Empleado#getNombre()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getApellidoUno <em>Apellido Uno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido Uno</em>'.
	 * @see tienda_Ejercicio7.Empleado#getApellidoUno()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_ApellidoUno();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getApellidoDos <em>Apellido Dos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido Dos</em>'.
	 * @see tienda_Ejercicio7.Empleado#getApellidoDos()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_ApellidoDos();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getCargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cargo</em>'.
	 * @see tienda_Ejercicio7.Empleado#getCargo()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Cargo();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Empleado#getTienda_asignada <em>Tienda asignada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tienda asignada</em>'.
	 * @see tienda_Ejercicio7.Empleado#getTienda_asignada()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Tienda_asignada();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Empleado#getTienda <em>Tienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tienda</em>'.
	 * @see tienda_Ejercicio7.Empleado#getTienda()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_Tienda();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Empleado#getProducto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producto</em>'.
	 * @see tienda_Ejercicio7.Empleado#getProducto()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_Producto();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Empleado#getVenta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Venta</em>'.
	 * @see tienda_Ejercicio7.Empleado#getVenta()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_Venta();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Empleado#insEmple() <em>Ins Emple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ins Emple</em>' operation.
	 * @see tienda_Ejercicio7.Empleado#insEmple()
	 * @generated
	 */
	EOperation getEmpleado__InsEmple();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Empleado#modEmple() <em>Mod Emple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mod Emple</em>' operation.
	 * @see tienda_Ejercicio7.Empleado#modEmple()
	 * @generated
	 */
	EOperation getEmpleado__ModEmple();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Empleado#remEmple() <em>Rem Emple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rem Emple</em>' operation.
	 * @see tienda_Ejercicio7.Empleado#remEmple()
	 * @generated
	 */
	EOperation getEmpleado__RemEmple();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Empleado#visEmple() <em>Vis Emple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vis Emple</em>' operation.
	 * @see tienda_Ejercicio7.Empleado#visEmple()
	 * @generated
	 */
	EOperation getEmpleado__VisEmple();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see tienda_Ejercicio7.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Producto#getIdProducto <em>Id Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Producto</em>'.
	 * @see tienda_Ejercicio7.Producto#getIdProducto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_IdProducto();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Producto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tienda_Ejercicio7.Producto#getNombre()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Producto#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see tienda_Ejercicio7.Producto#getPrecio()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Precio();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Producto#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see tienda_Ejercicio7.Producto#getDescripcion()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Producto#getIdTipo <em>Id Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tipo</em>'.
	 * @see tienda_Ejercicio7.Producto#getIdTipo()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_IdTipo();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Producto#getEmpleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empleado</em>'.
	 * @see tienda_Ejercicio7.Producto#getEmpleado()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_Empleado();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Producto#insProd() <em>Ins Prod</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ins Prod</em>' operation.
	 * @see tienda_Ejercicio7.Producto#insProd()
	 * @generated
	 */
	EOperation getProducto__InsProd();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Producto#modProd() <em>Mod Prod</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mod Prod</em>' operation.
	 * @see tienda_Ejercicio7.Producto#modProd()
	 * @generated
	 */
	EOperation getProducto__ModProd();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Producto#remProd() <em>Rem Prod</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rem Prod</em>' operation.
	 * @see tienda_Ejercicio7.Producto#remProd()
	 * @generated
	 */
	EOperation getProducto__RemProd();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Producto#visProd() <em>Vis Prod</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vis Prod</em>' operation.
	 * @see tienda_Ejercicio7.Producto#visProd()
	 * @generated
	 */
	EOperation getProducto__VisProd();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Venta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venta</em>'.
	 * @see tienda_Ejercicio7.Venta
	 * @generated
	 */
	EClass getVenta();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Venta#getIdVenta <em>Id Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Venta</em>'.
	 * @see tienda_Ejercicio7.Venta#getIdVenta()
	 * @see #getVenta()
	 * @generated
	 */
	EAttribute getVenta_IdVenta();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Venta#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see tienda_Ejercicio7.Venta#getHora()
	 * @see #getVenta()
	 * @generated
	 */
	EAttribute getVenta_Hora();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Venta#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see tienda_Ejercicio7.Venta#getFecha()
	 * @see #getVenta()
	 * @generated
	 */
	EAttribute getVenta_Fecha();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Venta#getEmpleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Empleado</em>'.
	 * @see tienda_Ejercicio7.Venta#getEmpleado()
	 * @see #getVenta()
	 * @generated
	 */
	EReference getVenta_Empleado();

	/**
	 * Returns the meta object for the reference '{@link tienda_Ejercicio7.Venta#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cliente</em>'.
	 * @see tienda_Ejercicio7.Venta#getCliente()
	 * @see #getVenta()
	 * @generated
	 */
	EReference getVenta_Cliente();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Venta#insVenta() <em>Ins Venta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ins Venta</em>' operation.
	 * @see tienda_Ejercicio7.Venta#insVenta()
	 * @generated
	 */
	EOperation getVenta__InsVenta();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Venta#modVenta() <em>Mod Venta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mod Venta</em>' operation.
	 * @see tienda_Ejercicio7.Venta#modVenta()
	 * @generated
	 */
	EOperation getVenta__ModVenta();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Venta#remVenta() <em>Rem Venta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rem Venta</em>' operation.
	 * @see tienda_Ejercicio7.Venta#remVenta()
	 * @generated
	 */
	EOperation getVenta__RemVenta();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Venta#visVenta() <em>Vis Venta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vis Venta</em>' operation.
	 * @see tienda_Ejercicio7.Venta#visVenta()
	 * @generated
	 */
	EOperation getVenta__VisVenta();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see tienda_Ejercicio7.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Cliente#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see tienda_Ejercicio7.Cliente#getIdCliente()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Cliente#getDni <em>Dni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dni</em>'.
	 * @see tienda_Ejercicio7.Cliente#getDni()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Dni();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see tienda_Ejercicio7.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Cliente#getCorreoElectronico <em>Correo Electronico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correo Electronico</em>'.
	 * @see tienda_Ejercicio7.Cliente#getCorreoElectronico()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_CorreoElectronico();

	/**
	 * Returns the meta object for the reference list '{@link tienda_Ejercicio7.Cliente#getVenta <em>Venta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Venta</em>'.
	 * @see tienda_Ejercicio7.Cliente#getVenta()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Venta();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Cliente#insCliente() <em>Ins Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ins Cliente</em>' operation.
	 * @see tienda_Ejercicio7.Cliente#insCliente()
	 * @generated
	 */
	EOperation getCliente__InsCliente();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Cliente#modCliente() <em>Mod Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mod Cliente</em>' operation.
	 * @see tienda_Ejercicio7.Cliente#modCliente()
	 * @generated
	 */
	EOperation getCliente__ModCliente();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Cliente#remCliente() <em>Rem Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rem Cliente</em>' operation.
	 * @see tienda_Ejercicio7.Cliente#remCliente()
	 * @generated
	 */
	EOperation getCliente__RemCliente();

	/**
	 * Returns the meta object for the '{@link tienda_Ejercicio7.Cliente#visCliente() <em>Vis Cliente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vis Cliente</em>' operation.
	 * @see tienda_Ejercicio7.Cliente#visCliente()
	 * @generated
	 */
	EOperation getCliente__VisCliente();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Lacteo <em>Lacteo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lacteo</em>'.
	 * @see tienda_Ejercicio7.Lacteo
	 * @generated
	 */
	EClass getLacteo();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Lacteo#getProteinas <em>Proteinas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proteinas</em>'.
	 * @see tienda_Ejercicio7.Lacteo#getProteinas()
	 * @see #getLacteo()
	 * @generated
	 */
	EAttribute getLacteo_Proteinas();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Lacteo#getLactosa <em>Lactosa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lactosa</em>'.
	 * @see tienda_Ejercicio7.Lacteo#getLactosa()
	 * @see #getLacteo()
	 * @generated
	 */
	EAttribute getLacteo_Lactosa();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Lacteo#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animal</em>'.
	 * @see tienda_Ejercicio7.Lacteo#getAnimal()
	 * @see #getLacteo()
	 * @generated
	 */
	EAttribute getLacteo_Animal();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Lacteo#getPH <em>PH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PH</em>'.
	 * @see tienda_Ejercicio7.Lacteo#getPH()
	 * @see #getLacteo()
	 * @generated
	 */
	EAttribute getLacteo_PH();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Fruta <em>Fruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fruta</em>'.
	 * @see tienda_Ejercicio7.Fruta
	 * @generated
	 */
	EClass getFruta();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Fruta#getGlucidos <em>Glucidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glucidos</em>'.
	 * @see tienda_Ejercicio7.Fruta#getGlucidos()
	 * @see #getFruta()
	 * @generated
	 */
	EAttribute getFruta_Glucidos();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Fruta#getFibra <em>Fibra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fibra</em>'.
	 * @see tienda_Ejercicio7.Fruta#getFibra()
	 * @see #getFruta()
	 * @generated
	 */
	EAttribute getFruta_Fibra();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Fruta#getVitaminas <em>Vitaminas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vitaminas</em>'.
	 * @see tienda_Ejercicio7.Fruta#getVitaminas()
	 * @see #getFruta()
	 * @generated
	 */
	EAttribute getFruta_Vitaminas();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Fruta#getSales_minerales <em>Sales minerales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales minerales</em>'.
	 * @see tienda_Ejercicio7.Fruta#getSales_minerales()
	 * @see #getFruta()
	 * @generated
	 */
	EAttribute getFruta_Sales_minerales();

	/**
	 * Returns the meta object for class '{@link tienda_Ejercicio7.Postre <em>Postre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postre</em>'.
	 * @see tienda_Ejercicio7.Postre
	 * @generated
	 */
	EClass getPostre();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Postre#getCalorias <em>Calorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calorias</em>'.
	 * @see tienda_Ejercicio7.Postre#getCalorias()
	 * @see #getPostre()
	 * @generated
	 */
	EAttribute getPostre_Calorias();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Postre#getHidratosDeCarbono <em>Hidratos De Carbono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidratos De Carbono</em>'.
	 * @see tienda_Ejercicio7.Postre#getHidratosDeCarbono()
	 * @see #getPostre()
	 * @generated
	 */
	EAttribute getPostre_HidratosDeCarbono();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Postre#getAzucares <em>Azucares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azucares</em>'.
	 * @see tienda_Ejercicio7.Postre#getAzucares()
	 * @see #getPostre()
	 * @generated
	 */
	EAttribute getPostre_Azucares();

	/**
	 * Returns the meta object for the attribute '{@link tienda_Ejercicio7.Postre#getEpocaDeConsumo <em>Epoca De Consumo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epoca De Consumo</em>'.
	 * @see tienda_Ejercicio7.Postre#getEpocaDeConsumo()
	 * @see #getPostre()
	 * @generated
	 */
	EAttribute getPostre_EpocaDeConsumo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tienda_Ejercicio7Factory getTienda_Ejercicio7Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.TiendaImpl <em>Tienda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.TiendaImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getTienda()
		 * @generated
		 */
		EClass TIENDA = eINSTANCE.getTienda();

		/**
		 * The meta object literal for the '<em><b>Id Tienda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__ID_TIENDA = eINSTANCE.getTienda_IdTienda();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__NOMBRE = eINSTANCE.getTienda_Nombre();

		/**
		 * The meta object literal for the '<em><b>Calle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__CALLE = eINSTANCE.getTienda_Calle();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__CIUDAD = eINSTANCE.getTienda_Ciudad();

		/**
		 * The meta object literal for the '<em><b>Cod Postal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__COD_POSTAL = eINSTANCE.getTienda_CodPostal();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__TELEFONO = eINSTANCE.getTienda_Telefono();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__FAX = eINSTANCE.getTienda_Fax();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIENDA__TIPO = eINSTANCE.getTienda_Tipo();

		/**
		 * The meta object literal for the '<em><b>Empleado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIENDA__EMPLEADO = eINSTANCE.getTienda_Empleado();

		/**
		 * The meta object literal for the '<em><b>Ins Tienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIENDA___INS_TIENDA = eINSTANCE.getTienda__InsTienda();

		/**
		 * The meta object literal for the '<em><b>Mod Tienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIENDA___MOD_TIENDA = eINSTANCE.getTienda__ModTienda();

		/**
		 * The meta object literal for the '<em><b>Rem Tienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIENDA___REM_TIENDA = eINSTANCE.getTienda__RemTienda();

		/**
		 * The meta object literal for the '<em><b>Vis Tienda</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIENDA___VIS_TIENDA = eINSTANCE.getTienda__VisTienda();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.EmpleadoImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Id Empleado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__ID_EMPLEADO = eINSTANCE.getEmpleado_IdEmpleado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__NOMBRE = eINSTANCE.getEmpleado_Nombre();

		/**
		 * The meta object literal for the '<em><b>Apellido Uno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__APELLIDO_UNO = eINSTANCE.getEmpleado_ApellidoUno();

		/**
		 * The meta object literal for the '<em><b>Apellido Dos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__APELLIDO_DOS = eINSTANCE.getEmpleado_ApellidoDos();

		/**
		 * The meta object literal for the '<em><b>Cargo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__CARGO = eINSTANCE.getEmpleado_Cargo();

		/**
		 * The meta object literal for the '<em><b>Tienda asignada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__TIENDA_ASIGNADA = eINSTANCE.getEmpleado_Tienda_asignada();

		/**
		 * The meta object literal for the '<em><b>Tienda</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__TIENDA = eINSTANCE.getEmpleado_Tienda();

		/**
		 * The meta object literal for the '<em><b>Producto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__PRODUCTO = eINSTANCE.getEmpleado_Producto();

		/**
		 * The meta object literal for the '<em><b>Venta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__VENTA = eINSTANCE.getEmpleado_Venta();

		/**
		 * The meta object literal for the '<em><b>Ins Emple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLEADO___INS_EMPLE = eINSTANCE.getEmpleado__InsEmple();

		/**
		 * The meta object literal for the '<em><b>Mod Emple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLEADO___MOD_EMPLE = eINSTANCE.getEmpleado__ModEmple();

		/**
		 * The meta object literal for the '<em><b>Rem Emple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLEADO___REM_EMPLE = eINSTANCE.getEmpleado__RemEmple();

		/**
		 * The meta object literal for the '<em><b>Vis Emple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLEADO___VIS_EMPLE = eINSTANCE.getEmpleado__VisEmple();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.ProductoImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Id Producto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ID_PRODUCTO = eINSTANCE.getProducto_IdProducto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__NOMBRE = eINSTANCE.getProducto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PRECIO = eINSTANCE.getProducto_Precio();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__DESCRIPCION = eINSTANCE.getProducto_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Id Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ID_TIPO = eINSTANCE.getProducto_IdTipo();

		/**
		 * The meta object literal for the '<em><b>Empleado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__EMPLEADO = eINSTANCE.getProducto_Empleado();

		/**
		 * The meta object literal for the '<em><b>Ins Prod</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTO___INS_PROD = eINSTANCE.getProducto__InsProd();

		/**
		 * The meta object literal for the '<em><b>Mod Prod</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTO___MOD_PROD = eINSTANCE.getProducto__ModProd();

		/**
		 * The meta object literal for the '<em><b>Rem Prod</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTO___REM_PROD = eINSTANCE.getProducto__RemProd();

		/**
		 * The meta object literal for the '<em><b>Vis Prod</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTO___VIS_PROD = eINSTANCE.getProducto__VisProd();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.VentaImpl <em>Venta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.VentaImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getVenta()
		 * @generated
		 */
		EClass VENTA = eINSTANCE.getVenta();

		/**
		 * The meta object literal for the '<em><b>Id Venta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENTA__ID_VENTA = eINSTANCE.getVenta_IdVenta();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENTA__HORA = eINSTANCE.getVenta_Hora();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENTA__FECHA = eINSTANCE.getVenta_Fecha();

		/**
		 * The meta object literal for the '<em><b>Empleado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENTA__EMPLEADO = eINSTANCE.getVenta_Empleado();

		/**
		 * The meta object literal for the '<em><b>Cliente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENTA__CLIENTE = eINSTANCE.getVenta_Cliente();

		/**
		 * The meta object literal for the '<em><b>Ins Venta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENTA___INS_VENTA = eINSTANCE.getVenta__InsVenta();

		/**
		 * The meta object literal for the '<em><b>Mod Venta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENTA___MOD_VENTA = eINSTANCE.getVenta__ModVenta();

		/**
		 * The meta object literal for the '<em><b>Rem Venta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENTA___REM_VENTA = eINSTANCE.getVenta__RemVenta();

		/**
		 * The meta object literal for the '<em><b>Vis Venta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VENTA___VIS_VENTA = eINSTANCE.getVenta__VisVenta();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.ClienteImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ID_CLIENTE = eINSTANCE.getCliente_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Dni</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__DNI = eINSTANCE.getCliente_Dni();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Correo Electronico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CORREO_ELECTRONICO = eINSTANCE.getCliente_CorreoElectronico();

		/**
		 * The meta object literal for the '<em><b>Venta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__VENTA = eINSTANCE.getCliente_Venta();

		/**
		 * The meta object literal for the '<em><b>Ins Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___INS_CLIENTE = eINSTANCE.getCliente__InsCliente();

		/**
		 * The meta object literal for the '<em><b>Mod Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___MOD_CLIENTE = eINSTANCE.getCliente__ModCliente();

		/**
		 * The meta object literal for the '<em><b>Rem Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___REM_CLIENTE = eINSTANCE.getCliente__RemCliente();

		/**
		 * The meta object literal for the '<em><b>Vis Cliente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___VIS_CLIENTE = eINSTANCE.getCliente__VisCliente();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.LacteoImpl <em>Lacteo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.LacteoImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getLacteo()
		 * @generated
		 */
		EClass LACTEO = eINSTANCE.getLacteo();

		/**
		 * The meta object literal for the '<em><b>Proteinas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LACTEO__PROTEINAS = eINSTANCE.getLacteo_Proteinas();

		/**
		 * The meta object literal for the '<em><b>Lactosa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LACTEO__LACTOSA = eINSTANCE.getLacteo_Lactosa();

		/**
		 * The meta object literal for the '<em><b>Animal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LACTEO__ANIMAL = eINSTANCE.getLacteo_Animal();

		/**
		 * The meta object literal for the '<em><b>PH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LACTEO__PH = eINSTANCE.getLacteo_PH();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.FrutaImpl <em>Fruta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.FrutaImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getFruta()
		 * @generated
		 */
		EClass FRUTA = eINSTANCE.getFruta();

		/**
		 * The meta object literal for the '<em><b>Glucidos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRUTA__GLUCIDOS = eINSTANCE.getFruta_Glucidos();

		/**
		 * The meta object literal for the '<em><b>Fibra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRUTA__FIBRA = eINSTANCE.getFruta_Fibra();

		/**
		 * The meta object literal for the '<em><b>Vitaminas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRUTA__VITAMINAS = eINSTANCE.getFruta_Vitaminas();

		/**
		 * The meta object literal for the '<em><b>Sales minerales</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRUTA__SALES_MINERALES = eINSTANCE.getFruta_Sales_minerales();

		/**
		 * The meta object literal for the '{@link tienda_Ejercicio7.impl.PostreImpl <em>Postre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tienda_Ejercicio7.impl.PostreImpl
		 * @see tienda_Ejercicio7.impl.Tienda_Ejercicio7PackageImpl#getPostre()
		 * @generated
		 */
		EClass POSTRE = eINSTANCE.getPostre();

		/**
		 * The meta object literal for the '<em><b>Calorias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTRE__CALORIAS = eINSTANCE.getPostre_Calorias();

		/**
		 * The meta object literal for the '<em><b>Hidratos De Carbono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTRE__HIDRATOS_DE_CARBONO = eINSTANCE.getPostre_HidratosDeCarbono();

		/**
		 * The meta object literal for the '<em><b>Azucares</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTRE__AZUCARES = eINSTANCE.getPostre_Azucares();

		/**
		 * The meta object literal for the '<em><b>Epoca De Consumo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTRE__EPOCA_DE_CONSUMO = eINSTANCE.getPostre_EpocaDeConsumo();

	}

} //Tienda_Ejercicio7Package
