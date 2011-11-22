/*
 * GRAL: GRAphing Library for Java(R)
 *
 * (C) Copyright 2009-2011 Erich Seifert <dev[at]erichseifert.de>,
 * Michael Seifert <michael.seifert[at]gmx.net>
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
package de.erichseifert.gral.examples.barplot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.LinearGradientPaint;

import de.erichseifert.gral.Location;
import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.examples.ExamplePanel;
import de.erichseifert.gral.plots.BarPlot;
import de.erichseifert.gral.plots.points.PointRenderer;
import de.erichseifert.gral.ui.InteractivePanel;
import de.erichseifert.gral.util.GraphicsUtils;
import de.erichseifert.gral.util.Insets2D;


public class SimpleBarPlot extends ExamplePanel {
	public SimpleBarPlot() {
		// Create example data
		DataTable data = new DataTable(Double.class, Integer.class, Integer.class);
		data.add(0.1,  1,  6);
		data.add(0.2,  3,  8);
		data.add(0.3, -2,  2);
		data.add(0.4,  6,  6);
		data.add(0.5, -4,  8);
		data.add(0.6,  8, 18);
		data.add(0.7,  9,  9);
		data.add(0.8, 11,  1);

		// Create new bar plot
		BarPlot plot = new BarPlot(data);

		// Format plot
		plot.setInsets(new Insets2D.Double(40.0, 40.0, 40.0, 40.0));
		plot.setSetting(BarPlot.BAR_WIDTH, 0.075);

		// Format bars
		PointRenderer pointRenderer = plot.getPointRenderer(data);
		pointRenderer.setSetting(PointRenderer.COLOR,
				new LinearGradientPaint(0f,0f, 0f,1f,
						new float[] { 0.0f, 1.0f },
						new Color[] { COLOR1, GraphicsUtils.deriveBrighter(COLOR1) }
				)
		);
		pointRenderer.setSetting(BarPlot.BarRenderer.STROKE, new BasicStroke(3f));
		pointRenderer.setSetting(BarPlot.BarRenderer.STROKE_COLOR,
				new LinearGradientPaint(0f,0f, 0f,1f,
						new float[] { 0.0f, 1.0f },
						new Color[] { GraphicsUtils.deriveBrighter(COLOR1), COLOR1 }
				)
		);
		pointRenderer.setSetting(PointRenderer.VALUE_DISPLAYED, true);
		pointRenderer.setSetting(PointRenderer.VALUE_LOCATION, Location.CENTER);
		pointRenderer.setSetting(PointRenderer.VALUE_COLOR, GraphicsUtils.deriveDarker(COLOR1));
		pointRenderer.setSetting(PointRenderer.VALUE_FONT,
				Font.decode(null).deriveFont(Font.BOLD));

		// Add plot to Swing component
		add(new InteractivePanel(plot));
	}

	@Override
	public String getTitle() {
		return "Bar plot";
	}

	@Override
	public String getDescription() {
		return "Bar plot with example data and color gradients";
	}

	public static void main(String[] args) {
		new SimpleBarPlot().showInFrame();
	}
}
