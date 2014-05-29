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

import tienda_Ejercicio7.Cliente;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;
import tienda_Ejercicio7.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.ClienteImpl#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ClienteImpl#getDni <em>Dni</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ClienteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ClienteImpl#getCorreoElectronico <em>Correo Electronico</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.ClienteImpl#getVenta <em>Venta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClienteImpl extends MinimalEObjectImpl.Container implements Cliente {
	/**
	 * The default value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_CLIENTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdCliente() <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCliente()
	 * @generated
	 * @ordered
	 */
	protected int idCliente = ID_CLIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected static final int DNI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected int dni = DNI_EDEFAULT;

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
	 * The default value of the '{@link #getCorreoElectronico() <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoElectronico()
	 * @generated
	 * @ordered
	 */
	protected static final String CORREO_ELECTRONICO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorreoElectronico() <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoElectronico()
	 * @generated
	 * @ordered
	 */
	protected String correoElectronico = CORREO_ELECTRONICO_EDEFAULT;

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
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCliente(int newIdCliente) {
		int oldIdCliente = idCliente;
		idCliente = newIdCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.CLIENTE__ID_CLIENTE, oldIdCliente, idCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDni(int newDni) {
		int oldDni = dni;
		dni = newDni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.CLIENTE__DNI, oldDni, dni));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.CLIENTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorreoElectronico(String newCorreoElectronico) {
		String oldCorreoElectronico = correoElectronico;
		correoElectronico = newCorreoElectronico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.CLIENTE__CORREO_ELECTRONICO, oldCorreoElectronico, correoElectronico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Venta> getVenta() {
		if (venta == null) {
			venta = new EObjectWithInverseResolvingEList<Venta>(Venta.class, this, Tienda_Ejercicio7Package.CLIENTE__VENTA, Tienda_Ejercicio7Package.VENTA__CLIENTE);
		}
		return venta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insCliente() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modCliente() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remCliente() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visCliente() {
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
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE__ID_CLIENTE:
				return getIdCliente();
			case Tienda_Ejercicio7Package.CLIENTE__DNI:
				return getDni();
			case Tienda_Ejercicio7Package.CLIENTE__NOMBRE:
				return getNombre();
			case Tienda_Ejercicio7Package.CLIENTE__CORREO_ELECTRONICO:
				return getCorreoElectronico();
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE__ID_CLIENTE:
				setIdCliente((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__DNI:
				setDni((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__CORREO_ELECTRONICO:
				setCorreoElectronico((String)newValue);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE__ID_CLIENTE:
				setIdCliente(ID_CLIENTE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__DNI:
				setDni(DNI_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__CORREO_ELECTRONICO:
				setCorreoElectronico(CORREO_ELECTRONICO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE__ID_CLIENTE:
				return idCliente != ID_CLIENTE_EDEFAULT;
			case Tienda_Ejercicio7Package.CLIENTE__DNI:
				return dni != DNI_EDEFAULT;
			case Tienda_Ejercicio7Package.CLIENTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Tienda_Ejercicio7Package.CLIENTE__CORREO_ELECTRONICO:
				return CORREO_ELECTRONICO_EDEFAULT == null ? correoElectronico != null : !CORREO_ELECTRONICO_EDEFAULT.equals(correoElectronico);
			case Tienda_Ejercicio7Package.CLIENTE__VENTA:
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
			case Tienda_Ejercicio7Package.CLIENTE___INS_CLIENTE:
				insCliente();
				return null;
			case Tienda_Ejercicio7Package.CLIENTE___MOD_CLIENTE:
				modCliente();
				return null;
			case Tienda_Ejercicio7Package.CLIENTE___REM_CLIENTE:
				remCliente();
				return null;
			case Tienda_Ejercicio7Package.CLIENTE___VIS_CLIENTE:
				visCliente();
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
		result.append(" (idCliente: ");
		result.append(idCliente);
		result.append(", dni: ");
		result.append(dni);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", correoElectronico: ");
		result.append(correoElectronico);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
