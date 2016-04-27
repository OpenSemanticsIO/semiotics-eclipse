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


import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Resource;
import io.opensemantics.semiotics.model.assessment.Snippet;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link io.opensemantics.semiotics.model.assessment.Snippet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SnippetItemProvider extends GraphNodeItemProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SnippetItemProvider(AdapterFactory adapterFactory) {
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

      addContentsPropertyDescriptor(object);
      addLineEndPropertyDescriptor(object);
      addColumnStartPropertyDescriptor(object);
      addColumnEndPropertyDescriptor(object);
      addLineStartPropertyDescriptor(object);
      addResourcePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Line End feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addLineEndPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Snippet_lineEnd_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Snippet_lineEnd_feature", "_UI_Snippet_type"),
         AssessmentPackage.Literals.SNIPPET__LINE_END,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Column Start feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addColumnStartPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Snippet_columnStart_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Snippet_columnStart_feature", "_UI_Snippet_type"),
         AssessmentPackage.Literals.SNIPPET__COLUMN_START,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Column End feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addColumnEndPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Snippet_columnEnd_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Snippet_columnEnd_feature", "_UI_Snippet_type"),
         AssessmentPackage.Literals.SNIPPET__COLUMN_END,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Contents feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addContentsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Contents_contents_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Contents_contents_feature", "_UI_Contents_type"),
         AssessmentPackage.Literals.CONTENTS__CONTENTS,
         true,
         true,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Line Start feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addLineStartPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Snippet_lineStart_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Snippet_lineStart_feature", "_UI_Snippet_type"),
         AssessmentPackage.Literals.SNIPPET__LINE_START,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Resource feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addResourcePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Snippet_resource_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Snippet_resource_feature", "_UI_Snippet_type"),
         AssessmentPackage.Literals.SNIPPET__RESOURCE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
	 * This returns Snippet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("famfamfam/silk/note.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Snippet snippet = (Snippet)object;
		StringBuilder label = new StringBuilder();
		Resource resource = snippet.getResource();
		if (resource != null) { 
			String resourceLabel = resource.getLabel();
			if (resourceLabel != null && !resourceLabel.equals("")) {
				label.append(resourceLabel);
				
				// Assume set if lineEnd is not 0
				if (snippet.getLineEnd() != 0) {
					label.append(String.format(", %d-%d", snippet.getLineStart(), snippet.getLineEnd()));
				}
			}
		}
		String snippetLabel = snippet.getLabel();
		if (snippetLabel != null && !snippet.equals("")) {
			if (label.length() != 0) label.append(": ");
			label.append(snippetLabel);
		} else {
			label.append(getString("_UI_Snippet_type"));
		}
		return label.toString();
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

    switch (notification.getFeatureID(Snippet.class)) {
      case AssessmentPackage.SNIPPET__CONTENTS:
      case AssessmentPackage.SNIPPET__LINE_END:
      case AssessmentPackage.SNIPPET__COLUMN_START:
      case AssessmentPackage.SNIPPET__COLUMN_END:
      case AssessmentPackage.SNIPPET__LINE_START:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

}
