# Robocode Workshop

# Contents
- [Getting Started](#getting-started)
  - Setup
  - Running Robocode
- [Using Robocode](#using-robocode)
  - Source Editor
  - Battle
- [Further Resources](#further-resources)


# Getting Started

## Setup

Robocode requires at least Java 5 (Java 1.5.0) or newer to run. If you don't already have Java, you can download it from [java.com](http://java.com).

Download Robocode [here](http://sourceforge.net/projects/robocode).

Install Robocode by running this .jar file. If you can't run it by clicking on the file's icon, open Command Prompt or a terminal and run
```
java -jar robocode-1.9.2.4-setup.jar
```

## Running Robocode

### Windows

Run Robocode from the Start Menu. 

If there is no Start Menu shortcut, navigate to where you installed Robocode (`C:\robocode` by default) and run the `robocode.bat` file.

### Mac OSX

> **TODO: ask Carter to confirm/edit**

Open a terminal and run
```bash
cd ~/robocode/ # directory where you installed Robocode (~/robocode/ by default)
./robocode.sh
```

### Linux

Open a terminal and run
```bash
cd ~/robocode/ # directory where you installed Robocode (~/robocode/ by default)
./robocode.sh
```

---

If everything went well, a program with this icon <img src="robocode.ico" style="height: 2em"> should be running.

If you couldn't get Robocode to run, [this page](http://robowiki.net/wiki/Robocode/System_Requirements#Installation_and_configuration) has some troubleshooting information, or we can try to help you get it set up during the workshop.

# Using Robocode

We will walk through this part during the workshop, but if you want to play around:

### Source Editor

This is where you can code and compile your robot.

Go to `Robot > Source Editor` or press `Ctrl-E` to open the Source Editor.

- In the Source Editor, go to `File > New > Robot` or press `Ctrl-N` to create a new robot.
- To compile your robot's code, save the .java file and go to `Compiler > Compile` or press `Ctrl-B`.

Refer to the [documentation](http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html) for a description of the available methods.

### Battle

This is where you can pit your robot against other ones to test it.

From the main Robocode window, go to `Battle > New` or press `Ctrl-N` to open the New Battle menu.

- In the `Robots` tab, you can choose which robots to be in the battle.

- In the `Rules` tab, you can customize rules, including number of rounds, gun cooling rate, and battlefield size.

Click `Start Battle` to begin the battle.

- Control the battle's speed with the controls at the bottom of the window.

- View the debug logs (program output) by clicking on the robot names on the right side of the window.

# Further Resources

Here are some helpful resources if you would like to continue playing with Robocode.

- Robocode homepage: [http://robocode.sourceforge.net](http://robocode.sourceforge.net)
- [Robocode documentation](http://robocode.sourceforge.net/docs/robocode). Here are some of the most useful classes:
  - [Robot](http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html). The class of robot we used today.
  - [AdvancedRobot](http://robocode.sourceforge.net/docs/robocode/robocode/AdvancedRobot.html). This type of robot has a more complex interface that allows for more control over the robot.
  - [Rules](http://robocode.sourceforge.net/docs/robocode/robocode/Rules.html). Various game constants and utility functions.
- [Robots created by other people](http://robowiki.net/wiki/RoboRumble/Participants)
- [Some articles on Robocode strategy](http://www.ibm.com/developerworks/java/library/?contentarea_by=Java+technology&search_by=robocode)
- [Walkthrough](http://robowiki.net/wiki/Robocode/Eclipse) to use [Eclipse](http://www.eclipse.org) as an IDE for Robocode.
- [Genetic Algorithm and Robocode](https://www.youtube.com/watch?v=Hp6bhARBGc4). A video showing how a Robocode robot evolved using a genetic algorithm.
