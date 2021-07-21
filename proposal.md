# Project Proposal: Conway's Game of Life

The Game of Life is a never ending zero player game where the end result is solely dependent on its initial state.
It is made up of cells that are in 2 states, live or dead. After the user sets the initial configuration, the state of the game is determined by a set of 3 rules.
1. Any live cell with two or three live neighbours survives.
2. Any dead cell with three live neighbours becomes a live cell.
3. All other live cells die in the next generation and all other dead cells stay dead.

The user will be able to make their own configuration, as well as chose from a list of prebuilt configurations.
Time permitting, users will be able to save/load game states/configurations.

Data Structures:  
    Linked List- to store configs  
    Priority Queue- to order most frequently used configs  
    Binary Search Tree- to search preloaded configs  
Algorithm: Tree Traversal (such as postorder traversal), will be used as part of search  
Sorting: configs can also be sorted alphabetically using quick sort  
Language: Java, using git  
Unit Test: Can test config search  
Integration Test: Can test config loading  
Special sauce: Easter eggs when certain configurations are made  

I have figured out the GUI (will be using JavaFx), not exactly sure how saving/loading will work