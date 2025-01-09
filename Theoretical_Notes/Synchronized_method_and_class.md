# **SYNCRONIZED METHOD AND CLASS**

<br>

### **Synchronized method**

+ If a method has been made syncronized, then that method can't be called by multiple threads, but can only be called by one/single thread.

+ Rather than making all methods synchronized, only selected methods or a block of method can be synchronized.

<br>

### **Synchronized class**

+ Class can't be made synchronized via synchronized keyword, but, if all the public methods are synchronized then that class will be known as "synchronized class".

+ The object of such class will also be synchronized.

+ Object of synchronized class can be used by only one thread at the time of multi-threading.

+ Object of un-synchronized class can be used by all threads at a time of multi-threading.
