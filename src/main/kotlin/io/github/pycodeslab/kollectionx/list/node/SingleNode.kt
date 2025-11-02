package io.github.pycodeslab.kollectionx.list.node

data class SingleNode<T>(
    val value: T,
    var next: SingleNode<T>? = null
): Node
