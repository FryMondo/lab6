# Lab6 Repository
## Виконав
- Студент групи ІА-22
- Птачик Роман
- Варіант: 15 (С2 = 1, C3 = 0)
## How to launch project
### Clone the repository:
```
git clone https://github.com/FryMondo/lab6.git
```
### Running project
If you use IDE, open project and run ***Main.java***
### Running project via console
Move to the directory
```
lab6/src
```
Run next commands
```
javac *.java
java Main
```
## Project Structure
### ApplianceManager.java
Executes the main code of the program.
- Initializes a custom set of appliances using the CustomSet class.
- Adds predefined appliance objects (WashingMachine, Refrigerator, Microwave) to the set.
- Demonstrates adding a new appliance (Fan) and displays the contents of the set.
- Handles exceptions that might occur during execution.
### Appliance.java
Defines the abstract base class Appliance, representing a generic household appliance.
- Fields:
  - name: The name of the appliance.
  - power: Power consumption in watts.
  - isPluggedIn: Boolean indicating if the appliance is plugged in.
  - electromagneticRadiation: Radiation level in microteslas.
- Methods:
  - Getters for all fields.
  - plugIn and unplug methods to simulate the appliance being connected or disconnected from power.
  - toString: Formats the output information about the appliance in a readable format.
WashingMachine.java, Refrigerator.java, Microwave.java
Concrete subclasses of Appliance that represent specific types of appliances.
- Each class initializes an appliance with predefined values for name, power, and electromagnetic radiation.
CustomSet.java
Implements a generic collection class, CustomSet, which adheres to the Set interface.
- Features:
  - Internal structure: Uses an array with an initial capacity of 15, dynamically increasing capacity by 30% when full.
  - Constructors:
    - Default constructor initializes an empty set.
    - Constructor accepting a single object adds it to the set.
    - Constructor accepting a collection adds all elements to the set.
  - Implements all Set interface methods, including:
    - add: Adds an element if it does not already exist.
    - remove: Removes an element if present.
    - contains: Checks if an element exists in the set.
    - iterator: Provides an iterator over the set elements.
  - Ensures capacity dynamically grows as needed.
