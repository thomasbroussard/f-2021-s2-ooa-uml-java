# Goal of the exercise
Read a csv file from java, and deserialize its data as a list of Java instances

# Tasks
1. Use the `java.io.File` class to create an instance of `java.io.File` that points on the file you want to load
2. check if the file exists before going on
3. Use a java.util.Scanner instance to read the content of this file (`File#exists()`)
4. Use a while loop to read all the lines of the file using the scanner instance (`Scanner#hasNext()` to test if the scanner has remaining lines to read)
5. For each of the lines read, use the String#split() function to split on the "," (comma) delimiter, the result is a `String[]`
6. Design a java model class (datamodel) to map the `String[]` to an instance of this model class.
7. Create a list before the `while` loop, and for each deserialized instance, add it to the list
8. display the created list