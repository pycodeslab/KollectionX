package io.github.pycodeslab.kollectionx.list

/**
 * A generic list interface that defines basic list operations.
 *
 * @param T the type of elements in this list
 */
interface List<T> {
    /**
     * Returns the number of elements in the list.
     */
    val size: Int


    /**
     * Appends an element to the end of the list.
     *
     * @param value the element to append
     */
    fun append(value: T)

    /**
     * Prepends an element to the beginning of the list.
     *
     * @param value the element to prepend
     */
    fun prepend(value: T)

    /**
     * Inserts an element at the specified index.
     *
     * @param value the element to insert
     * @param index the index at which to insert the element
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    fun insert(value: T, index: Int)

    /**
     * Removes an element at the specified index.
     *
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    fun remove(index: Int)

}