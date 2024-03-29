## OOP Laboratory Work 5

#### TO DO:

**Basic Level** (mark 5 || 6):
1. Create 10 classes with their names as first 10 alphabetical letters (A, B, C, D, ... , J).
       Each next class inherits from previous letter class (ex: `B inherits from A, C inherits from B ...`).

2. Each class should have their own String property with corresponding letter as their reference (ex: `class A -> public String a; class B -> String b; ...; class J - public String j;`).

3. Create by an object of each class type and print it in console in a clever way (so that all objects states are showed).

**Medium Level** (mark 7 || 8):
4. Change all states from previous classes from public access specifiers to protected.

5. Create class X which has a private String name property that should have also a constructor for that X.

6. Add an instance variable of X type to A class as a state and modify the constructor of A from `A(new String("blabla"))` to `A(new String("blabla"), new X("some name"))`.
Checkout for errors if appeared in child classes and try to resolve the issue.
`hint: use super("blabla", x)`.

7. Finally, print J and see what states do it have.

**Advanced Level** (mark 9 || 10):
8. Add initial value to state X from class A. (ex: `protected X x = new X("xxx")`). Print a object of J and see the result.

9. Go in class D and create also a state with the same name `x` as in class A and give another initial value.  Print the result and checkout if any changes.

10. Now do the same in class H and add to a state x another initial value. Checkout again if any changes when printing object of class J.

11. Make the property `x` from class `H` private and checkout now if any errors appeared and try to solve them.
`hint: property x is not visible any more in child classes cause of private modifier in most near by hierarchy class containing this state.`

