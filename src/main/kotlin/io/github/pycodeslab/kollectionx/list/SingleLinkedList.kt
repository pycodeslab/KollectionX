package io.github.pycodeslab.kollectionx.list

import io.github.pycodeslab.kollectionx.list.node.SingleNode

/**
 * A singly linked list implementation where each node contains a reference to the next node only.
 *
 * This implementation maintains elements in insertion order and allows duplicate values.
 *
 * @param T the type of elements in this list
 */
class SingleLinkedList<T>: List<T, SingleNode<T>> {
    private var head: SingleNode<T>? = null
    private var count: Int = 0

    /**
     * Returns the number of elements in the list.
     */
    override val size: Int
        get() = count

    /**
     * Appends an element to the end of the list.
     *
     * Requires traversing the entire list to find the last node.
     *
     * @param value the element to append
     */
    override fun append(value: T): SingleNode<T> {
        val newNode = SingleNode(value)

        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
        count++

        return newNode
    }

    /**
     * Prepends an element to the beginning of the list.
     *
     * The new node becomes the head.
     *
     * @param value the element to prepend
     */
    override fun prepend(value: T): SingleNode<T> {
        val newNode = SingleNode(value)
        newNode.next = head
        head = newNode
        count++

        return newNode
    }

    /**
     * Inserts an element at the specified index.
     *
     * Valid index range: 0 to size (inclusive).
     *
     * @param value the element to insert
     * @param index the index at which to insert the element (0-based)
     * @throws IndexOutOfBoundsException if index < 0 or index > size
     */
    override fun insert(value: T, index: Int): SingleNode<T> {
        if (index !in 0..count) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for size $count")
        }

        if (index == 0) {
            return prepend(value)
        }

        if (index == count) {
            return append(value)
        }

        val newNode = SingleNode(value)
        val nodeBefore = getNodeAt(index - 1)

        newNode.next = nodeBefore?.next
        nodeBefore?.next = newNode
        count++

        return newNode
    }

    /**
     * Removes the element at the specified index.
     *
     * Valid index range: 0 to size-1 (inclusive).
     *
     * @param index the index of the element to remove (0-based)
     * @throws IndexOutOfBoundsException if index < 0 or index >= size
     */
    override fun remove(index: Int): SingleNode<T>? {
        if (index !in 0 until count) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for size $count")
        }

        if (index == 0) {
            head = head?.next
        } else {
            val nodeBefore = getNodeAt(index - 1)
            nodeBefore?.next = nodeBefore.next?.next
        }
        count--

        return head
    }

    private fun getNodeAt(index: Int): SingleNode<T>? {
        if (index == -1) return null

        var current = head
        repeat(index) {
            current = current?.next
        }
        return current
    }
}