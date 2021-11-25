## OOP Laboratory Work 8

#### TO DO:
**Basic Level** (mark 5 || 6):
1. Implement the following class hierarchy and define as explained the objects:

2. Base Class GeometricBody with the following abstract methods - `getSurface()`, `getVolume()` which should return the surface and the volume of some figure.

3. Implement the following child classes of `GeometricBody` - Cub, Sphere, Parallelepiped. (Each one is forced to implement the `getSurface` and `getVolume` methods).

In main: create by an object of each type of GeometricBody and put all of them in an array of `GeometricBody`'s.

**Medium Level** (mark 7 || 8):
4. Create a class `GeometricBodyController` which has a method which gets as parameter a list of GeometricBody's and return the one with the biggest Volume.

5. Create another method which does the same but that gives the body with the biggest Surface.

6. In main call the method from this `GeometricBodyController` and give as parameter the list of bodies created in task1 and print the result in console.

**Advanced Level** (mark 9 || 10):

7. Change the abstract class `GeometricBody` to an interface and resolve any errors if occurred.

