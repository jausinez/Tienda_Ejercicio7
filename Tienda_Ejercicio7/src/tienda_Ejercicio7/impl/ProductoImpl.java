/**
 */
package tienda_Ejercicio7.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tienda_Ejercicio7.Empleado;
import tienda_Ejercicio7.Producto;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getIdTipo <em>Id Tipo</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ProductoImpl#getEmpleado <em>Empleado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto {
	/**
	 * The default value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PRODUCTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected int idProducto = ID_PRODUCTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected double precio = PRECIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdTipo() <em>Id Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTipo()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_TIPO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdTipo() <em>Id Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTipo()
	 * @generated
	 * @ordered
	 */
	protected int idTipo = ID_TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmpleado() <em>Empleado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpleado()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> empleado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.PRODUCTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdProducto() {
		return idProducto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProducto(int newIdProducto) {
		int oldIdProducto = idProducto;
		idProducto = newIdProducto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.PRODUCTO__ID_PRODUCTO, oldIdProducto, idProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.PRODUCTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(double newPrecio) {
		double oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.PRODUCTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.PRODUCTO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdTipo() {
		return idTipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdTipo(int newIdTipo) {
		int oldIdTipo = idTipo;
		idTipo = newIdTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.PRODUCTO__ID_TIPO, oldIdTipo, idTipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleado() {
		if (empleado == null) {
			empleado = new EObjectWithInverseResolvingEList.ManyInverse<Empleado>(Empleado.class, this, Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO, Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO);
		}
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insProd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modProd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remProd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visProd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmpleado()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				return ((InternalEList<?>)getEmpleado()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__ID_PRODUCTO:
				return getIdProducto();
			case Tienda_Ejercicio7Package.PRODUCTO__NOMBRE:
				return getNombre();
			case Tienda_Ejercicio7Package.PRODUCTO__PRECIO:
				return getPrecio();
			case Tienda_Ejercicio7Package.PRODUCTO__DESCRIPCION:
				return getDescripcion();
			case Tienda_Ejercicio7Package.PRODUCTO__ID_TIPO:
				return getIdTipo();
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				return getEmpleado();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__ID_PRODUCTO:
				setIdProducto((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__PRECIO:
				setPrecio((Double)newValue);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__ID_TIPO:
				setIdTipo((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				getEmpleado().clear();
				getEmpleado().addAll((Collection<? extends Empleado>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__ID_PRODUCTO:
				setIdProducto(ID_PRODUCTO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__ID_TIPO:
				setIdTipo(ID_TIPO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				getEmpleado().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.PRODUCTO__ID_PRODUCTO:
				return idProducto != ID_PRODUCTO_EDEFAULT;
			case Tienda_Ejercicio7Package.PRODUCTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Tienda_Ejercicio7Package.PRODUCTO__PRECIO:
				return precio != PRECIO_EDEFAULT;
			case Tienda_Ejercicio7Package.PRODUCTO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case Tienda_Ejercicio7Package.PRODUCTO__ID_TIPO:
				return idTipo != ID_TIPO_EDEFAULT;
			case Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO:
				return empleado != null && !empleado.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Tienda_Ejercicio7Package.PRODUCTO___INS_PROD:
				insProd();
				return null;
			case Tienda_Ejercicio7Package.PRODUCTO___MOD_PROD:
				modProd();
				return null;
			case Tienda_Ejercicio7Package.PRODUCTO___REM_PROD:
				remProd();
				return null;
			case Tienda_Ejercicio7Package.PRODUCTO___VIS_PROD:
				visProd();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idProducto: ");
		result.append(idProducto);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", precio: ");
		result.append(precio);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", idTipo: ");
		result.append(idTipo);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
