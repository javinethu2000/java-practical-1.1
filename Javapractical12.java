

package com.mycompany.javapractical1;
 public class item {
    private int location;
    private String description;
    
    // Constructor
    public item(int location, String description) {
        this.location = location;
        this.description = description;
    }
    
    // Getter for location
    public int getLocation() 
    {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
    
    // Getter for description
    public String getDescription() {
        return description;
    }
    
    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
}
 
//Inside the class named moster
package com.mycompany.javapractical1;
public class moster extends item
{
    public moster(int location, String description) {
    super(location, description);
  }


/*PART 02
1. Which of these keywords is used to refer to member of base class from a sub class?
 	


Answer: b) super
2.The modifier which specifies that the member can only be accessed in its own class is  
   
 
 Answer: b) private	
3. Which of these is a mechanism for naming and visibility control of a class and its content?

 
Answer:  b) Packages

4.Which of the following is correct way of importing an entire package ‘pkg’?

            Answer:    d) Import pkg.*


5.Which of these method of class String is used to extract a single character from a String object?


Answer: c) charAt()

6.Which of these method of class String is used to obtain length of String object?

Answer: d) length()*/




/*

Answers:
1.Real-world objects contain attributes and behaviors.
2.A software object's state is stored in instance variables.
3.A software object's behavior is exposed through methods.
4.Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
5.A blueprint for a software object is called a class.
6.Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword. 
7. A collection of methods with no implementation is called an interface.
8.A namespace that organizes classes and interfaces by functionality is called a package.
The term API stands for Application Programming Interface.*/