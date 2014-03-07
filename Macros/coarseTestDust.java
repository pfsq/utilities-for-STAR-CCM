/**
 * STAR-CCM+ macro: coarseTestDust2.java
 * 
 * This macro will create dust particles from 1 to 200 microns in size according
 * to:
 *    - ISO 12103-1.
 * 
 * A new derived part > probe > presentation grid, named "presentation grid",
 * must be created before running this macro as is.
 * 
 * @author Pablo Fernandez (pfernandez@theansweris27.com)
 */

import java.util.*;
import macroutils.*;
import star.common.*;
import star.flow.*;
import star.lagrangian.*;
import star.lagrangian.tracks.*;
import star.material.*;
import star.vis.*;

public class coarseTestDust2 extends MacroUtils {
    
    public void execute() {
        _initUtils();
        lagrangianMultiphase();
        particleInjectors();
        _finalize();
    }

    private void lagrangianMultiphase() {
        
        ArrayList<Integer> dust = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 10, 20, 40, 80, 120, 180, 200));
        ArrayList<PhysicsContinuum> phC = getAllPhysicsContinuas();
        
        for(PhysicsContinuum p : phC) {
            
            p.enable(LagrangianMultiphaseModel.class);
            LagrangianMultiphaseModel lmModel = p.getModelManager().getModel(LagrangianMultiphaseModel.class);
            ArrayList<LagrangianPhase> lPh = new ArrayList<>();  // Generic ArrayList to store only LagrangianPhase objects
            
            for(Integer d : dust) {
                
                // Create Phase and enable Lagrangian models
                lPh.add(lmModel.createPhase());
                String dustString = String.format("Phase %03d", d.intValue());
                lPh.get(lPh.size()-1).setPresentationName(dustString);
                lPh.get(lPh.size()-1).enable(MaterialParticleModel.class);
                lPh.get(lPh.size()-1).enable(SingleComponentParticleModel.class);
                lPh.get(lPh.size()-1).enable(ConstantDensityModel.class);
                lPh.get(lPh.size()-1).enable(DragForceModel.class);
                lPh.get(lPh.size()-1).enable(TrackFileModel.class);
                lPh.get(lPh.size()-1).enable(BoundarySamplingModel.class);
                
                // Define dust properties
                SingleComponentParticleModel sCPM = lPh.get(lPh.size()-1).getModelManager().getModel(SingleComponentParticleModel.class);
                SingleComponentParticleMaterial sCPMa = ((SingleComponentParticleMaterial) sCPM.getMaterial());
                sCPMa.setPresentationName("Dust");
                ConstantMaterialPropertyMethod cMPM = ((ConstantMaterialPropertyMethod) sCPMa.getMaterialProperties().getMaterialProperty(ConstantDensityProperty.class).getMethod());
                cMPM.getQuantity().setValue(1200.0);
                
                // Set boundary conditions for dust particles
                DefaultBoundaryConditions dBC = ((DefaultBoundaryConditions) lPh.get(lPh.size()-1).getDefaultBoundaryConditionsManager().getBoundaryConditions(WallBoundary.class));
                NormalRestitutionCoefficient nRC = dBC.getValues().get(NormalRestitutionCoefficient.class);
                nRC.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);
                TangentialRestitutionCoefficient tRC = dBC.getValues().get(TangentialRestitutionCoefficient.class);
                tRC.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);
            }
        }
    }
    
    private void particleInjectors() {
        
        //Particle sizes in microns (ISO 12103-1).
        Units um = ((Units) sim.getUnitsManager().getObject("um"));
        ArrayList<Integer> dust = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 10, 20, 40, 80, 120, 180, 200));
        ArrayList<PhysicsContinuum> phC = getAllPhysicsContinuas();
        
        for(PhysicsContinuum p : phC) {
            
            LagrangianMultiphaseModel lMM = p.getModelManager().getModel(LagrangianMultiphaseModel.class);
            
            for(Integer d : dust) {
                
                // Assign each Lagrangian phase to an injector
                Injector i = sim.get(InjectorManager.class).createInjector();
                String dustString = String.format("Phase %03d", d.intValue());
                LagrangianPhase lP = ((LagrangianPhase) lMM.getPhaseManager().getPhase(dustString));
                i.setLagrangianPhase(lP);
                i.setInjectorType(PartInjector.class);
                PlaneProbePart pPP = ((PlaneProbePart) sim.getPartManager().getObject("presentation grid")); 
                i.getPartGroup().setObjects(pPP);
                
                // Set mass flow rate to 0.002 kg/s
                InjectorMassFlowRate iMFR = i.getInjectorValues().get(InjectorMassFlowRate.class);
                iMFR.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.002);
                
                // Particle size in micro-meters
                InjectorParticleDiameter iPD = i.getInjectorValues().get(InjectorParticleDiameter.class);
                iPD.getMethod(ConstantScalarProfileMethod.class).getQuantity().setUnits(um);
                iPD.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(d.intValue());
                String injectorString = String.format("Injector %03d", d.intValue());
                i.setPresentationName(injectorString);
           }        
        }
    }
}
