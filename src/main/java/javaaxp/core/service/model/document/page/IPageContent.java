/*
 * java-axp XPS utility
 * Copyright (C) 2007-2008 Chris Pope
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package javaaxp.core.service.model.document.page;

import javaaxp.core.service.model.document.ILinkTargets;

public interface IPageContent {

	/**
	 * Gets the value of the pageContentLinkTargets property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CTCPLinkTargets }
	 *     
	 */
	public abstract ILinkTargets getPageContentLinkTargets();

	/**
	 * Gets the value of the height property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getHeight();

	/**
	 * Gets the value of the source property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getSource();

	/**
	 * Gets the value of the width property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getWidth();

}