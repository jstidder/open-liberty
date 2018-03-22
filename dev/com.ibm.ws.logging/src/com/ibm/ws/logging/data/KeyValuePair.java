/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.logging.data;

/**
 *
 */
public interface KeyValuePair {
    public static enum ValueTypes {
        STRING, INTEGER, LONG, FLOAT, BOOLEAN
    }

    public boolean isInteger();

    public boolean isLong();

    public boolean isString();

    public boolean isFloat();

    public boolean isBoolean();

    public Integer getIntValue();

    public Long getLongValue();

    public String getStringValue();

    public Float getFloatValue();

    public Boolean getBooleanValue();

    public ValueTypes getType();

    public String getKey();
}
