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
import tienda_Ejercicio7.Tienda;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;
import tienda_Ejercicio7.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getIdEmpleado <em>Id Empleado</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getApellidoUno <em>Apellido Uno</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getApellidoDos <em>Apellido Dos</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getCargo <em>Cargo</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getTienda_asignada <em>Tienda asignada</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getTienda <em>Tienda</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getProducto <em>Producto</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.EmpleadoImpl#getVenta <em>Venta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmpleadoImpl extends MinimalEObjectImpl.Container implements Empleado {
	/**
	 * The default value of the '{@link #getIdEmpleado() <em>Id Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEmpleado()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EMPLEADO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdEmpleado() <em>Id Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEmpleado()
	 * @generated
	 * @ordered
	 */
	protected int idEmpleado = ID_EMPLEADO_EDEFAULT;

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
	 * The default value of the '{@link #getApellidoUno() <em>Apellido Uno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidoUno()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_UNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApellidoUno() <em>Apellido Uno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidoUno()
	 * @generated
	 * @ordered
	 */
	protected String apellidoUno = APELLIDO_UNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getApellidoDos() <em>Apellido Dos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidoDos()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_DOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApellidoDos() <em>Apellido Dos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidoDos()
	 * @generated
	 * @ordered
	 */
	protected String apellidoDos = APELLIDO_DOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected static final String CARGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected String cargo = CARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTienda_asignada() <em>Tienda asignada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_asignada()
	 * @generated
	 * @ordered
	 */
	protected static final String TIENDA_ASIGNADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTienda_asignada() <em>Tienda asignada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda_asignada()
	 * @generated
	 * @ordered
	 */
	protected String tienda_asignada = TIENDA_ASIGNADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTienda() <em>Tienda</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienda()
	 * @generated
	 * @ordered
	 */
	protected EList<Tienda> tienda;

	/**
	 * The cached value of the '{@link #getProducto() <em>Producto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> producto;

	/**
	 * The cached value of the '{@link #getVenta() <em>Venta</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenta()
	 * @generated
	 * @ordered
	 */
	protected EList<Venta> venta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpleadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.EMPLEADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdEmpleado(int newIdEmpleado) {
		int oldIdEmpleado = idEmpleado;
		idEmpleado = newIdEmpleado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__ID_EMPLEADO, oldIdEmpleado, idEmpleado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApellidoUno() {
		return apellidoUno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApellidoUno(String newApellidoUno) {
		String oldApellidoUno = apellidoUno;
		apellidoUno = newApellidoUno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_UNO, oldApellidoUno, apellidoUno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApellidoDos() {
		return apellidoDos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApellidoDos(String newApellidoDos) {
		String oldApellidoDos = apellidoDos;
		apellidoDos = newApellidoDos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_DOS, oldApellidoDos, apellidoDos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCargo(String newCargo) {
		String oldCargo = cargo;
		cargo = newCargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__CARGO, oldCargo, cargo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTienda_asignada() {
		return tienda_asignada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTienda_asignada(String newTienda_asignada) {
		String oldTienda_asignada = tienda_asignada;
		tienda_asignada = newTienda_asignada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.EMPLEADO__TIENDA_ASIGNADA, oldTienda_asignada, tienda_asignada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tienda> getTienda() {
		if (tienda == null) {
			tienda = new EObjectWithInverseResolvingEList.ManyInverse<Tienda>(Tienda.class, this, Tienda_Ejercicio7Package.EMPLEADO__TIENDA, Tienda_Ejercicio7Package.TIENDA__EMPLEADO);
		}
		return tienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getProducto() {
		if (producto == null) {
			producto = new EObjectWithInverseResolvingEList.ManyInverse<Producto>(Producto.class, this, Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO, Tienda_Ejercicio7Package.PRODUCTO__EMPLEADO);
		}
		return producto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Venta> getVenta() {
		if (venta == null) {
			venta = new EObjectWithInverseResolvingEList.ManyInverse<Venta>(Venta.class, this, Tienda_Ejercicio7Package.EMPLEADO__VENTA, Tienda_Ejercicio7Package.VENTA__EMPLEADO);
		}
		return venta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insEmple() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modEmple() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remEmple() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visEmple() {
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
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTienda()).basicAdd(otherEnd, msgs);
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducto()).basicAdd(otherEnd, msgs);
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVenta()).basicAdd(otherEnd, msgs);
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
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				return ((InternalEList<?>)getTienda()).basicRemove(otherEnd, msgs);
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				return ((InternalEList<?>)getProducto()).basicRemove(otherEnd, msgs);
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				return ((InternalEList<?>)getVenta()).basicRemove(otherEnd, msgs);
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
			case Tienda_Ejercicio7Package.EMPLEADO__ID_EMPLEADO:
				return getIdEmpleado();
			case Tienda_Ejercicio7Package.EMPLEADO__NOMBRE:
				return getNombre();
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_UNO:
				return getApellidoUno();
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_DOS:
				return getApellidoDos();
			case Tienda_Ejercicio7Package.EMPLEADO__CARGO:
				return getCargo();
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA_ASIGNADA:
				return getTienda_asignada();
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				return getTienda();
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				return getProducto();
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				return getVenta();
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
			case Tienda_Ejercicio7Package.EMPLEADO__ID_EMPLEADO:
				setIdEmpleado((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__NOMBRE:
				setNombre((String)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_UNO:
				setApellidoUno((String)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_DOS:
				setApellidoDos((String)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__CARGO:
				setCargo((String)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA_ASIGNADA:
				setTienda_asignada((String)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				getTienda().clear();
				getTienda().addAll((Collection<? extends Tienda>)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				getProducto().clear();
				getProducto().addAll((Collection<? extends Producto>)newValue);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				getVenta().clear();
				getVenta().addAll((Collection<? extends Venta>)newValue);
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
			case Tienda_Ejercicio7Package.EMPLEADO__ID_EMPLEADO:
				setIdEmpleado(ID_EMPLEADO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_UNO:
				setApellidoUno(APELLIDO_UNO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_DOS:
				setApellidoDos(APELLIDO_DOS_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__CARGO:
				setCargo(CARGO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA_ASIGNADA:
				setTienda_asignada(TIENDA_ASIGNADA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				getTienda().clear();
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				getProducto().clear();
				return;
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				getVenta().clear();
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
			case Tienda_Ejercicio7Package.EMPLEADO__ID_EMPLEADO:
				return idEmpleado != ID_EMPLEADO_EDEFAULT;
			case Tienda_Ejercicio7Package.EMPLEADO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_UNO:
				return APELLIDO_UNO_EDEFAULT == null ? apellidoUno != null : !APELLIDO_UNO_EDEFAULT.equals(apellidoUno);
			case Tienda_Ejercicio7Package.EMPLEADO__APELLIDO_DOS:
				return APELLIDO_DOS_EDEFAULT == null ? apellidoDos != null : !APELLIDO_DOS_EDEFAULT.equals(apellidoDos);
			case Tienda_Ejercicio7Package.EMPLEADO__CARGO:
				return CARGO_EDEFAULT == null ? cargo != null : !CARGO_EDEFAULT.equals(cargo);
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA_ASIGNADA:
				return TIENDA_ASIGNADA_EDEFAULT == null ? tienda_asignada != null : !TIENDA_ASIGNADA_EDEFAULT.equals(tienda_asignada);
			case Tienda_Ejercicio7Package.EMPLEADO__TIENDA:
				return tienda != null && !tienda.isEmpty();
			case Tienda_Ejercicio7Package.EMPLEADO__PRODUCTO:
				return producto != null && !producto.isEmpty();
			case Tienda_Ejercicio7Package.EMPLEADO__VENTA:
				return venta != null && !venta.isEmpty();
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
			case Tienda_Ejercicio7Package.EMPLEADO___INS_EMPLE:
				insEmple();
				return null;
			case Tienda_Ejercicio7Package.EMPLEADO___MOD_EMPLE:
				modEmple();
				return null;
			case Tienda_Ejercicio7Package.EMPLEADO___REM_EMPLE:
				remEmple();
				return null;
			case Tienda_Ejercicio7Package.EMPLEADO___VIS_EMPLE:
				visEmple();
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
		result.append(" (idEmpleado: ");
		result.append(idEmpleado);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", apellidoUno: ");
		result.append(apellidoUno);
		result.append(", apellidoDos: ");
		result.append(apellidoDos);
		result.append(", cargo: ");
		result.append(cargo);
		result.append(", tienda_asignada: ");
		result.append(tienda_asignada);
		result.append(')');
		return result.toString();
	}

} //EmpleadoImpl
