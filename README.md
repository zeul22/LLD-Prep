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

