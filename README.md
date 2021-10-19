# tournament

Castle lord Owen Todtstelzer is again organizing a knight tournament at Hochgradnix Castle this year.

His relatives, spectators, jugglers, knights and squires come and a few celebrities are always with them. The lord of the castle has always noted the participants in the knight tournament on paper in recent years. But that becomes too cumbersome for him and that's why he wants a software solution for it.

First, based on the following description, consider which objects exist, what kind of relationships between the objects are and create a class diagram (and then implement the corresponding classes).

A list of participants should manage the participants in the knight tournament. Participants are initially the knights and in the future maybe also the orcs. The knights usually have squires, but there are always a few poor fighters who cannot afford any and therefore travel alone. So squires are optional. The knights also choose a weapon to fight with at the beginning of the tournament. In addition to a lance, sword or club, there are also others to choose from. This is important for Owen, because he can't have a knight with a lance fight one with a sword. So he needs the ability to filter the fighters for a certain type of weapon.

General requirements for the program:

- The data input (i.e. the data input form at check-in) as well as the output of a list of participants (list of all participants, all with weapon types) should be done graphically.

- Implement the corresponding objects and method calls in order to be able to test the behavior in a meaningful way using unit tests.
