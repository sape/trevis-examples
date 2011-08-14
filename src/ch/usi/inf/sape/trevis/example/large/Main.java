/*
 * This file is licensed to You under the "Simplified BSD License".
 * You may not use this software except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/bsd-license.php
 *
 * See the COPYRIGHT file distributed with this work for information
 * regarding copyright ownership.
 */
package ch.usi.inf.sape.trevis.example.large;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import ch.usi.inf.sape.trevis.model.attribute.InclusiveLongAttribute;
import ch.usi.inf.sape.trevis.model.attribute.LongAttribute;
import ch.usi.inf.sape.trevis.model.attribute.StringAttribute;
import ch.usi.inf.sape.trevis.model.attribute.StringConcat;
import ch.usi.inf.sape.trevis.model.attribute.StringConstant;
import ch.usi.inf.sape.trevis.model.attribute.ToString;
import ch.usi.inf.sape.trevis.swing.BreadcrumbBar;
import ch.usi.inf.sape.trevis.swing.HighriseRenderer;
import ch.usi.inf.sape.trevis.swing.LinearRenderer;
import ch.usi.inf.sape.trevis.swing.RadialRenderer;
import ch.usi.inf.sape.trevis.swing.TreeMapRenderer;
import ch.usi.inf.sape.trevis.swing.TreeView;
import ch.usi.inf.sape.trevis.swing.TreeViewRenderer;
 

public final class Main {
	
	public static void main(final String[] args) {
		final Tree tree = new Tree();
		final JFrame frame = new JFrame("Large Random Tree");
		final HighriseRenderer highriseRenderer = new HighriseRenderer();
		final TreeView view = new TreeView(new TreeViewRenderer[] {highriseRenderer, new LinearRenderer(), new RadialRenderer(), new TreeMapRenderer()});
		
		final StringAttribute labelAttribute = new LabelAttribute();
		final LongAttribute weightAttribute = new WeightAttribute();
		final LongAttribute inclusiveWeightAttribute = new InclusiveLongAttribute(new WeightAttribute());
		
		view.setHueAttribute(labelAttribute);
		view.addAvailableHueAttribute(labelAttribute);
		
		view.addAvailableSaturationAttribute(weightAttribute);
		
		view.setSizeAttribute(inclusiveWeightAttribute);
		view.addAvailableSizeAttribute(inclusiveWeightAttribute);
		
		view.setLabelAttribute(labelAttribute);
		
		view.setTooltipAttribute(new StringConcat(new StringAttribute[] {
				new StringConstant("<html><b>"),
				labelAttribute,
				new StringConstant("</b><br>Exclusive: <b>"),
				new ToString(weightAttribute),
				new StringConstant("</b><br>Inclusive: <b>"),
				new ToString(inclusiveWeightAttribute)
				}));
		
		view.setShowPropertiesOverlay(false);
		
		highriseRenderer.setHeightAttribute(weightAttribute);
		highriseRenderer.addAvailableHeightAttribute(weightAttribute);
		
		view.setTree(tree);
		frame.add(view);
		frame.add(new BreadcrumbBar(view), BorderLayout.NORTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
