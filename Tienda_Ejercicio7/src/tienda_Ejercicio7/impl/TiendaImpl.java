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
import tienda_Ejercicio7.Tienda;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tienda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getIdTienda <em>Id Tienda</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getCalle <em>Calle</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getCodPostal <em>Cod Postal</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.TiendaImpl#getEmpleado <em>Empleado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TiendaImpl extends MinimalEObjectImpl.Container implements Tienda {
	/**
	 * The default value of the '{@link #getIdTienda() <em>Id Tienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTienda()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TIENDA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIdTienda() <em>Id Tienda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTienda()
	 * @generated
	 * @ordered
	 */
	protected String idTienda = ID_TIENDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = "";

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
	 * The default value of the '{@link #getCalle() <em>Calle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalle()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalle() <em>Calle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalle()
	 * @generated
	 * @ordered
	 */
	protected String calle = CALLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected static final String CIUDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected String ciudad = CIUDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodPostal() <em>Cod Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodPostal()
	 * @generated
	 * @ordered
	 */
	protected static final int COD_POSTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodPostal() <em>Cod Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodPostal()
	 * @generated
	 * @ordered
	 */
	protected int codPostal = COD_POSTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEFONO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected int telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final int FAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected int fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

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
	protected TiendaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.TIENDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdTienda() {
		return idTienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdTienda(String newIdTienda) {
		String oldIdTienda = idTienda;
		idTienda = newIdTienda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__ID_TIENDA, oldIdTienda, idTienda));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalle(String newCalle) {
		String oldCalle = calle;
		calle = newCalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__CALLE, oldCalle, calle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCiudad(String newCiudad) {
		String oldCiudad = ciudad;
		ciudad = newCiudad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodPostal() {
		return codPostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodPostal(int newCodPostal) {
		int oldCodPostal = codPostal;
		codPostal = newCodPostal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__COD_POSTAL, oldCodPostal, codPostal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(int newTelefono) {
		int oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(int newFax) {
		int oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.TIENDA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleado() {
		if (empleado == null) {
			empleado = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<Empleado>(Empleado.class, this, Tienda_Ejercicio7Package.TIENDA__EMPLEADO, Tienda_Ejercicio7Package.EMPLEADO__TIENDA);
		}
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmpleado() {
		if (empleado != null) ((InternalEList.Unsettable<?>)empleado).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmpleado() {
		return empleado != null && ((InternalEList.Unsettable<?>)empleado).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insTienda() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modTienda() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remTienda() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visTienda() {
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
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
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
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
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
			case Tienda_Ejercicio7Package.TIENDA__ID_TIENDA:
				return getIdTienda();
			case Tienda_Ejercicio7Package.TIENDA__NOMBRE:
				return getNombre();
			case Tienda_Ejercicio7Package.TIENDA__CALLE:
				return getCalle();
			case Tienda_Ejercicio7Package.TIENDA__CIUDAD:
				return getCiudad();
			case Tienda_Ejercicio7Package.TIENDA__COD_POSTAL:
				return getCodPostal();
			case Tienda_Ejercicio7Package.TIENDA__TELEFONO:
				return getTelefono();
			case Tienda_Ejercicio7Package.TIENDA__FAX:
				return getFax();
			case Tienda_Ejercicio7Package.TIENDA__TIPO:
				return getTipo();
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
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
			case Tienda_Ejercicio7Package.TIENDA__ID_TIENDA:
				setIdTienda((String)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__NOMBRE:
				setNombre((String)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__CALLE:
				setCalle((String)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__CIUDAD:
				setCiudad((String)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__COD_POSTAL:
				setCodPostal((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__TELEFONO:
				setTelefono((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__FAX:
				setFax((Integer)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__TIPO:
				setTipo((String)newValue);
				return;
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
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
			case Tienda_Ejercicio7Package.TIENDA__ID_TIENDA:
				setIdTienda(ID_TIENDA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__CALLE:
				setCalle(CALLE_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__COD_POSTAL:
				setCodPostal(COD_POSTAL_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
				unsetEmpleado();
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
			case Tienda_Ejercicio7Package.TIENDA__ID_TIENDA:
				return ID_TIENDA_EDEFAULT == null ? idTienda != null : !ID_TIENDA_EDEFAULT.equals(idTienda);
			case Tienda_Ejercicio7Package.TIENDA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Tienda_Ejercicio7Package.TIENDA__CALLE:
				return CALLE_EDEFAULT == null ? calle != null : !CALLE_EDEFAULT.equals(calle);
			case Tienda_Ejercicio7Package.TIENDA__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
			case Tienda_Ejercicio7Package.TIENDA__COD_POSTAL:
				return codPostal != COD_POSTAL_EDEFAULT;
			case Tienda_Ejercicio7Package.TIENDA__TELEFONO:
				return telefono != TELEFONO_EDEFAULT;
			case Tienda_Ejercicio7Package.TIENDA__FAX:
				return fax != FAX_EDEFAULT;
			case Tienda_Ejercicio7Package.TIENDA__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case Tienda_Ejercicio7Package.TIENDA__EMPLEADO:
				return isSetEmpleado();
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
			case Tienda_Ejercicio7Package.TIENDA___INS_TIENDA:
				insTienda();
				return null;
			case Tienda_Ejercicio7Package.TIENDA___MOD_TIENDA:
				modTienda();
				return null;
			case Tienda_Ejercicio7Package.TIENDA___REM_TIENDA:
				remTienda();
				return null;
			case Tienda_Ejercicio7Package.TIENDA___VIS_TIENDA:
				visTienda();
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
		result.append(" (idTienda: ");
		result.append(idTienda);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", calle: ");
		result.append(calle);
		result.append(", ciudad: ");
		result.append(ciudad);
		result.append(", codPostal: ");
		result.append(codPostal);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", fax: ");
		result.append(fax);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //TiendaImpl
