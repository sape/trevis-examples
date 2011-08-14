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
import ch.usi.inf.sape.trevis.model.attribute.LongAttribute;


public final class WeightAttribute extends LongAttribute {
	
	public String getName() {
		return "Exclusive weight";
	}
	
	public String getDescription() {
		return "Exclusive weight of the given tree node";
	}
	
	public long evaluate(final ContextTreeNode node) {
		return ((WeightedTreeNode)node).getWeight();
	}
	
}