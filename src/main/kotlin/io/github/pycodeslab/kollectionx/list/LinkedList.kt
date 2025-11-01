package io.github.pycodeslab.kollectionx.list

/**
 * A singly linked list implementation.
 *
 * This implementation uses nodes connected by references to form a linear data structure.
 * Elements are added to the end by traversing the entire list.
 *
 * @param T the type of elements in this list
 */
class LinkedList<T>: List<T> {
    private var head: Node<T>? = null
    private var count: Int = 0

    /**
     * Returns the number of elements in the list.
     */
    override val size: Int
        get() = count

    /**
     * Appends an element to the end of the list.
     *
     * @param value the element to append
     */
    override fun append(value: T) {
        val newNode = Node(value)

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
    }

    /**
     * Prepends an element to the beginning of the list.
     *
     * @param value the element to prepend
     */
    override fun prepend(value: T) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        count++
    }

    /**
     * Inserts an element at the specified index.
     *
     * @param value the element to insert
     * @param index the index at which to insert the element
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    override fun insert(value: T, index: Int) {
        if (index !in 0..count) {
            throw IndexOutOfBoundsException("Index $index is out of bounds for size $count")
        }

        if (index == 0) {
            prepend(value)
            return
        }

        if (index == count) {
            append(value)
            return
        }

        val newNode = Node(value)
        val nodeBefore = getNodeAt(index - 1)

        newNode.next = nodeBefore?.next
        nodeBefore?.next = newNode
        count++
    }

    /**
     * Removes an element at the specified index.
     *
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    override fun remove(index: Int) {
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
    }

    private fun getNodeAt(index: Int): Node<T>? {
        if (index == -1) return null

        var current = head
        repeat(index) {
            current = current?.next
        }
        return current
    }
}