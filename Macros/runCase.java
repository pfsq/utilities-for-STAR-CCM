// STAR-CCM+ macro: runCase.java
// Written by Pablo Fernández for STAR-CCM+ 8.06.005
package macro;

import java.util.*;

import javax.swing.*;

import star.common.*;
import star.base.neo.*;

public class runCase extends StarMacro {

  public void execute() {
    execute0();
  }

  private void execute0() {
    
    try {
      Simulation theSim = 
        getActiveSimulation();
      
      // Current simulation path and name
      String pathAndName =
        theSim.getSessionPath();
      
      // Get solution
      Solution theSolution =
        theSim.getSolution();
      
      // Get stopping criterion
      StepStoppingCriterion stopCriterion = 
        ((StepStoppingCriterion)theSim.getSolverStoppingCriterionManager().getSolverStoppingCriterion("Maximum Steps"));
      
      // Clear solution
      theSolution.clearSolution();
      
      // Initialize solution
      theSolution.initializeSolution();

      // Run case
      theSim.getSimulationIterator().run();
      
      // Save case
      if (stopCriterion.getIsSatisfied()){
        theSim.saveState(pathAndName);
      }
      
    } catch(Exception e) {
      JOptionPane.showMessageDialog(
        null, e.toString()
      );
    }
  }
}
