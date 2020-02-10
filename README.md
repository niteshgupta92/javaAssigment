"# java-AEM Assigment"

Approach 

						Animal(Interface)
								|
			Frog Bird Cat Dog Dolphins Butterfly(implementing Animal)	Fish(Extending Animal)	
			 		 |																|
	Chicken Rooster Parrot Duck 									ClownFish		Shark 	 
Model A (Package Name -- com.model.a1, com.model.a2.a3, com.model.a4)
Q1 Can you implement the sing() method for the bird?
Ans Sing method is not present in Bird Class, Creating an Animal interface with sing, fly, swim and walk method.

Q2 we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound
Ans a2a3 Bird class Implement the Animal Interface and implements the methods.

Q3 how would you model a rooster
Ans a2a3 Rooster class extends the bird class with own implementation of fly walk methods.

Q4 Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
Ans a4 Parrot extends Bird class with variation of parrot sing method based on the Animal type.

Model B (Package Name -- com.model.b1, com.model.b2.b3)
--> Model fish as well as other swimming animals
   Fish interface extends Animal interface with specification method for fish.
   Shark and Clownfish implements Fish interface and implementing the methods.
   
Model D(Package Name -- com.model.d1.d2)
-- >Model animals that change their behavior over time
	Butterfly class implements Animal interface 
	
Model E. Counting animals
-- > Package Name com.model.e1

Second Language
--> com.model.second.lang
	