/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.mirror.declaration;


import java.util.Collection;

import com.sun.mirror.type.ReferenceType;


/**
 * Represents a method or constructor of a class or interface.
 *
 * @deprecated All components of this API have been superseded by the
 * standardized annotation processing API.  The replacement for the
 * functionality of this interface is {@link
 * javax.lang.model.element.ExecutableElement}.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @since 1.5
 */
@Deprecated
public interface ExecutableDeclaration extends MemberDeclaration {

    /**
     * Returns <tt>true</tt> if this method or constructor accepts a variable
     * number of arguments.
     *
     * @return <tt>true</tt> if this method or constructor accepts a variable
     * number of arguments
     */
    boolean isVarArgs();

    /**
     * Returns the formal type parameters of this method or constructor.
     * They are returned in declaration order.
     *
     * @return the formal type parameters of this method or constructor,
     * or an empty collection if there are none
     */
    Collection<TypeParameterDeclaration> getFormalTypeParameters();

    /**
     * Returns the formal parameters of this method or constructor.
     * They are returned in declaration order.
     *
     * @return the formal parameters of this method or constructor,
     * or an empty collection if there are none
     */
    Collection<ParameterDeclaration> getParameters();

    /**
     * Returns the exceptions and other throwables listed in this
     * method or constructor's <tt>throws</tt> clause.
     *
     * @return the exceptions and other throwables listed in the
     * <tt>throws</tt> clause, or an empty collection if there are none
     */
    Collection<ReferenceType> getThrownTypes();
}
