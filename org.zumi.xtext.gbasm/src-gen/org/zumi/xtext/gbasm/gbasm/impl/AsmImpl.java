/**
 * generated by Xtext 2.26.0
 */
package org.zumi.xtext.gbasm.gbasm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.zumi.xtext.gbasm.gbasm.Asm;
import org.zumi.xtext.gbasm.gbasm.GbasmPackage;
import org.zumi.xtext.gbasm.gbasm.LabelOrConstant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.zumi.xtext.gbasm.gbasm.impl.AsmImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsmImpl extends MinimalEObjectImpl.Container implements Asm
{
  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected EList<LabelOrConstant> labels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsmImpl()
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
    return GbasmPackage.Literals.ASM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LabelOrConstant> getLabels()
  {
    if (labels == null)
    {
      labels = new EObjectContainmentEList<LabelOrConstant>(LabelOrConstant.class, this, GbasmPackage.ASM__LABELS);
    }
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GbasmPackage.ASM__LABELS:
        return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GbasmPackage.ASM__LABELS:
        return getLabels();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GbasmPackage.ASM__LABELS:
        getLabels().clear();
        getLabels().addAll((Collection<? extends LabelOrConstant>)newValue);
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
      case GbasmPackage.ASM__LABELS:
        getLabels().clear();
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
      case GbasmPackage.ASM__LABELS:
        return labels != null && !labels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AsmImpl
