/**
 */
package tienda_Ejercicio7.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tienda_Ejercicio7.Fruta;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fruta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.FrutaImpl#getGlucidos <em>Glucidos</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.FrutaImpl#getFibra <em>Fibra</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.FrutaImpl#getVitaminas <em>Vitaminas</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.FrutaImpl#getSales_minerales <em>Sales minerales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrutaImpl extends ProductoImpl implements Fruta {
	/**
	 * The default value of the '{@link #getGlucidos() <em>Glucidos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucidos()
	 * @generated
	 * @ordered
	 */
	protected static final float GLUCIDOS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGlucidos() <em>Glucidos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucidos()
	 * @generated
	 * @ordered
	 */
	protected float glucidos = GLUCIDOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFibra() <em>Fibra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFibra()
	 * @generated
	 * @ordered
	 */
	protected static final String FIBRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFibra() <em>Fibra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFibra()
	 * @generated
	 * @ordered
	 */
	protected String fibra = FIBRA_EDEFAULT;

	/**
	 * The default value of the '{@link #getVitaminas() <em>Vitaminas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitaminas()
	 * @generated
	 * @ordered
	 */
	protected static final float VITAMINAS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVitaminas() <em>Vitaminas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitaminas()
	 * @generated
	 * @ordered
	 */
	protected float vitaminas = VITAMINAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSales_minerales() <em>Sales minerales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales_minerales()
	 * @generated
	 * @ordered
	 */
	protected static final float SALES_MINERALES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSales_minerales() <em>Sales minerales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales_minerales()
	 * @generated
	 * @ordered
	 */
	protected float sales_minerales = SALES_MINERALES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrutaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.FRUTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGlucidos() {
		return glucidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlucidos(float newGlucidos) {
		float oldGlucidos = glucidos;
		glucidos = newGlucidos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.FRUTA__GLUCIDOS, oldGlucidos, glucidos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFibra() {
		return fibra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFibra(String newFibra) {
		String oldFibra = fibra;
		fibra = newFibra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.FRUTA__FIBRA, oldFibra, fibra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVitaminas() {
		return vitaminas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitaminas(float newVitaminas) {
		float oldVitaminas = vitaminas;
		vitaminas = newVitaminas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.FRUTA__VITAMINAS, oldVitaminas, vitaminas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSales_minerales() {
		return sales_minerales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSales_minerales(float newSales_minerales) {
		float oldSales_minerales = sales_minerales;
		sales_minerales = newSales_minerales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.FRUTA__SALES_MINERALES, oldSales_minerales, sales_minerales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.FRUTA__GLUCIDOS:
				return getGlucidos();
			case Tienda_Ejercicio7Package.FRUTA__FIBRA:
				return getFibra();
			case Tienda_Ejercicio7Package.FRUTA__VITAMINAS:
				return getVitaminas();
			case Tienda_Ejercicio7Package.FRUTA__SALES_MINERALES:
				return getSales_minerales();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.FRUTA__GLUCIDOS:
				setGlucidos((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.FRUTA__FIBRA:
				setFibra((String)newValue);
				return;
			case Tienda_Ejercicio7Package.FRUTA__VITAMINAS:
				setVitaminas((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.FRUTA__SALES_MINERALES:
				setSales_minerales((Float)newValue);
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
			case Tienda_Ejercicio7Package.FRUTA__GLUCIDOS:
				setGlucidos(GLUCIDOS_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.FRUTA__FIBRA:
				setFibra(FIBRA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.FRUTA__VITAMINAS:
				setVitaminas(VITAMINAS_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.FRUTA__SALES_MINERALES:
				setSales_minerales(SALES_MINERALES_EDEFAULT);
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
			case Tienda_Ejercicio7Package.FRUTA__GLUCIDOS:
				return glucidos != GLUCIDOS_EDEFAULT;
			case Tienda_Ejercicio7Package.FRUTA__FIBRA:
				return FIBRA_EDEFAULT == null ? fibra != null : !FIBRA_EDEFAULT.equals(fibra);
			case Tienda_Ejercicio7Package.FRUTA__VITAMINAS:
				return vitaminas != VITAMINAS_EDEFAULT;
			case Tienda_Ejercicio7Package.FRUTA__SALES_MINERALES:
				return sales_minerales != SALES_MINERALES_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (glucidos: ");
		result.append(glucidos);
		result.append(", fibra: ");
		result.append(fibra);
		result.append(", vitaminas: ");
		result.append(vitaminas);
		result.append(", sales_minerales: ");
		result.append(sales_minerales);
		result.append(')');
		return result.toString();
	}

} //FrutaImpl
