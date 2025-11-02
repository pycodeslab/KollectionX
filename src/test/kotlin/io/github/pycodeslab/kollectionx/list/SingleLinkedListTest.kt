package io.github.pycodeslab.kollectionx.list

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SingleLinkedListTest {
    @Test
    fun testAppendAddsElementToEmptyList() {
        val list = SingleLinkedList<Int>()
        val node = list.append(42)
        assertEquals(42, node.value)
        assertEquals(null, node.next)
    }

    @Test
    fun testAppendAddsMultipleElements() {
        val list = SingleLinkedList<Int>()
        val firstNode = list.append(42)
        val secondNode = list.append(43)
        list.append(44)
        list.append(45)
        assertEquals(42, firstNode.value)
        assertEquals(secondNode, firstNode.next)
    }

    @Test
    fun testSizeIncrementsCorrectlyWithEachAppend() {
        val list = SingleLinkedList<Int>()
        assertEquals(0, list.size)

        list.append(1)
        assertEquals(1, list.size)

        list.append(2)
        assertEquals(2, list.size)

        list.append(3)
        assertEquals(3, list.size)
    }

    @Test
    fun testPrependAddsElementToEmptyList() {
        val list = SingleLinkedList<Int>()
        val node = list.prepend(42)
        assertEquals(42, node.value)
        assertEquals(null, node.next)
    }

    @Test
    fun testPrependAddsElementToNonEmptyList() {
        val list = SingleLinkedList<Int>()
        val secondNode = list.append(42)
        list.append(43)
        list.append(44)
        list.append(45)

        val node = list.prepend(30)
        assertEquals(30, node.value)
        assertEquals(secondNode, node.next)
    }

    @Test
    fun testSizeIncrementsCorrectlyWithEachPrepend() {
        val list = SingleLinkedList<Int>()
        assertEquals(0, list.size)

        list.prepend(1)
        assertEquals(1, list.size)

        list.prepend(2)
        assertEquals(2, list.size)

        list.prepend(3)
        assertEquals(3, list.size)
    }

    @Test
    fun testInsertInFirstOfList() {
        val list = SingleLinkedList<Int>()
        val node = list.insert(5, 0)
        assertEquals(5, node.value)
        assertEquals(null, node.next)
    }

    @Test
    fun testInsertInTheMiddleOfList() {
        val list = SingleLinkedList<Int>()
        list.append(1)
        val secondNode = list.append(3)

        val node = list.insert(2, 1)
        assertEquals(2, node.value)
        assertEquals(secondNode, node.next)
    }

    @Test
    fun testInsertInLastOfList() {
        val list = SingleLinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        val node = list.insert(2, 5)
        assertEquals(2, node.value)
        assertEquals(null, node.next)
    }

    @Test
    fun testRemoveFirstOfList() {
        val list = SingleLinkedList<Int>()
        list.append(1)
        val secondNode = list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)
        assertEquals(5, list.size)

        val head = list.remove(0)
        assertEquals(4, list.size)
        assertEquals(secondNode, head)
    }
}
