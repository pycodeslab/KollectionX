package io.github.pycodeslab.kollectionx.list

internal data class Node<T>(
    val value: T,
    var next: Node<T>? = null
)
