# Methods
Our code doesn't all have to sit in the main() function. We can divide it up into methods.

A function is an individual and executable block of code, while a method is a function that
is contained in a class, that "belongs" to that class. For our purposes, however, these two terms
are synonymous. All functions you see in Java will be methods, as all code written in Java must be 
encapsulated within a class.

The general form of a function is as follows:
```
access-modifier return-type methodName(ArgumentType argument1, ArgumentType argument2, ...) {
	...
	// code block
	...
}
```
where *access-modifier* refers to the accessibility of the method in other parts of the code, *return-type* 
is the type of object returned when the function finishes, and uses the keyword *void* if the function does 
not return a value, and the *methodName*, which can be whatever you want to name the method, but should be 
concise and telling of what the method does. A function can have an arbitrary number of arguments, of arbitrary 
type. The function does not have to take arguments, however.

The options for *access-modifier* and the different kinds of encapsulation given by each are best explained 
by this chart:

| access-modifier | Visible in Class | Visible in Subclass | Visible in Package | Visible Outside of Package |
|-----------------|------------------|---------------------|--------------------|----------------------------|
| public          |     ✓            |     ✓               |     ✓              |     ✓                      |
| (none, default) |     ✓            |     ✓               |     ✓              |                            |
| protected       |     ✓            |     ✓               |                    |                            |
| private         |     ✓            |                     |                    |                            |

Depending on the level of access you want for a portion of your code, you'll use a different *access-modifier*.

The simplest method you could write would be
```
void nothing() {
	// no code to execute
}
```
where the function has a default *access-modifier*, returns nothing, takes no arguments, and executes no code.
Any class or method in the same package as the class that contains this method could run it, though it still
would do and return nothing.

The final modifier you may add to a method, or any other class member, is the *static* modifier. This associates
the method with the class itself, not the object, so you may call the method by referencing the class instead of
having to instantiate the object first. For the class *Object*, you would call the static method *method()* 
using the format:
```
Object.method();
```
where *Object* is referring to the class itself, not an instantiated object. Static methods and objects are used
less commonly than non-static methods and objects, but whether you use static or non-static methods really depends 
on the context of your program.

To call a method, you must first be in a context from where it is legal to call the method. For example, you
must be within the method's encapsulating class in order to call a private method. Second, you must write the
method's name out and call it with the necessary paramaters, such as:
```
printOut(myString);
```
If you are in a class different than the class containing the non-static method, you will have to create an object 
of class type in order to access the method, as below.
```
Object variableName = new Object();
variableName.printOut(myString);
```

The key takeaway from this repository is that programs, in the real world, are broken down into small executable
blocks called methods. To write a method, which must specify an *access-modifier*, a *return-type*, a function name,
and any arguments the function might take. If the function does not return a value, you have to explicitly state
that with the keyword *void*, and if the function is associated with the class, not the object, you must specify that
it is static with the keyword *static*. The key to writing good code is writing good method names, so get in the habit 
of summarizing your code in just a few words.
