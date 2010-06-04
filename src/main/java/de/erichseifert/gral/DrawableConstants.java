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

package de.erichseifert.gral;

/**
 * Interface that solely stores constants concerning Drawables.
 * Stored constants include location and orientation.
 */
public interface DrawableConstants {
	/**
	 * Indicates the location of a Drawable.
	 */
	static enum Location {
		/** Central location. */
		CENTER(0.5, 0.5),
		/** Northern location. */
		NORTH(0.5, 0.0),
		/** North-eastern location. */
		NORTH_EAST(1.0, 0.0),
		/** Eastern location. */
		EAST(1.0, 0.5),
		/** South-eastern location. */
		SOUTH_EAST(1.0, 1.0),
		/** Southern location. */
		SOUTH(0.5, 1.0),
		/** South-western location. */
		SOUTH_WEST(0.0, 1.0),
		/** Western location. */
		WEST(0.0,  0.5),
		/** North-western location. */
		NORTH_WEST(0.0, 0.0);

		private final double alignH;
		private final double alignV;

		Location(double alignH, double alignV) {
			this.alignH = alignH;
			this.alignV = alignV;
		}

		/**
		 * Returns the horizontal alignment as a double value.
		 * @return horizontal alignment
		 */
		public double getAlignmentH() {
			return alignH;
		}
		/**
		 * Returns the vertical alignment as a double value.
		 * @return vertical alignment
		 */
		public double getAlignmentV() {
			return alignV;
		}
	};

	/**
	 * Orientation of a Drawable.
	 */
	static enum Orientation {
		/** Horizontal orientation. */
		HORIZONTAL,
		/** Vertical orientation. */
		VERTICAL
	};

}