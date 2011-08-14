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
package ch.usi.inf.sape.trevis.example.hello3;

import ch.usi.inf.sape.trevis.model.AbstractContextTreeNode;


public final class WeightedTreeNode extends AbstractContextTreeNode {
	
	private final long weight;
	
	
	public WeightedTreeNode(final String label, final long weight) {
		super(label);
		this.weight = weight;
	}
	
	public long getWeight() {
		return weight;
	}
	
}
