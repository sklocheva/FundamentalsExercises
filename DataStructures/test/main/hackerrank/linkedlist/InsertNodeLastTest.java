package main.hackerrank.linkedlist;

import static main.hackerrank.LinkedListFixtures.node1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertNodeLastTest {

	@Test
	public void testFunc() {
		Node newSequence = InsertNodeLast.InsertLast(node1, 3);
		// go to last node
		while (newSequence.next != null) {
			newSequence = newSequence.next;
		}
		assertEquals(3, newSequence.data);
	}

	@Test
	public void testEmpty() {
		assertEquals(null, InsertNodeLast.InsertLast(null, 3));
	}

}
