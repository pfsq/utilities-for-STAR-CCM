/**
 * STAR-CCM+ macro: coarseTestDust.java
 * 
 * This macro will create dust particles from 1 to 200 microns in size. It will
 * also define the Size Distribution by Volume % according to:
 *    - ISO 12103-1, A4 Coarse Test Dust.
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

    public void execute() {
        _initUtils();
        execute0();
        _finalize();
    }

    private void execute0() {

        ArrayList<Integer> dust = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,10,20,40,80,120,180,200));
        
        ArrayList<PhysicsContinuum> phC = getAllPhysicsContinuas();
        
        for(PhysicsContinuum p : phC) {
            p.enable(LagrangianMultiphaseModel.class);
            LagrangianMultiphaseModel lmModel = p.getModelManager().getModel(LagrangianMultiphaseModel.class);
            ArrayList<LagrangianPhase> lPh = new ArrayList<>();  // Generic ArrayList to store only LagrangianPhase objects
            
            for(Integer d: dust) {
                lPh.add(lmModel.createPhase());
                String dustString = String.format("Phase %3d", d.intValue());
                lPh.get(-1).setPresentationName(dustString);
                lPh.get(-1).enable(MaterialParticleModel.class);
                lPh.get(-1).enable(SingleComponentParticleModel.class);
                lPh.get(-1).enable(ConstantDensityModel.class);
                lPh.get(-1).enable(DragForceModel.class);
                lPh.get(-1).enable(TrackFileModel.class);
            }
        }

        LagrangianMultiphaseModel lagrangianMultiphaseModel_1
                = physicsContinuum_1.getModelManager().getModel(LagrangianMultiphaseModel.class);

        LagrangianPhase lagrangianPhase_3
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_3.setPresentationName("Phase 001");

        lagrangianPhase_3.enable(MaterialParticleModel.class);

        lagrangianPhase_3.enable(SingleComponentParticleModel.class);

        lagrangianPhase_3.enable(ConstantDensityModel.class);

        lagrangianPhase_3.enable(DragForceModel.class);

        lagrangianPhase_3.enable(TrackFileModel.class);

        SingleComponentParticleMaterial singleComponentParticleMaterial_1
                = ((SingleComponentParticleMaterial) SingleComponentParticleModel_1.getMaterial());

        singleComponentParticleMaterial_1.setPresentationName("Dust");

        ConstantMaterialPropertyMethod constantMaterialPropertyMethod_2
                = ((ConstantMaterialPropertyMethod) singleComponentParticleMaterial_1.getMaterialProperties().getMaterialProperty(ConstantDensityProperty.class).getMethod());

        constantMaterialPropertyMethod_2.getQuantity().setValue(1200.0);

        DefaultBoundaryConditions defaultBoundaryConditions_0
                = ((DefaultBoundaryConditions) lagrangianPhase_3.getDefaultBoundaryConditionsManager().getBoundaryConditions(WallBoundary.class));

        NormalRestitutionCoefficient normalRestitutionCoefficient_0
                = defaultBoundaryConditions_0.getValues().get(NormalRestitutionCoefficient.class);

        normalRestitutionCoefficient_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);

        TangentialRestitutionCoefficient tangentialRestitutionCoefficient_0
                = defaultBoundaryConditions_0.getValues().get(TangentialRestitutionCoefficient.class);

        tangentialRestitutionCoefficient_0.getMethod(ConstantScalarProfileMethod.class).getQuantity().setValue(0.4);

        LagrangianPhase lagrangianPhase_4
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_4.setPresentationName("Copy of Phase 001");

        lagrangianPhase_4.copyProperties(lagrangianPhase_3);

        lagrangianPhase_4.setPresentationName("Phase 002");

        LagrangianPhase lagrangianPhase_5
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_5.setPresentationName("Copy of Phase 001");

        lagrangianPhase_5.copyProperties(lagrangianPhase_3);

        lagrangianPhase_5.setPresentationName("Phase 003");

        LagrangianPhase lagrangianPhase_6
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_6.setPresentationName("Copy of Phase 001");

        lagrangianPhase_6.copyProperties(lagrangianPhase_3);

        lagrangianPhase_6.setPresentationName("Phase 004");

        LagrangianPhase lagrangianPhase_7
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_7.setPresentationName("Copy of Phase 001");

        lagrangianPhase_7.copyProperties(lagrangianPhase_3);

        lagrangianPhase_7.setPresentationName("Phase 005");

        LagrangianPhase lagrangianPhase_8
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_8.setPresentationName("Copy of Phase 001");

        lagrangianPhase_8.copyProperties(lagrangianPhase_3);

        lagrangianPhase_8.setPresentationName("Phase 007");

        LagrangianPhase lagrangianPhase_9
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_9.setPresentationName("Copy of Phase 001");

        lagrangianPhase_9.copyProperties(lagrangianPhase_3);

        lagrangianPhase_9.setPresentationName("Phase 010");

        LagrangianPhase lagrangianPhase_10
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_10.setPresentationName("Copy of Phase 001");

        lagrangianPhase_10.copyProperties(lagrangianPhase_3);

        lagrangianPhase_10.setPresentationName("Phase 020");

        LagrangianPhase lagrangianPhase_11
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_11.setPresentationName("Copy of Phase 001");

        lagrangianPhase_11.copyProperties(lagrangianPhase_3);

        lagrangianPhase_11.setPresentationName("Copy of Phase 040");

        lagrangianPhase_11.setPresentationName("Phase 040");

        LagrangianPhase lagrangianPhase_12
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_12.setPresentationName("Copy of Phase 001");

        lagrangianPhase_12.copyProperties(lagrangianPhase_3);

        lagrangianPhase_12.setPresentationName("Phase 080");

        LagrangianPhase lagrangianPhase_13
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_13.setPresentationName("Copy of Phase 001");

        lagrangianPhase_13.copyProperties(lagrangianPhase_3);

        lagrangianPhase_13.setPresentationName("Phase 120");

        LagrangianPhase lagrangianPhase_14
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_14.setPresentationName("Copy of Phase 001");

        lagrangianPhase_14.copyProperties(lagrangianPhase_3);

        lagrangianPhase_14.setPresentationName("Phase 180");

        LagrangianPhase lagrangianPhase_15
                = lagrangianMultiphaseModel_1.createPhase();

        lagrangianPhase_15.setPresentationName("Copy of Phase 001");

        lagrangianPhase_15.copyProperties(lagrangianPhase_3);

        lagrangianPhase_15.setPresentationName("Phase 200");
    }
}
