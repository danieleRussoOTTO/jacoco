/*******************************************************************************
 * Copyright (c) 2009, 2024 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Evgeny Mandrikov - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.test.validation.kotlin;

import org.jacoco.core.test.validation.ValidationTestBase;
import org.jacoco.core.test.validation.kotlin.targets.KotlinWhenExpressionTarget;

/**
 * Test of <code>when</code> expressions.
 */
public class KotlinWhenExpressionTest extends ValidationTestBase {

	public KotlinWhenExpressionTest() {
		super(KotlinWhenExpressionTarget.class);
	}

	@Override
	public void all_missed_instructions_should_have_line_number() {
		// https://github.com/jacoco/jacoco/issues/1557
	}

}
