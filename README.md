# Project 2: Data Structures and Algorithms

## Introduction

This project is pretty different from the first one. There won't be any skeleton code, or even a specific task you need to do. Instead, we'll turn it over to you to explore how the concepts we learned in class can be applied to real-world applications! Hopefully, working on this project will give you a glimpse into what it's like to be a software engineer, not to mention something cool to call your own!

You will get 2 weeks to work on the project, but you don't need to finish the entire project to get full credit (i.e. feel free to propose an app that you want to work on for a month, then only finish a couple features to present).

Here are a few ideas to get you inspired:
 - Create a text-based RPG (this is actually what I made for my very first Java project!)
 - Make a Java backend for a web app (like what you did for Megamaze), and maybe even the frontend too if you want
 - Create a game with [Litiengine](https://litiengine.com/), [Unity](https://unity.com/), or another game engine
 - Make an Android (or iOS) app
 - Make a mod for Minecraft 
 - Make some custom terminal utilities
 - Do some graphical design or data visualization with [Processing](https://processing.org/)

A good number of the ideas above require learning about frameworks, API's, or even entirely new languages! Doing so is not required at all, but we encourage you to try picking up something new that you haven't done before, as a huge part of software engineering is the ability to quickly adapt to new situations and use unfamiliar tools.

## General Requirements

Although we very much encourage you to get creative with your project, there will be a few guidelines we'd like you to follow to make sure your work is related to what we've done in class. You are welcome to propose ideas that don't exactly align with the requirements if they are still related in some other way, but please talk to us about it before proceeding!

Here are the guidelines:
 - **Data Structures:** You'll need to incorporate at least **three** of the abstract data structures we learned into your project in some way. (Heaps, priority queues, stacks, graphs, trees, tries, linked lists, HashMaps, etc. are all good examples.) These data structures should be used in an effective manner: for example, don't use a heap to store data best suited for a list just because you want to hit the requirement.
 - **Algorithms:** Your project must include one of the following types of algorithms: **tree/graph traversals** (BFS/DFS/Topological Sort), **shortest paths** (Dijkstra's/A*), and/or **minimum spanning trees** (Prim's, Kruskal's).
 - **Sorting:** Your project must involve sorting data in some form (for displaying, running through a custom algorithm, etc). Sorts needed to run the algorithms listed in the previous bullet point do not count (simply running Kruskal's Algorithm won't do; you'll need to explicitly run a sort somewhere). You can use whatever sorting algorithm you wish to do this.
 - **Language:** Although we encourage the use of Java for all or part of your project, you are welcome to use other languages as you see fit. (For example, making a game in Unity will require C#.) If you choose to use languages other than Java, we will do our best to support you but can't make any guarantees of being able to do so.
 - **Git:** Even if you aren't working with a partner, we will expect to see descriptive commit messages and Git features like branches or forks to keep your code organized. This is good practice regardless of what you're making, so it's good to get in the habit now!
 - **Testing:** Since there will be no staff autograder, you'll need to make your own tests to make sure things are working as intended! We'd like to see at least **one unit test** and **one integration test**, where the unit test assesses a single utility function (something like `CalculateDistance` or `CreateGraph`) and the integration test assesses behavior of a larger feature or even the entire project (something like creating a new `Dog` object, running `Dog.walk()` and `Dog.run()`, then checking the position of the dog). If you choose to use a language other than Java, you might need to figure out how to use a different testing framework, but the same principles should apply.
 - **Special Sauce:** Try something weird, crazy, creative, extravagant, or unique! This is something that you don't need to think of explicitly (although you can if you want); as long as you're having fun, it will happen! I know this is a vague requirement, but basically we don't want you to simply copy paste code from class. As long as it's something new that we haven't discussed, it'll do, even if it isn't related to coding or data structures whatsoever. Here are some examples, but don't feel constrained by them:
    - Make some custom sound effects and figure out how to play them using code
    - Put [easter eggs](https://en.wikipedia.org/wiki/Easter_egg_(media)) in your project for us to find
    - VR? AR? Arduino? Raspberry Pi? (Have your project interact with the outside world somehow?)
 - **Size of project:** You are welcome to make your project as big or small as possible. If you're thinking about turning this into a longer term project, it's totally OK not to finish all parts of what you're planning on making, as long as the completed part meets all of the requirements!


## Getting Started

In order to allow us (the instructors) to check in periodically and provide feedback on your code, please [make a project repository on Github Classroom](https://classroom.github.com/g/VhLtlPO3) and commit your work to this repository. From here, you are welcome to do whatever you'd like in the repository!

## Part 1: Create a Project Proposal

First, you'll have to figure out what you want to make in the first place! Ideation is an important part of the process, so we hope making this proposal will help you formalize your thoughts and form a game plan for how you'll go by actually coding your project.

As a minimum requirement, we'd like you to answer the following questions in some way, but outside of these you can also include whatever you think will be helpful as preparation.
1. What is your project's name? (You might want to come back to this at the end)
2. In 2-3 sentences, how would you describe your project to someone who doesn't know how to code?
3. How will your project address each of the requirements? (If you don't know what your special sauce is yet, you can skip it for now, but think of some ideas!)
4. What are some aspects of the project that you don’t yet know how to do and need to figure out? (how to use external libraries, etc.)
5. If you're in a group, come up with a plan for who will implement what parts of the project (or if you will be pair programming). 
6. If you were to continue developing this project in the future, what might you improve or add?

This proposal can be done in whatever format you want (Q&A, paragraphs, Markdown file, Google Docs, slideshow, TikTok, interpretive dance...), as long as it's something you can share with us. After proposals are due, we'll meet with your group individually during class to go over it, provide feedback, and give you a chance to ask about the things you might not know how to do yet.

It might also be helpful to have one or two informal backup proposals in the back of your mind as well, just in case your main one doesn't work out for some reason.

## Part 2: Make Cool Things

After we've met and approved your proposal, you're ready to get started implementing your plan! This part is pretty straightforward, but I'll give a few tips to hopefully make the process smoother:
1. **Finish the stuff you know how to do well first!** This will help you create a solid foundation that you can build upon later to add more experimental features that may or may not end up working.
2. **When in doubt, use Google, StackOverflow, and GitHub Issues!** Chances are, if you're running to a problem, some else had a similar one and figured out how to solve it. If you're having trouble finding what you want, we are also here (on Piazza, via email, during office hours, etc.) to help!
3. **Don't be afraid to stray away from your original proposal.** There might be some things you thought were easy to do when coming up with the idea, but is actually impossible to do after trying to implement it. It's normal to constantly evolve your plan as you go through it.
4. **This isn't a competition.** Everyone has their own strengths, and just because someone else made something bigger, faster, or shinier than yours doesn't make it "better". As long as what you're doing makes you happy, I'm sure it will be great! (And since we aren't all doing the same thing, feel free to ask others about their projects and how they made them so you can draw inspiration from each other!)

**To emphasize another time, you do NOT have to finish your project to get full credit!!** Coding new things almost always takes far longer than originally anticipated, so it's expected that you might not be able to 100% complete everything you set out to accomplish. As an example of a perfectly acceptable situation to be in, you might have thought about making a web app and made all of the utilities to return the data you need, but couldn't quite figure out how to get it to show up on a webpage. Just do your best, have fun, and if you need any help along the way we'll be here for you!

## Part 3: Present your Project

We are super curious to see what awesome things you made!! During the last class session, we'll set aside some time for you to show off your project. This presentation will be extremely informal, and just like the project proposal you can present it however you'd like (make a slide deck, share your screen for a demo, record a video, sing a song, or just talk).

Just to have a some more guidelines though, here's a few details:
 - Aim to have 4-5 minutes worth of content to share.
 - We'll have some time for Q&A after your presentation, so expect some questions about how you did certain things, your favorite part of your project, etc.
 - A good place to start is with your project proposal: tell us what you made, how you made it, how your data structures fit in, etc.
 - We encourage you to include a llama somewhere in your presentation for no particular reason at all.
<img src="https://user-images.githubusercontent.com/15005763/122516948-41d5c380-cfc4-11eb-8eb5-608f73fd5b87.png" width=400 />

## What's Next?
We hope you enjoyed working on your project, and this class as a whole! We're excited to see where you'll take it next if you decide to keep working on it. 

Although we don't have any plans to delete any GitHub repositories from this organization (atdp-dse), it's possible that they might be taken down sometime in the future. You should create a new repository on your personal GitHub account and upload your project files there to keep it safe after you're done. (You might also want to do this for the rest of the work you've done for this class!)

We also encourage you to make your project repository public after you've done this. That way, you'll be contributing to the open source community, and others can freely try out your project and make contributions. (Plus, if you want to look for a job or internship in the future, it's something to stick on your resume!)

Thank you for all of your amazing work this summer :)
