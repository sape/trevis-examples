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
package ch.usi.inf.sape.trevis.example.hello2;

import javax.swing.JFrame;

import ch.usi.inf.sape.trevis.model.attribute.IsLeafAttribute;
import ch.usi.inf.sape.trevis.model.attribute.StringLength;
import ch.usi.inf.sape.trevis.model.attribute.ToString;
import ch.usi.inf.sape.trevis.swing.TreeView;
 

public final class Main {
	
	public static void main(final String[] args) {
		final Tree tree = new Tree();
		final JFrame frame = new JFrame("Hello Trevis 2");
		final TreeView view = new TreeView();
		// e2a
		view.setLabelAttribute(new LabelAttribute());
		// e2b
		view.setHueAttribute(new LabelAttribute());
		// e2c
		view.setHueAttribute(new ToString(new IsLeafAttribute()));
		// e2d
		view.setSaturationAttribute(new StringLength(new LabelAttribute()));
		view.setTree(tree);
		frame.add(view);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
