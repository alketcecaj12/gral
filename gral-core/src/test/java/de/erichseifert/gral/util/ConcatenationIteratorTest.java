/*
 * GRAL: GRAphing Library for Java(R)
 *
 * (C) Copyright 2009-2016 Erich Seifert <dev[at]erichseifert.de>,
 * Michael Seifert <mseifert[at]error-reports.org>
 *
 * This file is part of GRAL.
 *
 * GRAL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GRAL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GRAL.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.erichseifert.gral.util;

import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Iterator;
import org.junit.Test;

public class ConcatenationIteratorTest {
	@Test
	public void testHasNextReturnsFalseWhenAllInputIteratorAreEmpty() {
		Iterator<Object> emptyIterator = Arrays.asList().iterator();
		Iterator<Object> emptyIterator2 = Arrays.asList().iterator();
		ConcatenationIterator<Object> concatenationIterator = new ConcatenationIterator<Object>(emptyIterator, emptyIterator2);

		boolean hasNext = concatenationIterator.hasNext();

		assertFalse(hasNext);
	}
}