package io.github.pycodeslab.kollectionx.list

import io.github.pycodeslab.kollectionx.list.node.Node

/**
 * A generic list interface that defines basic list operations.
 *
 * @param I the type of elements in this list
 */
interface List<I, O : Node> {
    /**
     * Returns the number of elements in the list.
     */
    val size: Int


    /**
     * Appends an element to the end of the list.
     *
     * @param value the element to append
     */
    fun append(value: I): O

    /**
     * Prepends an element to the beginning of the list.
     *
     * @param value the element to prepend
     */
    fun prepend(value: I): O

    /**
     * Inserts an element at the specified index.
     *
     * @param value the element to insert
     * @param index the index at which to insert the element
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    fun insert(value: I, index: Int): O

    /**
     * Removes an element at the specified index.
     *
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    fun remove(index: Int): O?

}