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

import ch.usi.inf.sape.trevis.model.AbstractContextTree;


public final class Tree extends AbstractContextTree {

	private final WeightedTreeNode root;
	 
	
	public Tree() {
		root = new WeightedTreeNode("root", 0);
		final WeightedTreeNode a = new WeightedTreeNode("a", 10);
		root.connectChild(a);
		final WeightedTreeNode b = new WeightedTreeNode("b", 5);
		final WeightedTreeNode ba = new WeightedTreeNode("ba", 30);
		b.connectChild(ba);
		final WeightedTreeNode bb = new WeightedTreeNode("bb", 5);
		b.connectChild(bb);
		root.connectChild(b);
	}
	
	public WeightedTreeNode getRoot() {
		return root;
	}
	
}
