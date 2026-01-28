The Observer Design Pattern provides a clean and flexible solution to the problem of broadcasting changes from one central object (the Subject) to many dependent objects (the Observers) — all while keeping them loosely coupled.

In our Fitness Tracker App, the Observer Pattern allows the FitnessData object to notify all registered modules (like LiveActivityDisplay, ProgressLogger, and GoalNotifier) automatically whenever new fitness data is received — without needing to know what those modules are or how they respond.

Class Diagram

1. Observer Interface (e.g., FitnessDataObserver)
   Declares an update() method.
   All modules that want to listen to fitness data changes will implement this interface.
   Each observer defines its own logic inside update() to respond to updates.

2. Subject Interface (e.g., FitnessDataSubject)
   Declares methods to:
    registerObserver() – subscribe to updates
    removeObserver() – unsubscribe from updates
    notifyObservers() – notify all current observers of a change
    The subject doesn't care who the observers are — it just sends updates.

3. ConcreteSubject (e.g., FitnessData)
   Implements FitnessDataSubject.
   Maintains an internal list of FitnessDataObserver objects.
   When new data is pushed, it updates its internal state and calls notifyObservers() to broadcast the change.

4. ConcreteObservers (e.g., LiveActivityDisplay)
   Implement the FitnessDataObserver interface.
   When update() is called, each observer pulls relevant data from the subject and performs its own logic (e.g., update UI, log progress, send alerts).