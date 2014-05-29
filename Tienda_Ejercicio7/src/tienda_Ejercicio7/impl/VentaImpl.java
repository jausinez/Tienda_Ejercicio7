/**
 */
package tienda_Ejercicio7.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tienda_Ejercicio7.Cliente;
import tienda_Ejercicio7.Empleado;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;
import tienda_Ejercicio7.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Venta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.VentaImpl#getIdVenta <em>Id Venta</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.VentaImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.VentaImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.VentaImpl#getEmpleado <em>Empleado</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.VentaImpl#getCliente <em>Cliente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VentaImpl extends MinimalEObjectImpl.Container implements Venta {
	/**
	 * The default value of the '{@link #getIdVenta() <em>Id Venta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVenta()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_VENTA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdVenta() <em>Id Venta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVenta()
	 * @generated
	 * @ordered
	 */
	protected int idVenta = ID_VENTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected Date hora = HORA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected Date fecha = FECHA_EDEFAULT;

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
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente cliente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VentaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.VENTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdVenta() {
		return idVenta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdVenta(int newIdVenta) {
		int oldIdVenta = idVenta;
		idVenta = newIdVenta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.VENTA__ID_VENTA, oldIdVenta, idVenta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHora() {
		return hora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHora(Date newHora) {
		Date oldHora = hora;
		hora = newHora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.VENTA__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(Date newFecha) {
		Date oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.VENTA__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleado() {
		if (empleado == null) {
			empleado = new EObjectWithInverseResolvingEList.ManyInverse<Empleado>(Empleado.class, this, Tienda_Ejercicio7Package.VENTA__EMPLEADO, Tienda_Ejercicio7Package.EMPLEADO__VENTA);
		}
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getCliente() {
		if (cliente != null && cliente.eIsProxy()) {
			InternalEObject oldCliente = (InternalEObject)cliente;
			cliente = (Cliente)eResolveProxy(oldCliente);
			if (cliente != oldCliente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tienda_Ejercicio7Package.VENTA__CLIENTE, oldCliente, cliente));
			}
		}
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente basicGetCliente() {
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCliente(Cliente newCliente, NotificationChain msgs) {
		Cliente oldCliente = cliente;
		cliente = newCliente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.VENTA__CLIENTE, oldCliente, newCliente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCliente(Cliente newCliente) {
		if (newCliente != cliente) {
			NotificationChain msgs = null;
			if (cliente != null)
				msgs = ((InternalEObject)cliente).eInverseRemove(this, Tienda_Ejercicio7Package.CLIENTE__VENTA, Cliente.class, msgs);
			if (newCliente != null)
				msgs = ((InternalEObject)newCliente).eInverseAdd(this, Tienda_Ejercicio7Package.CLIENTE__VENTA, Cliente.class, msgs);
			msgs = basicSetCliente(newCliente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.VENTA__CLIENTE, newCliente, newCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insVenta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modVenta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remVenta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visVenta() {
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
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmpleado()).basicAdd(otherEnd, msgs);
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				if (cliente != null)
					msgs = ((InternalEObject)cliente).eInverseRemove(this, Tienda_Ejercicio7Package.CLIENTE__VENTA, Cliente.class, msgs);
				return basicSetCliente((Cliente)otherEnd, msgs);
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
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				return ((InternalEList<?>)getEmpleado()).basicRemove(otherEnd, msgs);
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				return basicSetCliente(null, msgs);
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
			case Tienda_Ejercicio7Package.VENTA__ID_VENTA:
				return getIdVenta();
			case Tienda_Ejercicio7Package.VENTA__HORA:
				return getHora();
			case Tienda_Ejercicio7Package.VENTA__FECHA:
				return getFecha();
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				return getEmpleado();
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				if (resolve) return getCliente();
				return basicGetCliente();
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
			case Tienda_Ejercicio7Package.VENTA__ID_VENTA:
				setIdVenta((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.VENTA__HORA:
				setHora((Date)newValue);
				return;
			case Tienda_Ejercicio7Package.VENTA__FECHA:
				setFecha((Date)newValue);
				return;
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				getEmpleado().clear();
				getEmpleado().addAll((Collection<? extends Empleado>)newValue);
				return;
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				setCliente((Cliente)newValue);
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
			case Tienda_Ejercicio7Package.VENTA__ID_VENTA:
				setIdVenta(ID_VENTA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.VENTA__HORA:
				setHora(HORA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.VENTA__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				getEmpleado().clear();
				return;
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				setCliente((Cliente)null);
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
			case Tienda_Ejercicio7Package.VENTA__ID_VENTA:
				return idVenta != ID_VENTA_EDEFAULT;
			case Tienda_Ejercicio7Package.VENTA__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case Tienda_Ejercicio7Package.VENTA__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case Tienda_Ejercicio7Package.VENTA__EMPLEADO:
				return empleado != null && !empleado.isEmpty();
			case Tienda_Ejercicio7Package.VENTA__CLIENTE:
				return cliente != null;
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
			case Tienda_Ejercicio7Package.VENTA___INS_VENTA:
				insVenta();
				return null;
			case Tienda_Ejercicio7Package.VENTA___MOD_VENTA:
				modVenta();
				return null;
			case Tienda_Ejercicio7Package.VENTA___REM_VENTA:
				remVenta();
				return null;
			case Tienda_Ejercicio7Package.VENTA___VIS_VENTA:
				visVenta();
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
		result.append(" (idVenta: ");
		result.append(idVenta);
		result.append(", hora: ");
		result.append(hora);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(')');
		return result.toString();
	}

} //VentaImpl
