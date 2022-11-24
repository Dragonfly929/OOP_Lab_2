# Encapsulation

**Encapsulation** is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

* Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.
* As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a **combination of data-hiding and abstraction**.
* Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
* It is more defined with the setter and getter method.

## Drafting software application
The system I based my simulation on is **AutoCAD**
AutoCAD is a commercial computer-aided design (CAD) and drafting software application. Developed and marketed by Autodesk.

Starting from the simplest figure a point, created a `Point` class, representing a location in (x, y) coordinate space, specified in double precision, with it other figures can be created.
