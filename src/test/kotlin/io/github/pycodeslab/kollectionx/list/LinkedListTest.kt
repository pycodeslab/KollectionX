package io.github.pycodeslab.kollectionx.list

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class LinkedListTest {
    @Test
    fun testAppendAddsElementToEmptyList() {
        val list = LinkedList<Int>()
        list.append(42)
        assertEquals(1, list.size)
    }

    @Test
    fun testAppendAddsMultipleElementsInOrder() {
        val list = LinkedList<String>()
        list.append("a")
        list.append("b")
        list.append("c")
        assertEquals(3, list.size)
    }

    @Test
    fun testAppendWorksWithDifferentTypes() {
        val intList = LinkedList<Int>()
        intList.append(1)
        intList.append(2)
        assertEquals(2, intList.size)

        val stringList = LinkedList<String>()
        stringList.append("hello")
        stringList.append("world")
        assertEquals(2, stringList.size)

        val doubleList = LinkedList<Double>()
        doubleList.append(3.14)
        doubleList.append(2.71)
        assertEquals(2, doubleList.size)
    }

    @Test
    fun testSizeIncrementsCorrectlyWithEachAppend() {
        val list = LinkedList<Int>()
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
        val list = LinkedList<Int>()
        list.prepend(42)
        assertEquals(1, list.size)
    }

    @Test
    fun testPrependAddsMultipleElementsInOrder() {
        val list = LinkedList<String>()
        list.prepend("a")
        list.prepend("b")
        list.prepend("c")
        assertEquals(3, list.size)
    }

    @Test
    fun testPrependWorksWithDifferentTypes() {
        val intList = LinkedList<Int>()
        intList.prepend(1)
        intList.prepend(2)
        assertEquals(2, intList.size)

        val stringList = LinkedList<String>()
        stringList.prepend("hello")
        stringList.prepend("world")
        assertEquals(2, stringList.size)

        val doubleList = LinkedList<Double>()
        doubleList.prepend(3.14)
        doubleList.prepend(2.71)
        assertEquals(2, doubleList.size)
    }

    @Test
    fun testSizeIncrementsCorrectlyWithEachPrepend() {
        val list = LinkedList<Int>()
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
        val list = LinkedList<Int>()
        list.insert(5, 0)
        assertEquals(1, list.size)
    }

    @Test
    fun testInsertInTheMiddleOfList() {
        val list = LinkedList<Int>()
        // Build initial list: [1, 2, 3, 4, 5]
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        // Insert at index 1 (middle position between 1 and 3)
        list.insert(2, 1)
        assertEquals(6, list.size)

        // Insert at index 2 (middle position between 2 and 3)
        list.insert(4, 2)
        assertEquals(7, list.size)

        // Insert at index 1 (near beginning, between 1 and 2)
        list.insert(10, 1)
        assertEquals(8, list.size)
    }

    @Test
    fun testInsertInLastOfList() {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        list.insert(2, 5)
    }

    @Test
    fun testRemoveFirstOfList() {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        list.append(4)
        list.append(5)

        list.remove(2)
        assertEquals(4, list.size)
    }
}
