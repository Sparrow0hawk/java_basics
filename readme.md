# Basic java code

First few attempts at doing java along with compiled code.

## Basic java housekeeping

Let's check we've got java installed.

```{bash}
$ java --version 
```

And java compiler.
```{bash}
$ javac --version
```

Should return details about local installation of java and java compiler

## Producing a compiled java file

In your favourite text editor write this file and save as hello_world.java.

```{java}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```

We then compile this file into a java class file that can be executed by the java virtual machine.

```{bash}
$ javac hello_world.java
```

This .class file can now be run:

```{bash}
$ javac hello_world.java
Hello, World
```
