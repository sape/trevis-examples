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

import java.util.Random;

import ch.usi.inf.sape.trevis.model.AbstractContextTree;


public final class Tree extends AbstractContextTree {

	private static final Random RANDOM = new Random(19);
	private static final int NODES = 1000;
	private static final int MAX_DEGREE = 10;
	private static final String[] LABELS = {"Walk", "Sleep", "Eat", "Work", "Run", "Sit"};
	
	private final WeightedTreeNode root;
	 
	
	public Tree() {
		root = new WeightedTreeNode("root", 0);
		addSubtree(root, NODES);
	}
	
	private void addSubtree(final WeightedTreeNode top, int availableNodes) {
		if (availableNodes>0) {
			int childCount = RANDOM.nextInt(Math.min(MAX_DEGREE, availableNodes));
			if (childCount==0) {
				childCount = 1;
			}
			availableNodes -= childCount;
			final int availableChildNodes = availableNodes/childCount;
			for (int i=0; i<childCount; i++) {
				final WeightedTreeNode child = new WeightedTreeNode(LABELS[RANDOM.nextInt(LABELS.length)], RANDOM.nextInt(1000));
				addSubtree(child, i==0?availableChildNodes%childCount+availableChildNodes:availableChildNodes);
				top.connectChild(child);
			}
		}
	}
	
	public WeightedTreeNode getRoot() {
		return root;
	}
	
}
