/**
 * GRAL: Vector export for Java(R) Graphics2D
 *
 * (C) Copyright 2009-2010 Erich Seifert <info[at]erichseifert.de>, Michael Seifert <michael.seifert[at]gmx.net>
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

package de.erichseifert.gral.data;


/**
 * Class that represents a DataSource containing the same value in each cell.
 */
public class DummyData extends AbstractDataSource {
	private Number value;
	private int cols;
	private int rows;

	/**
	 * Creates a new DummyData object with the specified number of columns
	 * and rows, which are filled all over with the same specified value.
	 * @param cols Number of columns.
	 * @param rows Number of rows.
	 * @param value Value of the cells.
	 */
	public DummyData(int cols, int rows, Number value) {
		this.cols = cols;
		this.rows = rows;
		this.value = value;
	}

	@Override
	public Number get(int col, int row) {
		return value;
	}

	@Override
	public int getColumnCount() {
		return cols;
	}

	@Override
	public int getRowCount() {
		return rows;
	}

}