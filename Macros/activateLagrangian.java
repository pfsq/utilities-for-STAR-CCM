// STAR-CCM+ macro: activateLagrangian.java
// Written by STAR-CCM+ 8.06.005
package macro;

import java.util.*;

import star.lagrangian.*;
import star.common.*;

public class activateLagrangian extends StarMacro {

  public void execute() {
    execute0();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    PhysicsContinuum physicsContinuum_0 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("Physics 1"));

    physicsContinuum_0.enable(LagrangianMultiphaseModel.class);
  }
}
