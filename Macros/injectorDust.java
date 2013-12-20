// STAR-CCM+ macro: injectorDust.java
// Written by STAR-CCM+ 8.06.005
package macro;

import java.util.*;

import star.lagrangian.*;
import star.common.*;
import star.base.neo.*;
import star.vis.*;

public class injectorDust extends StarMacro {

  public void execute() {
    execute0();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Injector injector_1 = 
      simulation_0.get(InjectorManager.class).createInjector();

    PhysicsContinuum physicsContinuum_1 = 
      ((PhysicsContinuum) simulation_0.getContinuumManager().getContinuum("11000ft"));

    LagrangianMultiphaseModel lagrangianMultiphaseModel_1 = 
      physicsContinuum_1.getModelManager().getModel(LagrangianMultiphaseModel.class);

    LagrangianPhase lagrangianPhase_3 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 001"));

    injector_1.setLagrangianPhase(lagrangianPhase_3);

    injector_1.setInjectorType(PartInjector.class);

    PlaneProbePart planeProbePart_1 = 
      ((PlaneProbePart) simulation_0.getPartManager().getObject("presentation grid"));

    injector_1.getPartGroup().setObjects(planeProbePart_1);

    InjectorMassFlowRate injectorMassFlowRate_0 = 
      injector_1.getInjectorValues().get(InjectorMassFlowRate.class);

    injectorMassFlowRate_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.0020);

    injector_1.setPresentationName("Injector 001");

    Injector injector_2 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_2.setPresentationName("Copy of Injector 001");

    injector_2.copyProperties(injector_1);

    injector_2.setPresentationName("Injector 002");

    InjectorParticleDiameter injectorParticleDiameter_0 = 
      injector_2.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(2.0E-6);

    LagrangianPhase lagrangianPhase_4 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 002"));

    injector_2.setLagrangianPhase(lagrangianPhase_4);

    Injector injector_3 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_3.setPresentationName("Copy of Injector 001");

    injector_3.copyProperties(injector_1);

    injector_3.setPresentationName("Injector 003");

    InjectorParticleDiameter injectorParticleDiameter_1 = 
      injector_3.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_1.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(3.0E-6);

    LagrangianPhase lagrangianPhase_5 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 003"));

    injector_3.setLagrangianPhase(lagrangianPhase_5);

    Injector injector_4 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_4.setPresentationName("Copy of Injector 001");

    injector_4.copyProperties(injector_1);

    injector_4.setPresentationName("Injector 004");

    LagrangianPhase lagrangianPhase_6 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 004"));

    injector_4.setLagrangianPhase(lagrangianPhase_6);

    InjectorParticleDiameter injectorParticleDiameter_2 = 
      injector_4.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_2.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(4.0E-6);

    Injector injector_5 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_5.setPresentationName("Copy of Injector 001");

    injector_5.copyProperties(injector_1);

    injector_5.setPresentationName("Injector 005");

    LagrangianPhase lagrangianPhase_7 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 005"));

    injector_5.setLagrangianPhase(lagrangianPhase_7);

    InjectorParticleDiameter injectorParticleDiameter_3 = 
      injector_5.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_3.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(5.0E-6);

    Injector injector_6 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_6.setPresentationName("Copy of Injector 001");

    injector_6.copyProperties(injector_1);

    injector_6.setPresentationName("Injector 007");

    LagrangianPhase lagrangianPhase_8 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 007"));

    injector_6.setLagrangianPhase(lagrangianPhase_8);

    InjectorParticleDiameter injectorParticleDiameter_4 = 
      injector_6.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_4.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(7.0E-6);

    Injector injector_7 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_7.setPresentationName("Copy of Injector 001");

    injector_7.copyProperties(injector_1);

    injector_7.setPresentationName("Injector 010");

    LagrangianPhase lagrangianPhase_9 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 010"));

    injector_7.setLagrangianPhase(lagrangianPhase_9);

    InjectorParticleDiameter injectorParticleDiameter_5 = 
      injector_7.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_5.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(1.0E-5);

    Injector injector_8 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_8.setPresentationName("Copy of Injector 001");

    injector_8.copyProperties(injector_1);

    injector_8.setPresentationName("Injector 020");

    LagrangianPhase lagrangianPhase_10 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 020"));

    injector_8.setLagrangianPhase(lagrangianPhase_10);

    InjectorParticleDiameter injectorParticleDiameter_6 = 
      injector_8.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_6.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(2.0E-5);

    Injector injector_9 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_9.setPresentationName("Copy of Injector 001");

    injector_9.copyProperties(injector_1);

    injector_9.setPresentationName("Injector 040");

    LagrangianPhase lagrangianPhase_11 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 040"));

    injector_9.setLagrangianPhase(lagrangianPhase_11);

    InjectorParticleDiameter injectorParticleDiameter_7 = 
      injector_9.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_7.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(4.0E-5);

    Injector injector_10 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_10.setPresentationName("Copy of Injector 001");

    injector_10.copyProperties(injector_1);

    injector_10.setPresentationName("Injector 080");

    LagrangianPhase lagrangianPhase_12 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 080"));

    injector_10.setLagrangianPhase(lagrangianPhase_12);

    InjectorParticleDiameter injectorParticleDiameter_8 = 
      injector_10.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_8.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(8.0E-5);

    Injector injector_11 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_11.setPresentationName("Copy of Injector 001");

    injector_11.copyProperties(injector_1);

    injector_11.setPresentationName("Injector 120");

    LagrangianPhase lagrangianPhase_13 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 120"));

    injector_11.setLagrangianPhase(lagrangianPhase_13);

    InjectorParticleDiameter injectorParticleDiameter_9 = 
      injector_11.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_9.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(1.2E-4);

    Injector injector_12 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_12.setPresentationName("Copy of Injector 001");

    injector_12.copyProperties(injector_1);

    injector_12.setPresentationName("Injector 180");

    LagrangianPhase lagrangianPhase_14 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 180"));

    injector_12.setLagrangianPhase(lagrangianPhase_14);

    InjectorParticleDiameter injectorParticleDiameter_10 = 
      injector_12.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_10.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(1.8E-4);

    Injector injector_13 = 
      simulation_0.get(InjectorManager.class).createInjector();

    injector_13.setPresentationName("Copy of Injector 001");

    injector_13.copyProperties(injector_1);

    injector_13.setPresentationName("Injector 200");

    LagrangianPhase lagrangianPhase_15 = 
      ((LagrangianPhase) lagrangianMultiphaseModel_1.getPhaseManager().getPhase("Phase 200"));

    injector_13.setLagrangianPhase(lagrangianPhase_15);

    InjectorParticleDiameter injectorParticleDiameter_11 = 
      injector_13.getInjectorValues().get(InjectorParticleDiameter.class);

    injectorParticleDiameter_11.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(2.0E-4);
  }
}
