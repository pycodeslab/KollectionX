# KollectionX

A Kotlin library providing custom collection data structures with type-safe operations.

## Overview

KollectionX is a collection of custom data structure implementations built with Kotlin, designed to provide efficient and type-safe operations for various use cases.

## Features

- **LinkedList**: A singly linked list implementation with the following operations:
  - `append(value)` - Add elements to the end
  - `prepend(value)` - Add elements to the beginning
  - `insert(value, index)` - Insert at a specific position
  - `remove(index)` - Remove elements by index
  - `size` - Get the number of elements

## Requirements

- Kotlin 2.2.0 or higher
- JVM target

## Building the Project

### Build
```bash
./gradlew build
```

### Run Tests
```bash
./gradlew test
```

### Clean Build
```bash
./gradlew clean build
```

## Usage

```kotlin
import io.github.pycodeslab.kollectionx.list.LinkedList

// Create a new LinkedList
val list = LinkedList<Int>()

// Add elements
list.append(1)
list.append(2)
list.prepend(0)

// Insert at specific position
list.insert(42, 1)

// Remove element
list.remove(2)

// Get size
println(list.size) // Output: 3
```

## Project Structure

```
src/
├── main/kotlin/io/github/pycodeslab/kollectionx/
│   └── list/
│       ├── List.kt          # Generic list interface
│       ├── Node.kt          # Internal node class
│       └── LinkedList.kt    # LinkedList implementation
└── test/kotlin/
    └── LinkedListTest.kt    # Unit tests
```

## Testing

The project uses JUnit Platform for testing. All implementations are thoroughly tested with unit tests covering various scenarios and edge cases.

Run tests with:
```bash
./gradlew test
```

## Development Status

This library is in early development. More data structures and operations will be added in future releases.

## Contributing

Contributions are welcome! Please feel free to submit issues or pull requests.
