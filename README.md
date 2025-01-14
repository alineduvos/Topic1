# Topic 1: Handling Data Through Streams

## Introduction 
In Java, streams make it easy to work with data by reading it from a source or writing it to a destination. Common sources, text files, csv files, json files, network location etc.

### 2 Main types of streams
- Input Stream - used to read data into our app
- Output Stream - used to write data to a destination for example some network location/csv file etc.

### How do we make a stream?
1. Create an object linked to a source (for input) or a destination (for ouput)
2. Use the object's methods to read or write data (IO operations)
3. Always close the stream when we are done. (Closing the stream is very important!) 

- The`java.io` package gives us the tools for handling data as bytes or characters. When working with object
- Java uses the Serializable interface (To make a class Serializable)

## Java I/O Class Hierarchy 
1. Base Classes
	- **InputStream** and **OutputStream** - handle byte-based input and output 
	- **Reader and Writer** -  handle character-based input and output 

2. Byte Streams - These classes work with raw binary data
	-  **FileInputStream** and **FileOutputStream** - we use these to read/write bytes from/to a file. E.g reading a binary file (like an image) or write a binary log file.
	- **BufferedInputStream** and **BufferedOutput** Stream - this basically is just another implementation which wraps FileInputStream or FileOutputStream. We can use this to read/write large files efficiently.
	- **DataInputStream** and **DataOutputStream** - allows reading/writing of primitive data types easier. 

3. **Character Stream**s - these classes work with text data
	- **FileReader** and **FileWriter** - used to read/write characters from /to a file. E.g . reading or write plain text files
	- **BufferedReader** and **BufferedWriter** - these wrap FileReader and FileWriter to improve performance. Also gives us features like line-by-line reading. E.g reading a large text file line by line.
	- **InputStreamReader** and **OutputStreamWriter** - converts byte streams to character streams. E.g reading data from a nework stream in UTF-8. or writing some bytes to a text file.

4. Object Streams 
	- **ObjectInputStream** and **ObjectOutputStream** - allows us to read/write java objects (it requires objects to implement Serializable interface)
5.  Miscellaneous	
	- **PrintStream** / **PrintWriter** - makes things easier for us by writing formatter data to text-based destinations. E.g writing logs or reports to a text file. 
 
 ## Summary
 
| Stream Class | Where To Use |
|--|--|
| FileInputStream / FileOutputStream | Reading/writing binary files (e.g., images |
| BufferedInputStream/ BufferedOutpuStream| Use when processing large binary files e.g. a large pdf file |
| FileReader/ FileWriter| Use when dealing with small text files |
| BufferedReader/ BufferedWriter| Use when want to read large text file line by line |
| ObjectInputStream/ ObjectOutputStream| Use when saving/loading serialized object |
| PrintStream/ PrintWriter| Use when writing logs or formatting text output |

 


## Byte Streams

Byte streams are used to handle raw binary data, for example reading / writing files containing things like images, audio, or text in binary format etc. 

- These work with integer values ranging from 0 to 255
- Byte streams are derived from **InputStream** and **OutputStream** (abstract classes) 
### Creating Byte Streams
1. **For Reading**
	- Use the **FileInputStream(String path)** - to read bytes from a file
	- Call read() to get to the next byte. (Checking if the read() method returns a -1, then that means end of file is reached


2. **For Writing** 
	- Use the **FileOutputStream(String path, boolen append)** - to write bytes to a file
	- If append = true, new data will be added to the file
	- Otherwise the file is overwritten
	- Call write(int b) to write a single byte. To write an array of bytes we can use write(byte[], offset, length).

# Serialization and Deserialization 
### What is Serialization? 
It is the process of converting a Java object into a byte stream so it can be saved to a file, or can be sent to a network, or stored in DB (as blob file too).
 
### What is Deserialization? 
The reverse process of converting a byte stream back into a java object. 
 
 ### Steps o Serialize and Deserialize 
 1. **Mark the class with Serializable** - a class must implement this interface to indicate it can be serialized. 
 2. **We can use the **ObjectOutputStream** to Serialize** - writes an object to an output stream (file) 
 3. **We can use the ObjectInputStream to Deserialize** - reads a serialized object from an input stream and basically reconstructs it. 
 
