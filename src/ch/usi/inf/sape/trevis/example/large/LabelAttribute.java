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

import ch.usi.inf.sape.trevis.model.ContextTreeNode;
import ch.usi.inf.sape.trevis.model.attribute.StringAttribute;


public final class LabelAttribute extends StringAttribute {
	
	public String getName() {
		return "Label";
	}
	
	public String getDescription() {
		return "Represents the label of the given tree node";
	}
	
	public String evaluate(final ContextTreeNode node) {
		return node.getLabel().toString();
	}
	
}
