# SERIALIZATION

<br>

### **Serialization**

+ Converting object into byte stream is called serialization.

+ It is required when:
  + One wants to send the state of an object to the network. Or,
  + One wants to save the state of the object into the disk.

+ Must implement **java.io.Serializable** interface in the class (Object of this class will be converted into byte stream).
+ We can use **ObjectOutputStream** class to convert object into byte stream, known as "Serialization".
