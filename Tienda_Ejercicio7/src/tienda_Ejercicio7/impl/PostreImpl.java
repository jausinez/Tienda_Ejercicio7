/**
 */
package tienda_Ejercicio7.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tienda_Ejercicio7.Postre;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.PostreImpl#getCalorias <em>Calorias</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.PostreImpl#getHidratosDeCarbono <em>Hidratos De Carbono</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.PostreImpl#getAzucares <em>Azucares</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.PostreImpl#getEpocaDeConsumo <em>Epoca De Consumo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostreImpl extends ProductoImpl implements Postre {
	/**
	 * The default value of the '{@link #getCalorias() <em>Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalorias()
	 * @generated
	 * @ordered
	 */
	protected static final float CALORIAS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCalorias() <em>Calorias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalorias()
	 * @generated
	 * @ordered
	 */
	protected float calorias = CALORIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHidratosDeCarbono() <em>Hidratos De Carbono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidratosDeCarbono()
	 * @generated
	 * @ordered
	 */
	protected static final float HIDRATOS_DE_CARBONO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHidratosDeCarbono() <em>Hidratos De Carbono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidratosDeCarbono()
	 * @generated
	 * @ordered
	 */
	protected float hidratosDeCarbono = HIDRATOS_DE_CARBONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzucares() <em>Azucares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzucares()
	 * @generated
	 * @ordered
	 */
	protected static final float AZUCARES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAzucares() <em>Azucares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzucares()
	 * @generated
	 * @ordered
	 */
	protected float azucares = AZUCARES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpocaDeConsumo() <em>Epoca De Consumo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpocaDeConsumo()
	 * @generated
	 * @ordered
	 */
	protected static final String EPOCA_DE_CONSUMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpocaDeConsumo() <em>Epoca De Consumo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpocaDeConsumo()
	 * @generated
	 * @ordered
	 */
	protected String epocaDeConsumo = EPOCA_DE_CONSUMO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.POSTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCalorias() {
		return calorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalorias(float newCalorias) {
		float oldCalorias = calorias;
		calorias = newCalorias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.POSTRE__CALORIAS, oldCalorias, calorias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHidratosDeCarbono() {
		return hidratosDeCarbono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidratosDeCarbono(float newHidratosDeCarbono) {
		float oldHidratosDeCarbono = hidratosDeCarbono;
		hidratosDeCarbono = newHidratosDeCarbono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.POSTRE__HIDRATOS_DE_CARBONO, oldHidratosDeCarbono, hidratosDeCarbono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAzucares() {
		return azucares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzucares(float newAzucares) {
		float oldAzucares = azucares;
		azucares = newAzucares;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.POSTRE__AZUCARES, oldAzucares, azucares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEpocaDeConsumo() {
		return epocaDeConsumo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpocaDeConsumo(String newEpocaDeConsumo) {
		String oldEpocaDeConsumo = epocaDeConsumo;
		epocaDeConsumo = newEpocaDeConsumo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.POSTRE__EPOCA_DE_CONSUMO, oldEpocaDeConsumo, epocaDeConsumo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.POSTRE__CALORIAS:
				return getCalorias();
			case Tienda_Ejercicio7Package.POSTRE__HIDRATOS_DE_CARBONO:
				return getHidratosDeCarbono();
			case Tienda_Ejercicio7Package.POSTRE__AZUCARES:
				return getAzucares();
			case Tienda_Ejercicio7Package.POSTRE__EPOCA_DE_CONSUMO:
				return getEpocaDeConsumo();
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
			case Tienda_Ejercicio7Package.POSTRE__CALORIAS:
				setCalorias((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.POSTRE__HIDRATOS_DE_CARBONO:
				setHidratosDeCarbono((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.POSTRE__AZUCARES:
				setAzucares((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.POSTRE__EPOCA_DE_CONSUMO:
				setEpocaDeConsumo((String)newValue);
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
			case Tienda_Ejercicio7Package.POSTRE__CALORIAS:
				setCalorias(CALORIAS_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.POSTRE__HIDRATOS_DE_CARBONO:
				setHidratosDeCarbono(HIDRATOS_DE_CARBONO_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.POSTRE__AZUCARES:
				setAzucares(AZUCARES_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.POSTRE__EPOCA_DE_CONSUMO:
				setEpocaDeConsumo(EPOCA_DE_CONSUMO_EDEFAULT);
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
			case Tienda_Ejercicio7Package.POSTRE__CALORIAS:
				return calorias != CALORIAS_EDEFAULT;
			case Tienda_Ejercicio7Package.POSTRE__HIDRATOS_DE_CARBONO:
				return hidratosDeCarbono != HIDRATOS_DE_CARBONO_EDEFAULT;
			case Tienda_Ejercicio7Package.POSTRE__AZUCARES:
				return azucares != AZUCARES_EDEFAULT;
			case Tienda_Ejercicio7Package.POSTRE__EPOCA_DE_CONSUMO:
				return EPOCA_DE_CONSUMO_EDEFAULT == null ? epocaDeConsumo != null : !EPOCA_DE_CONSUMO_EDEFAULT.equals(epocaDeConsumo);
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
		result.append(" (calorias: ");
		result.append(calorias);
		result.append(", hidratosDeCarbono: ");
		result.append(hidratosDeCarbono);
		result.append(", azucares: ");
		result.append(azucares);
		result.append(", epocaDeConsumo: ");
		result.append(epocaDeConsumo);
		result.append(')');
		return result.toString();
	}

} //PostreImpl
