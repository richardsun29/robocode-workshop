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

Robocode requires at least Java 5 (Java 1.5.0) or newer to run. If you don't already have Java, you can download it from [java.com/en/download](http://java.com/en/download).

Clone this repository (`git clone https://github.com/richardsun29/robocode-workshop.git`) or [download it as a zip file](https://github.com/richardsun29/robocode-workshop/archive/master.zip).

## Running Robocode

### Windows

Navigate to this repo's folder and run the `robocode.bat` file.

If that didn't work, open Command Prompt and run
```bat
cd path\to\robocode-workshop  &:: insert this repo's directory
.\robocode.bat
```

### Mac

Navigate to this repo's folder and run the `robocode.command` file.

If that didn't work, open Terminal and run
```bash
cd path/to/robocode-workshop/ # insert this repo's directory
./robocode.command
```

### Linux

Open a terminal and run
```bash
cd path/to/robocode-workshop/ # insert this repo's directory
./robocode.sh
```

---

If everything went well, a program with this icon <img src="robocode.ico" width="28"> should be running.

If Robocode did not run, we can help you get it set up during the workshop.
[This page](http://robowiki.net/wiki/Robocode/System_Requirements#Installation_and_configuration) has some troubleshooting information.

# Using Robocode


### Source Editor

This is where you can code and compile your robot.

Go to `Robot > Source Editor` or press `Ctrl-E` to open the Source Editor.

- In the Source Editor, go to `File > New > Robot` or press `Ctrl-N` to create a new robot.
- To compile your robot's code, save the .java file and go to `Compiler > Compile` or press `Ctrl-B`.

Refer to the [documentation](http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html) for descriptions of the available methods.

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

- Robocode homepage: [robocode.sourceforge.net](http://robocode.sourceforge.net). You can download the full version of Robocode here.

- [Robocode documentation](http://robocode.sourceforge.net/docs/robocode). Here are some of the most useful classes:
  - [AdvancedRobot](http://robocode.sourceforge.net/docs/robocode/robocode/AdvancedRobot.html)
  - [Robot](http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html)
  - [Rules](http://robocode.sourceforge.net/docs/robocode/robocode/Rules.html)

- Strategy guides:
	- [RoboWiki](http://robowiki.net)
	- [Some articles on Robocode strategy](http://www.ibm.com/developerworks/java/library/?contentarea_by=Java+technology&search_by=robocode)

- Robots created by other people:
  - [Robocode Repository](http://robocoderepository.com/Categories.jsp)
  - [RoboRumble Participants](http://robowiki.net/wiki/RoboRumble/Participants)


- [Machine Learning and Robocode](https://www.youtube.com/watch?v=Ru9W-9CxdQ8). A video showing how a Robocode robot evolved using machine learning.
- [Genetic Algorithm and Robocode](https://www.youtube.com/watch?v=Hp6bhARBGc4). A video showing how a Robocode robot evolved using a genetic algorithm.
