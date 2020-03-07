# Queue Data Structure
A simple queue implementation in Java.

## Functions
#### `.isEmpty()`
```js
queue.isEmpty() // Returns true if there are no items in the queue, false otherwise.
```

#### `.isFull()`
```js
queue.isFull() // Returns true if there are items in the queue, false when the queue is empty.
```

#### `.size()`
```js
queue.size() // Returns the number of items in the queue.
```

#### `.front()`
```js
queue.font() // Returns the front item without removing it from the queue.
```

#### `.enqueue(item)`
```js
queue.enqueue(1) // Pushes new item to the end of the queue.
queue.enqueue('a')
```

#### `.dequeue()`
```js
queue.dequeue() // Removes and returns the item which is up for processing.
```