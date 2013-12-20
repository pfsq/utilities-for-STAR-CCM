// STAR-CCM+ macro: macroLagrangian.java
// Written by Pablo Fernandez for STAR-CCM+ 8.06.005
package macro;

import java.util.*;
import java.text.*;

import star.lagrangian.*;
import star.common.*;
import star.base.neo.*;

public class macroLagrangian extends StarMacro {

  // Folder path: must contain input text file; all outputs will be located here
  public static final String folder =
      "C:\Users\renova\Documents\Pablo\Java"

  public void execute() {
    execute0();
  }

  private void execute() {
      
    int [] sizePhase = {1, 2, 3, 4, 5, 7, 10, 20, 80, 120, 180, 200};

    try {
      Simulation theSim =
        getActiveSimulation();

      // Numbering format for dust particles
      DecimalFormat sizeFormat =
        new DecimalFormat(000);

      PhysicsContinuum physicsContinuum_0 =
        ((PhysicsContinuum) theSim.getContinuumManager().getContinuum("Physics 1"));

      physicsContinuum_0.enable(LagrangianMultiphaseModel.class);

      LagrangianMultiphaseModel lagrangianMultiphaseModel_0 =
        physicsContinuum_0.getModelManager().getModel(LagrangianMultiphaseModel.class)[13];
        
      LagrangianPhase [] lArray = lagrangianMultiphaseModel_0.createPhase()[13];
      
      // Create first Phase
      lArray[0].setPresentationName("Phase 001");
      lArray[0].enable(MaterialParticleModel.class);
      lArray[0].enable(ConstantDensityModel.class);
      lArray[0].enable(DragForceModel.class);
      lArray[0].enable(TrackFileModel.class);
      

      // for loop
      for (int i=1; i<lArray.length; i++) {

        // Print line to output window to show how far the process has reached
        theSim.println("Creando... MultiphaseModel");

        // Size number format
        String size = sizeFormat.format(sizePhase[i]);

        // Create Lagrangian Phase
        lArray[i].setPresentationName("Phase " + size);
        lArray[i].copyProperties(lArray[i-1]);
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(
          null, e.toString()
      );
    }

  }
  
}