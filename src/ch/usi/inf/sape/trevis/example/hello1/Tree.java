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
package ch.usi.inf.sape.trevis.example.hello1;

import ch.usi.inf.sape.trevis.model.AbstractContextTree;


public final class Tree extends AbstractContextTree {

	private final TreeNode root;
	 
	
	public Tree() {
		root = new TreeNode("root");
		final TreeNode a = new TreeNode("a");
		root.connectChild(a);
		final TreeNode b = new TreeNode("b");
		final TreeNode ba = new TreeNode("ba");
		b.connectChild(ba);
		final TreeNode bb = new TreeNode("bb");
		b.connectChild(bb);
		root.connectChild(b);
	}
 
	public TreeNode getRoot() {
		return root;
	}
	
}
