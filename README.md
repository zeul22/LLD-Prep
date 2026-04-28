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
1. Abstraction

for a car to start, you dont have to know how engine works, how gearbox works! thats abstraction!

for the TV as well, you dont know the wirings, you dont how click of one button makes you change the channgels, you just do! 


ohh nice!

class SportsCar: public car {} // how extends is done in cpp


2. Encapsulation

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



3. Inheritance
4. Polymorphism


# Patterns in LLD (Top 13 are most important)

1. Strategy Pattern
2. Factory Pattern
3. Observer Pattern
4. State Pattern
5. Singleton Pattern 
6. Builder Pattern







