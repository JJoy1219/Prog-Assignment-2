# Prog-Assignment-2
To compile problem 1, type "javac MinotaurMaze.java" into the terminal to compile the problem. Then type "java MinotaurMaze" to run the program.
My program designates the first person selected to be the "counter", or the person who will keep an account of the people who have been in the maze.
After this, each randomely chosen guest enters the maze and eats the cake at the end of the maze if there is a cake present AND if this is their first time finding the cake. If the cake is not present, the guest does nothing.
Whenever the counter goes through the maze, he will ask for a cake if there is no cake present but will not eat the cake and add one to his counter.
When the counter has reached the number of guests, he can tell the Minotaur that all the guests have been through the maze at least once.
This solution won't have any syncronization issues because the guest only eats the cake if it is their first time encountering the cake.
The program is efficient because it does not implement any locks, which would be more time consuming.

To complile problem 2, type "javac MinotaurVase.java" into the terminal to compile the problem. Then type "java MinotaurVase" to run the program.
The guests should choose option 3 because it would allow the guests to explore the castle and also know when they are able to visit the vase room because they would be told by the previous person.
The advantage of option 1 is that guests have the option to explore the castle, disadvantage is that there could be a huge crowd of guests trying to get into the vase room and wasting their time.
The advantage of option 2 is that guests are free to roam the castle and enter the vase room if its marked as available, disadvantage is that there could be times when the vase room is empty and time would be wasted.
The advantage of option 3 is that guests are free to roam the castle and will know immediately if the vase room is available for their visit, disadvantage is that time would have to be set aside to compile the queue of guests ahead of time.
I implemented option 2 and did it in a manner that would not cause any synchronization issues because the vase room is set to unavailable as soon as the guest enters in an atomic operation.
My program did not implement any locks because it was unnecessary to ensure mutual exclusion.
