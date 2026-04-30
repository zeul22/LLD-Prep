## What is LLD?

Consider Sorting or Searching an isolated problem and when you build an application on top of these isolated problem then that is LLD.

In more layman language, multiple DSA concepts used 

### Example:
Lets say that there are two devs one who knows DSA concepts very well and another one who knows
DSA + LLD. They both are asked to develop an Uber type app and now they have to find the problem statements 
First Dev (who knows DSA, master at it):
The man that knows DSA will tackle the algorithms and questions like assigning the riders to the users or how to find the shortest path from source to destination but he might fail to find the relationships b/w objects, how to describe entities, data security, push-up notifcations, synchronization, payment gateway integrations, and how it also handles the millions of users. These are the problems which are not stated and defined by the first dev.

Now the second Dev:
Rather than DSA which is the very core, he tries to go and create a structure/skeleton. He decides the objects like :
1. User
2. Rider
3. Location
4. Payment 

and then he finds the relation b/w these objects. afterwards he also think about data security, for instance the riders & users information so after the route is complete, the numbers of both should not be revealed along with sustaining the same for millions of users. 

All these when are done, then he moves forward to what First dev. I hope now what LLD is and how it is distinguished by DSA. 

## LLD focuses on different things:
1. Scalability : (Can your thing handle x users?)
2. Maintainibility (Can your code be maintained:not break even after adding new features? Also is it easy debuggable?)
3. Re-usability: (Can you plug & play? also it shouldnt be tightly-coupled!)

## Some fancy terms:
Tightly-coupled: means your one part must not fixated to your specific project. For instance your payment/notifcation integration must not be fixated with the specific project. or say Assiging Rider Y to user X must not be fixated as it can be used Restaurant Z to Rider Y as well. So It shouldn't be "Tighly-coupled"

## What is not LLD?

HLD focusses on the tech-stack while LLD focusses on the implementation. for instance, your application might contain SQL/NO-SQL as DB, or you node/Java as the backend, or the servers and how you scale it comes under HLD. Cost optimization is another thing that HLD emphasize on. There are lots of things that HLD handles, in layman language, you develop architectural structure, You draw design/ layout where in LLD you design class-level designs (OOPS!)

### HLD vs LLD vs DSA
1. HLD describes the architectural design
2. LLD describes the code structure
3. DSA is a tool used by LLD

## DSA is the brain of the application, LLD is the skeleton, HLD is the outer skin !

## OOPS (Object Oriented Programming)

Before we even start with OOPS, what was the reason to introduce OOPS? 

A. Machine Language: 0100011 0001100 
1. Tediuos AF!
2. Prone to Errors
3. Not Scalable


B. Assembly Language [MOV A, 61H (Move 61H to A)]:
1. Tighlt coupled
2. Not Scalable
3. Prone to Error

C. Procedural Language:
1. Introduced Functions, Loops, Blocks, Switch Statements, Condtional Statements
2. Could not solve complex problems
3. Cookbook type of shit, do this, then do this, then do that type of thing!

D. OOPS 
1. Real World Modelling which was not present in the previous type of languages. Real world instance/objects.
2. Data Security 
3. Highly scalable and reusable applications


in OOPS, Objects Interacts!

Object's characters:
1. engine
2. tyres
3. Model

Object's behaviours:
1. accelerate
2. brake


```
// How OOPS 
Class Car {
    string model
    string wheel
    string engine

    bool isEngineOn;

    Car(string model,string wheel, string engine){ // Constructor
        this.model=model;
        this.wheel=wheel;
        this.engine=engine
    }
    Car(){ // Constructor Overloading

    }


    engineOn(){
        this.isEngineOn=true;
    }

}

class Owner {
    Car car;

    Owner (Car car){
        this.car=new car();
    }

    drive(){
        if(this.car.engineOn){
            this.car.accelerate();
        }
        else{
            this.car.engineOn=true; //getter-setters needs to be done

        }
    }


}

const myCar=new Car(model,wheel,engine);
const owner1=new Owner(myCar);

```

Whenever you see a code, always see it as objects interacting with each other!

Pillar of OOPS:
# 1. Abstraction

for a car to start, you dont have to know how engine works, how gearbox works! thats abstraction!

for the TV as well, you dont know the wirings, you dont how click of one button makes you change the channgels, you just do! 


ohh nice!

class SportsCar: public car {} // how extends is done in cpp


# 2. Encapsulation

People, also me, get it confused b/w Encapsulation & Abstraction. 
Encapulation is a like a capsule, which means it has characters and behaviours, all in one, inside on box!

// variables -> characters
// methods -> behaviours

Encapsulation adds one further point which is about "Data Security"

Abstraction is responsible for Data hiding (you may or may not see it, doesn't matter) but Encapsulation is responsible for Data security.

For instance, Car odometer is an example of encapsulation, you cannot change it, Data security. Car's signal, you cannot change/alter it. Again. Data Security. 


What to do so outsiders cant access its characters. This can be done via "Access Modifiers"

Types of Access Modifiers:
1. Public : can be accessed by the outsiders
2. Private : cant be accessed by the outsiders (can be done only by getter-setters)
3. Protected : you can only accessed if it comes out of it or is of the same family (Inheritance)



# 3. Inheritance 
(Parent-Child Relationship)

```

class Car{
    protected  String model="default";
    protected  String brand="default";
    protected  String engine="default";

    Car(String model,String brand,String engine){
        this.model=model;
        this.engine=engine;
        this.brand=brand;
    }
    Car(){

    }
}

class Automatic extends Car{
    Automatic(){
        super();
    }
    Automatic(String model,String engine, String brand){
        super(model,brand,engine);
    }
}

class Manual extends Car{
    Manual(){
        super();
    }
    Manual(String model,String engine, String brand){
        super(model,brand,engine);
    }
}
```

mostly whenever you inherit, you will "publicly" inherit at most cases. 



# 4. Polymorphism

I dont always remember the polymorphism, need to understand this very well!
To make it simply understand, consider tiger, human, duck which extends from animal class but
how the run() behaviour works across these 3 different animal extended class. 
1. Same behaviour changes across classes (overriding)
2. Now consider there's lion behind a human, so the run behaviour might change to a normal situation so run behaviour changes in the same class. (overloading)

There are 2 types:
1. Static Polymorphism (This is scenario 2, which comes under method overloading)
2. Dynamic Polymorphism (This is scenario 1, which comes under method overriding)

# UML Diagrams
It is divided into two:
1. Structural: (Static) gives a static picture of how the application will look like
2. Behavioural: (Dynamic) gives the idea of how the appilcation, how its object will interact with each other

there are 7 in each of em (total 14 UML diagrams) but practically, we are needed to do only 2 while others are very usecase specific!  

In Strucutral, we need to do class diagrams (99% LLD ,this will be asked)
In Behavioural, Sequence Diagrams (does not ask muchh but helps in understanding and solving the questions rapidly)

# Class Strucutral UML Diagram
1. Class Structure
2. Association/Connection

## Class Structural UML

For showing Access Modifiers in Class Structural UML Diagram
Public -> +
Protected -> #
Private -> -

2 types of class:
1. Abstract class -> <<abstract>>
2. Concrete class -> nothing to write on the top of Class box


## Association
2 Types of Association:

### Simple, Aggregate

Composition is "has a relationship" while Inheritence "is a relationship"


# Sequence Behavioural UML Diagram
It isnt asked much but useful at specific usecase!

UML diagrams needed to be studied once more, lets see if its really needed

# SOLID (Single Resposibility, Open-Close, Liskov, Interface Segregation, Dependency Inversion)
S: Single Responsibility Pattern (SRP)
O: Open-Close Pattern (OCP)
L: Liskov's Substituition Pattern (LSP)
I: Interface Segregation Pattern (ISP)
D: Dependency Inversion Pattern (DIP)

## SRP
One class should only be responsible for handling only one responsibility (do one behaviour only!) and only one reason to change

## OCP
A class should be open for extension but close for modification. You cant modify the already existing for enabling a new feature. To do this you can use Abstraction, Inheritance & Polymorphism to come up with the class enabling the new feature!

Whenever you bring new feature, its better to say that you introduce abstraction and then bring inheritance or one that implements the interface afterwards which you use Polymorphism (overriding) to create unique functions

## LSP
Subclasses should be substitutable for their base classes ( Means you can use the subclass over the base class and still kill!)

# Patterns in LLD (Top 13 are most important)

1. Strategy Pattern
2. Factory Pattern
3. Observer Pattern
4. State Pattern
5. Singleton Pattern 
6. Builder Pattern
7. Decorator Pattern
8. Chain of Responsibility Pattern
9. Repository Pattern
10. Composite Pattern
11. Adapter Pattern
12. Facade Pattern 



# Q/A

1. Why the Operator Overloaing is Cpp but not in any other languages?
2. Create a UML Diagram for Car, Electric Car & Manual Car. 






