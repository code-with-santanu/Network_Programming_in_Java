### Java NIO packages

<p>
    So, there are `three` key concepts used in Java NIO package.

    1. channel
    2. Buffer
    3. Selector

</p>

- The `channel` represents a stream of data between applications.

- The `buffer` works with a channel to process data.

- The `selector` is the technology that allows a single thread to handle multiple channels.The `selector` is useful in supporting the application scalability

### Buffer

<p>
A channel and buffer are typically associated with each other.Data may be transferred from a channel to a buffer or buffer to a channel.

The buffer, as its name implies, is temporary repository for information.

</p>
