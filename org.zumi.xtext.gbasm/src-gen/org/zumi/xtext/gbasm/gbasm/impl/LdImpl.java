/**
 * generated by Xtext 2.26.0
 */
package org.zumi.xtext.gbasm.gbasm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.zumi.xtext.gbasm.gbasm.GbasmPackage;
import org.zumi.xtext.gbasm.gbasm.Ld;
import org.zumi.xtext.gbasm.gbasm.LocalLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.zumi.xtext.gbasm.gbasm.impl.LdImpl#getLocLabel <em>Loc Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LdImpl extends InstructionImpl implements Ld
{
  /**
   * The cached value of the '{@link #getLocLabel() <em>Loc Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocLabel()
   * @generated
   * @ordered
   */
  protected LocalLabel locLabel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LdImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GbasmPackage.Literals.LD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalLabel getLocLabel()
  {
    if (locLabel != null && locLabel.eIsProxy())
    {
      InternalEObject oldLocLabel = (InternalEObject)locLabel;
      locLabel = (LocalLabel)eResolveProxy(oldLocLabel);
      if (locLabel != oldLocLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GbasmPackage.LD__LOC_LABEL, oldLocLabel, locLabel));
      }
    }
    return locLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalLabel basicGetLocLabel()
  {
    return locLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocLabel(LocalLabel newLocLabel)
  {
    LocalLabel oldLocLabel = locLabel;
    locLabel = newLocLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GbasmPackage.LD__LOC_LABEL, oldLocLabel, locLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GbasmPackage.LD__LOC_LABEL:
        if (resolve) return getLocLabel();
        return basicGetLocLabel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GbasmPackage.LD__LOC_LABEL:
        setLocLabel((LocalLabel)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GbasmPackage.LD__LOC_LABEL:
        setLocLabel((LocalLabel)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GbasmPackage.LD__LOC_LABEL:
        return locLabel != null;
    }
    return super.eIsSet(featureID);
  }

} //LdImpl