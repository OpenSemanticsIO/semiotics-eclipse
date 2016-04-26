/**
 * Copyright 2016 OpenSemantics.IO
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.opensemantics.semiotics.model.assessment.provider;


import io.opensemantics.semiotics.model.assessment.Application;
import io.opensemantics.semiotics.model.assessment.AssessmentFactory;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link io.opensemantics.semiotics.model.assessment.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLabelPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addScmPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_label_feature", "_UI_Label_type"),
				 AssessmentPackage.Literals.LABEL__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_scm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_scm_feature", "_UI_Application_type"),
				 AssessmentPackage.Literals.APPLICATION__SCM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_languages_feature", "_UI_Application_type"),
				 AssessmentPackage.Literals.APPLICATION__LANGUAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Notes_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Notes_notes_feature", "_UI_Notes_type"),
				 AssessmentPackage.Literals.NOTES__NOTES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__ACCOUNTS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__ENTITLEMENTS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__CONTROLLERS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__MODELS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__LIBRARIES);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__VIEWS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__SINKS);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__RESOURCES);
			childrenFeatures.add(AssessmentPackage.Literals.APPLICATION__URLS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("famfamfam/silk/building.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application)object).getLabel();
		return label == null || label.length() == 0 ? "" : label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Application.class)) {
			case AssessmentPackage.APPLICATION__LABEL:
			case AssessmentPackage.APPLICATION__NOTES:
			case AssessmentPackage.APPLICATION__LANGUAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AssessmentPackage.APPLICATION__ACCOUNTS:
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
			case AssessmentPackage.APPLICATION__CONTROLLERS:
			case AssessmentPackage.APPLICATION__MODELS:
			case AssessmentPackage.APPLICATION__LIBRARIES:
			case AssessmentPackage.APPLICATION__VIEWS:
			case AssessmentPackage.APPLICATION__SINKS:
			case AssessmentPackage.APPLICATION__RESOURCES:
			case AssessmentPackage.APPLICATION__URLS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__ACCOUNTS,
				 AssessmentFactory.eINSTANCE.createAccount()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__ENTITLEMENTS,
				 AssessmentFactory.eINSTANCE.createEntitlement()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__CONTROLLERS,
				 AssessmentFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__MODELS,
				 AssessmentFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__LIBRARIES,
				 AssessmentFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__VIEWS,
				 AssessmentFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__SINKS,
				 AssessmentFactory.eINSTANCE.createSink()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__RESOURCES,
				 AssessmentFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(AssessmentPackage.Literals.APPLICATION__URLS,
				 AssessmentFactory.eINSTANCE.createUrl()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AssessmentEditPlugin.INSTANCE;
	}

}
