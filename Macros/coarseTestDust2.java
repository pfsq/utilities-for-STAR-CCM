/**
 * STAR-CCM+ macro: coarseTestDust2.java
 * 
 * This macro will create dust particles from 1 to 200 microns in size. It will
 * also define the Size Distribution by Volume % according to:
 *    - ISO 12103-1.
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

public class coarseTestDust2 extends MacroUtils {
    
    //Particle sizes in microns (ISO 12103-1).
    ArrayList<Integer> dust = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 10, 20, 40, 80, 120, 180, 200));
    ArrayList<PhysicsContinuum> phC = getAllPhysicsContinuas();
    
    public void execute() {
        _initUtils();
        lagrangianMultiphase();
        particleInjectors();
        _finalize();
    }

    private void lagrangianMultiphase() {
        
        for(PhysicsContinuum p : phC) {
            
            p.enable(LagrangianMultiphaseModel.class);
            LagrangianMultiphaseModel lmModel = p.getModelManager().getModel(LagrangianMultiphaseModel.class);
            ArrayList<LagrangianPhase> lPh = new ArrayList<>();  // Generic ArrayList to store only LagrangianPhase objects
            
            for(Integer d : dust) {
                
                lPh.add(lmModel.createPhase());
                String dustString = String.format("Phase %03d", d.intValue());
                lPh.get(lPh.size()-1).setPresentationName(dustString);
                lPh.get(lPh.size()-1).enable(MaterialParticleModel.class);
                lPh.get(lPh.size()-1).enable(SingleComponentParticleModel.class);
                lPh.get(lPh.size()-1).enable(ConstantDensityModel.class);
                lPh.get(lPh.size()-1).enable(DragForceModel.class);
                lPh.get(lPh.size()-1).enable(TrackFileModel.class);
                
                SingleComponentParticleModel sCPM = lPh.get(lPh.size()-1).getModelManager().getModel(SingleComponentParticleModel.class);
                SingleComponentParticleMaterial sCPMa = ((SingleComponentParticleMaterial) sCPM.getMaterial());
                sCPMa.setPresentationName("Dust");
                ConstantMaterialPropertyMethod cMPM = ((ConstantMaterialPropertyMethod) sCPMa.getMaterialProperties().getMaterialProperty(ConstantDensityProperty.class).getMethod());
                cMPM.getQuantity().setValue(1200.0);
                DefaultBoundaryConditions dBC = ((DefaultBoundaryConditions) lPh.get(lPh.size()-1).getDefaultBoundaryConditionsManager().getBoundaryConditions(WallBoundary.class));
                NormalRestitutionCoefficient nRC = dBC.getValues().get(NormalRestitutionCoefficient.class);
                nRC.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);
                TangentialRestitutionCoefficient tRC = dBC.getValues().get(TangentialRestitutionCoefficient.class);
                tRC.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);
            }
        }
    }
}
