// STAR-CCM+ macro: newLagrangianPhase.java
// Written by STAR-CCM+ 8.06.005
package macro;

import java.util.*;

import star.lagrangian.*;
import star.common.*;
import star.base.neo.*;

public class newLagrangianPhase extends StarMacro {

  public void execute() {
    execute0();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    LagrangianMultiphaseModel lagrangianMultiphaseModel_0 = 
      physicsContinuum_0.getModelManager().getModel(LagrangianMultiphaseModel.class);

    LagrangianPhase lagrangianPhase_0 = 
      lagrangianMultiphaseModel_0.createPhase();

    lagrangianPhase_0.setPresentationName("Phase 001");
  }
}
