/**
 */
package tienda_Ejercicio7.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tienda_Ejercicio7.Lacteo;
import tienda_Ejercicio7.Tienda_Ejercicio7Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lacteo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tienda_Ejercicio7.impl.LacteoImpl#getProteinas <em>Proteinas</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.LacteoImpl#getLactosa <em>Lactosa</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.LacteoImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link tienda_Ejercicio7.impl.LacteoImpl#getPH <em>PH</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LacteoImpl extends ProductoImpl implements Lacteo {
	/**
	 * The default value of the '{@link #getProteinas() <em>Proteinas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteinas()
	 * @generated
	 * @ordered
	 */
	protected static final float PROTEINAS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProteinas() <em>Proteinas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProteinas()
	 * @generated
	 * @ordered
	 */
	protected float proteinas = PROTEINAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLactosa() <em>Lactosa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLactosa()
	 * @generated
	 * @ordered
	 */
	protected static final float LACTOSA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLactosa() <em>Lactosa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLactosa()
	 * @generated
	 * @ordered
	 */
	protected float lactosa = LACTOSA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnimal() <em>Animal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected static final String ANIMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected String animal = ANIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPH() <em>PH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPH()
	 * @generated
	 * @ordered
	 */
	protected static final float PH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPH() <em>PH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPH()
	 * @generated
	 * @ordered
	 */
	protected float pH = PH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LacteoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tienda_Ejercicio7Package.Literals.LACTEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProteinas() {
		return proteinas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProteinas(float newProteinas) {
		float oldProteinas = proteinas;
		proteinas = newProteinas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.LACTEO__PROTEINAS, oldProteinas, proteinas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLactosa() {
		return lactosa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLactosa(float newLactosa) {
		float oldLactosa = lactosa;
		lactosa = newLactosa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.LACTEO__LACTOSA, oldLactosa, lactosa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnimal() {
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimal(String newAnimal) {
		String oldAnimal = animal;
		animal = newAnimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.LACTEO__ANIMAL, oldAnimal, animal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPH() {
		return pH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPH(float newPH) {
		float oldPH = pH;
		pH = newPH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tienda_Ejercicio7Package.LACTEO__PH, oldPH, pH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tienda_Ejercicio7Package.LACTEO__PROTEINAS:
				return getProteinas();
			case Tienda_Ejercicio7Package.LACTEO__LACTOSA:
				return getLactosa();
			case Tienda_Ejercicio7Package.LACTEO__ANIMAL:
				return getAnimal();
			case Tienda_Ejercicio7Package.LACTEO__PH:
				return getPH();
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
			case Tienda_Ejercicio7Package.LACTEO__PROTEINAS:
				setProteinas((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.LACTEO__LACTOSA:
				setLactosa((Float)newValue);
				return;
			case Tienda_Ejercicio7Package.LACTEO__ANIMAL:
				setAnimal((String)newValue);
				return;
			case Tienda_Ejercicio7Package.LACTEO__PH:
				setPH((Float)newValue);
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
			case Tienda_Ejercicio7Package.LACTEO__PROTEINAS:
				setProteinas(PROTEINAS_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.LACTEO__LACTOSA:
				setLactosa(LACTOSA_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.LACTEO__ANIMAL:
				setAnimal(ANIMAL_EDEFAULT);
				return;
			case Tienda_Ejercicio7Package.LACTEO__PH:
				setPH(PH_EDEFAULT);
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
			case Tienda_Ejercicio7Package.LACTEO__PROTEINAS:
				return proteinas != PROTEINAS_EDEFAULT;
			case Tienda_Ejercicio7Package.LACTEO__LACTOSA:
				return lactosa != LACTOSA_EDEFAULT;
			case Tienda_Ejercicio7Package.LACTEO__ANIMAL:
				return ANIMAL_EDEFAULT == null ? animal != null : !ANIMAL_EDEFAULT.equals(animal);
			case Tienda_Ejercicio7Package.LACTEO__PH:
				return pH != PH_EDEFAULT;
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
		result.append(" (proteinas: ");
		result.append(proteinas);
		result.append(", lactosa: ");
		result.append(lactosa);
		result.append(", animal: ");
		result.append(animal);
		result.append(", pH: ");
		result.append(pH);
		result.append(')');
		return result.toString();
	}

} //LacteoImpl
