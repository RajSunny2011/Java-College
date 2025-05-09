# Wrapper Classes in Java

In Java, **wrapper classes** are used to convert primitive data types into objects. These classes are part of the `java.lang` package and provide a way to use primitive types with Java Collections and other features that require objects.

* * *

## What are Wrapper Classes?

Wrapper classes in Java allow us to convert primitive data types into objects and vice versa. Every primitive type in Java has a corresponding wrapper class.

Primitive Type

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| `boolean`      | `Boolean`     |
| `byte`         | `Byte`        |
| `char`         | `Character`   |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |

* * *

## Purpose of Wrapper Classes

-   **Object Representation**: Java collections (like `ArrayList`, `HashSet`) require objects, so you can't store primitive types directly in these collections.
    
-   **Utility Methods**: Wrapper classes provide methods for converting primitive types to strings and parsing them back into numbers, among other utility functions.
    

* * *

## Common Methods of Wrapper Classes

| Method                      | Description                                                                      |
| --------------------------- | -------------------------------------------------------------------------------- |
| `parse<Type>(String s)`     | Converts a string to the corresponding primitive type. Example: `parseInt`.      |
| `valueOf(<Type> x)`         | Returns a corresponding wrapper object. Example: `valueOf(5)` returns `Integer`. |
| `toString()`                | Converts the value of the object to a string.                                    |
| `compareTo(<Type> o)`       | Compares two wrapper objects. Returns a negative, zero, or positive value.       |
| `intValue()`, `longValue()` | Returns the primitive value of the wrapper object.                               |

* * *

## Example Usage

### Integer (Wrapper for `int`)

```java
Integer i = Integer.valueOf(10);
int primitiveInt = i.intValue();
System.out.println("Integer value: " + i);
System.out.println("Primitive int value: " + primitiveInt);
```

### Double (Wrapper for `double`)

```java
Double d = Double.valueOf(12.34);
double primitiveDouble = d.doubleValue();
System.out.println("Double value: " + d);
System.out.println("Primitive double value: " + primitiveDouble);
```

* * *

## Autoboxing and Unboxing

### **Autoboxing**:

Autoboxing is the automatic conversion of primitive types to their corresponding wrapper objects when required.

`Integer i = 10;  // Autoboxing: int to Integer`

### **Unboxing**:

Unboxing is the automatic conversion of wrapper objects to their corresponding primitive types.

`int x = i;  // Unboxing: Integer to int`

* * *

## Use Cases of Wrapper Classes

-   **Collections Framework**: You can use wrapper classes in `List`, `Set`, `Map`, and other collection classes, which only accept objects.
    
-   **Utilities**: Wrappers provide utility methods for parsing strings, comparing values, and handling null values gracefully.
    
-   **Reflection**: Wrappers are frequently used when working with reflection and generic types in Java.
    

* * *

## Conversion Between Wrapper and Primitive Types

### Convert from Wrapper to Primitive

```java
Integer integerObject = Integer.valueOf(100);
int primitiveInt = integerObject.intValue();
```

### Convert from Primitive to Wrapper

```java
int primitiveInt = 100;
Integer integerObject = Integer.valueOf(primitiveInt);
```

* * *

## Common Wrapper Classes Methods

| Wrapper Class | Common Methods                                                                |
| ------------- | ----------------------------------------------------------------------------- |
| `Boolean`     | `parseBoolean(String s)`, `toString()`, `booleanValue()`                      |
| `Character`   | `charValue()`, `toString()`, `isLetter(char ch)`, `isDigit(char ch)`          |
| `Integer`     | `parseInt(String s)`, `toString()`, `intValue()`, `compareTo(Integer i)`      |
| `Double`      | `parseDouble(String s)`, `toString()`, `doubleValue()`, `compareTo(Double d)` |
| `Long`        | `parseLong(String s)`, `toString()`, `longValue()`, `compareTo(Long l)`       |

* * *

## Performance Considerations

While wrapper classes are extremely useful, they can have a performance overhead compared to using primitive types due to the object creation and method calls involved.

-   **Autoboxing and Unboxing**: Although these operations are automatic, they can affect performance if used excessively in tight loops or large data structures.
    

* * *

For more details: [Wrapper Classes in Java](https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html).