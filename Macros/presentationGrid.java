// STAR-CCM+ macro: presentationGrid.java
// Written by STAR-CCM+ 8.06.005
package macro;

import java.util.*;

import star.common.*;
import star.base.neo.*;
import star.vis.*;

public class presentationGrid extends StarMacro {

  public void execute() {
    execute0();
    execute1();
  }

  private void execute0() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Units units_0 = 
      simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Scalar Pressure");

    PartDisplayer partDisplayer_6 = 
      ((PartDisplayer) scene_2.getCreatorDisplayer());

    FvRepresentation fvRepresentation_0 = 
      ((FvRepresentation) simulation_0.getRepresentationManager().getObject("Volume Mesh"));

    partDisplayer_6.setRepresentation(fvRepresentation_0);

    CurrentView currentView_2 = 
      scene_2.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {7.760793677461935, -6.448070217107253, -2.6891489606172554}), new DoubleVector(new double[] {-33.67321851058896, 3.975201722073267, -1.3164924223250856}), new DoubleVector(new double[] {0.11737684870840454, 0.34390071320439447, 0.9316410117876913}), 8.547252592213043, 1);

    currentView_2.setInput(new DoubleVector(new double[] {13.880046657317997, -6.578440164861052, -3.1141986686910417}), new DoubleVector(new double[] {-30.606988825924738, -10.602085764024132, 0.7603574804394458}), new DoubleVector(new double[] {0.0499118569764785, 0.34920078919304887, 0.9357177006769251}), 8.547252592213043, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.326479407810819, -6.531114939626613, -3.1380635242322663}), new DoubleVector(new double[] {-30.523490405496496, -11.394292933371997, -0.9755770854197099}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 8.547252592213043, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.477492037736518, -6.124525096311033, -3.0084471551739167}), new DoubleVector(new double[] {-30.558705434085205, -11.007896152715855, -0.8369815623564509}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 7.696453137442163, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.445798451561139, -5.776768039909499, -2.8837111872358943}), new DoubleVector(new double[] {-30.590399020260584, -10.660139096314321, -0.7122455944184285}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 6.930276171766639, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.417274398653895, -5.463786606506862, -2.771448840251457}), new DoubleVector(new double[] {-30.618923073167828, -10.347157662911684, -0.5999832474339915}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 6.240322665179335, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.391602312112305, -5.182103385001416, -2.670412699805672}), new DoubleVector(new double[] {-30.644595159709418, -10.065474441406238, -0.4989471069882061}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 5.619022769234683, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.36849751683048, -4.928588484151793, -2.5794801724980854}), new DoubleVector(new double[] {-30.667699954991242, -9.811959540556614, -0.4080145796806196}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 5.059554827489635, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.347703471094867, -4.70042499670634, -2.4976409228260987}), new DoubleVector(new double[] {-30.688494000726855, -9.583796053111161, -0.32617533000863297}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 4.555772575818885, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.32898843869146, -4.4950779206018945, -2.4239855766670413}), new DoubleVector(new double[] {-30.707209033130262, -9.378448977006716, -0.2525199838495755}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 4.102138364529698, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.43934589021353, -4.137414200118697, -2.321556705300713}), new DoubleVector(new double[] {-30.739049947087217, -9.03620412892461, -0.1432348751602408}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 3.693358618498493, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.410688817961898, -3.8293938622294617, -2.2232001082309463}), new DoubleVector(new double[] {-30.76770701933885, -8.728183791035374, -0.044878278090473955}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 3.3252897842852542, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.384897537031065, -3.552175535830094, -2.13467916416821}), new DoubleVector(new double[] {-30.793498300269682, -8.450965464636006, 0.04364266597226241}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.310326343095234, -2.033334007544024, -2.2532453668618233}), new DoubleVector(new double[] {-30.962575456749356, -6.942371419664509, -0.07036683661121268}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.339211620028586, -1.7909019846860605, -1.7692846833224745}), new DoubleVector(new double[] {-30.965086100032593, -6.703343723474463, 0.41510763282331253}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.301350138884914, -1.2135588557216233, -1.8226225001289307}), new DoubleVector(new double[] {-31.02988109864006, -6.128921053319012, 0.3630684426716213}), new DoubleVector(new double[] {0.007842819079541381, 0.34501734010280033, 0.9385635435159808}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.301350138884914, -1.2135588557216233, -1.8226225001289307}), new DoubleVector(new double[] {14.301350138884914, -1.2135588557216233, 43.826677121453116}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.301350138884914, -1.2135588557216233, -1.8226225001289307}), new DoubleVector(new double[] {-31.347949482697132, -1.2135588557216233, -1.8226225001289307}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 2.993883720982876, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2261526307779258, -1.755646519131845}), new DoubleVector(new double[] {-31.347949482697132, -1.2261526307779258, -1.755646519131845}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 2.69453244715519, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2374870276766723, -1.6953681332542359}), new DoubleVector(new double[] {-31.347949482697132, -1.2374870276766723, -1.6953681332542359}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 2.4251119159099384, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2476879854443377, -1.6411175874545036}), new DoubleVector(new double[] {-31.347949482697132, -1.2476879854443377, -1.6411175874545036}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 2.1826297615740993, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2568688469695752, -1.5922920962347447}), new DoubleVector(new double[] {-31.347949482697132, -1.2568688469695752, -1.5922920962347447}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.9643925545504308, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2651316228079503, -1.5483491530193745}), new DoubleVector(new double[] {-31.347949482697132, -1.2651316228079503, -1.5483491530193745}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.7679763274832343, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.306435130339977, -1.2725681208762234, -1.5088005026354252}), new DoubleVector(new double[] {-31.347949482697132, -1.2725681208762234, -1.5088005026354252}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.5911991251039108, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.307812236052868, -1.2786530123780375, -1.4738123749865948}), new DoubleVector(new double[] {-31.347949482697132, -1.2786530123780375, -1.4738123749865948}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.4320845837818652, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.308884165984509, -1.2835817930976754, -1.4428705850167929}), new DoubleVector(new double[] {-31.347949482697132, -1.2835817930976754, -1.4428705850167929}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.2888798944676796, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.308884165984509, -1.288017695559085, -1.4150229746027647}), new DoubleVector(new double[] {-31.347949482697132, -1.288017695559085, -1.4150229746027647}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.1599951895005742, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.308884165984509, -1.2920100076812213, -1.3899601248576103}), new DoubleVector(new double[] {-31.347949482697132, -1.2920100076812213, -1.3899601248576103}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.0439986265905832, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.308884165984509, -1.2956030888239747, -1.367403561018294}), new DoubleVector(new double[] {-31.347949482697132, -1.2956030888239747, -1.367403561018294}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.9396014243751174, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.308884165984509, -1.2988368617593204, -1.3471026530041157}), new DoubleVector(new double[] {-31.347949482697132, -1.2988368617593204, -1.3471026530041157}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.8456435978385035, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.3092847091974, -1.3017472985888725, -1.3281848130299507}), new DoubleVector(new double[] {-31.347949482697132, -1.3017472985888725, -1.3281848130299507}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.7610800859047809, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.3092847091974, -1.3043666917587524, -1.3111587574257313}), new DoubleVector(new double[] {-31.347949482697132, -1.3043666917587524, -1.3111587574257313}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.684972840380268, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.3092847091974, -1.3067241455650782, -1.2958353075681983}), new DoubleVector(new double[] {-31.347949482697132, -1.3067241455650782, -1.2958353075681983}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.6164762431023748, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.3092847091974, -1.3088458541537529, -1.282044202789551}), new DoubleVector(new double[] {-31.347949482697132, -1.3088458541537529, -1.282044202789551}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5548292368769462, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.3092847091974, -1.3107553917438617, -1.2696322079299747}), new DoubleVector(new double[] {-31.347949482697132, -1.3107553917438617, -1.2696322079299747}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.4993468694661992, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.310806773406384, -1.276001614657127, -1.2561698926164566}), new DoubleVector(new double[] {-31.347949482697132, -1.276001614657127, -1.2561698926164566}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.44941401400241404, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.31203129122865, -1.2447230863840213, -1.2442256191297232}), new DoubleVector(new double[] {-31.347949482697132, -1.2447230863840213, -1.2442256191297232}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.4044739642808577, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313023112517712, -1.2165723174334397, -1.2336304120271264}), new DoubleVector(new double[] {-31.347949482697132, -1.2165723174334397, -1.2336304120271264}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.3640275478018072, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313023112517712, -1.1912366255641809, -1.224094725914186}), new DoubleVector(new double[] {-31.347949482697132, -1.1912366255641809, -1.224094725914186}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.3276256445658391, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313023112517712, -1.1684345017642608, -1.2155126079468785}), new DoubleVector(new double[] {-31.347949482697132, -1.1684345017642608, -1.2155126079468785}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.2948638465010385, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313023112517712, -1.1479125909031263, -1.207788701869434}), new DoubleVector(new double[] {-31.347949482697132, -1.1479125909031263, -1.207788701869434}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.2653781269712467, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313454173308727, -1.1665854688257804, -1.214638806648439}), new DoubleVector(new double[] {-31.347949482697132, -1.1665854688257804, -1.214638806648439}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.29191568914145766, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.313454173308727, -1.1871256336093774, -1.2221739215328156}), new DoubleVector(new double[] {-31.347949482697132, -1.1871256336093774, -1.2221739215328156}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.32110700686378957, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.2097197781772246, -1.2303397401719152}), new DoubleVector(new double[] {-31.347949482697132, -1.2097197781772246, -1.2303397401719152}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.353217281018085, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.2345733373881211, -1.2393221405817925}), new DoubleVector(new double[] {-31.347949482697132, -1.2345733373881211, -1.2393221405817925}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.3885385694436415, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.2619122519613137, -1.2492027811257898}), new DoubleVector(new double[] {-31.347949482697132, -1.2619122519613137, -1.2492027811257898}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.42739194274467573, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.2919850583643546, -1.2600714860035835}), new DoubleVector(new double[] {-31.347949482697132, -1.2919850583643546, -1.2600714860035835}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.4701306050120824, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.325065144476377, -1.27202706108976}), new DoubleVector(new double[] {-31.347949482697132, -1.325065144476377, -1.27202706108976}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5171431195818306, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.314087413054821, -1.3614532399446597, -1.2851781935914217}), new DoubleVector(new double[] {-31.347949482697132, -1.3614532399446597, -1.2851781935914217}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5688568742192049, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.318062327605602, -1.2396330297868186, -1.1242014873114174}), new DoubleVector(new double[] {-31.347949482697132, -1.2396330297868186, -1.1242014873114174}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5688568742192049, 1);

    Region region_3 = 
      simulation_0.getRegionManager().getRegion("Fluid volume carenado y flap");

    Region region_2 = 
      simulation_0.getRegionManager().getRegion("Tubo");

    ConstrainedPlaneSection constrainedPlaneSection_0 = 
      (ConstrainedPlaneSection) simulation_0.getPartManager().createConstrainedPlaneImplicitPart(new NeoObjectVector(new Object[] {region_3, region_2}), new DoubleVector(new double[] {6.08310600534837, -0.750176828259778, -1.127464528654931, 6.0615473258656785, -1.424538705919256, -0.8468429731127611, 6.067515258030973, -1.5681125250338548, -1.1513934985073642, 6.087388165829974, -0.9372578652878913, -1.4037353624057496, 6.087388165829974, -0.9372578652878913, -1.4037353624057496}), units_0);

    constrainedPlaneSection_0.setReevaluateStatus(false);

    LabCoordinateSystem labCoordinateSystem_0 = 
      simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();

    CartesianCoordinateSystem cartesianCoordinateSystem_3 = 
      ((CartesianCoordinateSystem) labCoordinateSystem_0.getLocalCoordinateSystemManager().getObject("Cartesian Presentation Grid"));

    constrainedPlaneSection_0.setCoordinateSystem(cartesianCoordinateSystem_3);

    Coordinate coordinate_8 = 
      constrainedPlaneSection_0.getOriginCoordinate();

    coordinate_8.setValue(new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    OrthoNormalBasis orthoNormalBasis_0 = 
      constrainedPlaneSection_0.getPlaneBasis();

    orthoNormalBasis_0.setBasisVectors(new DoubleVector(new double[] {0.028963620979733918, -2.882286611739948E-4, -0.9995804247703041, 0.01989666001919751, 0.9998020003202231, 2.8822866117399925E-4, 0.999382425090527, -0.01989666001919751, 0.028963620979733914}));

    coordinate_8.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    Coordinate coordinate_9 = 
      constrainedPlaneSection_0.getNormalCoordinate();

    coordinate_9.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 3.2682190287403046E-15, -2.078198724220215E-15}));

    constrainedPlaneSection_0.setReevaluateStatus(true);

    currentView_2.setInput(new DoubleVector(new double[] {14.330109141570446, -1.0112201357408663, -1.152481178955202}), new DoubleVector(new double[] {-31.347949482697132, -1.0112201357408663, -1.152481178955202}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5688568742192049, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.463755565521083, -0.9995588411438409, -1.1542677205031677}), new DoubleVector(new double[] {-30.576911417525793, -8.553942428776486, 0.003084067181457115}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.5688568742192049, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.486060628384067, -1.0827376685987113, -1.1482380624398287}), new DoubleVector(new double[] {-30.5625757864008, -8.638457918149504, 0.00931850542871878}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.6257334147387915, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.501829638726278, -1.1757048178228198, -1.1413801624293767}), new DoubleVector(new double[] {-30.546806776058588, -8.731425067373612, 0.016176405439170836}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.6882969037276268, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.519175549550667, -1.2779686823064802, -1.1338364737278808}), new DoubleVector(new double[] {-30.5294608652342, -8.833688931857273, 0.023720094140666746}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.7571160438384743, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.538256657354438, -1.3904587579946375, -1.125538445351529}), new DoubleVector(new double[] {-30.510379757430428, -8.94617900754543, 0.0320181225170186}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.8328164223484267, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.55924559734784, -1.5141979183271284, -1.1164105964811937}), new DoubleVector(new double[] {-30.489390817437027, -9.06991816787792, 0.04114597138735384}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 0.9160862029892426, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.601580161133349, -1.6438776698787594, -1.1061711421810423}), new DoubleVector(new double[] {-30.466808710229117, -9.202910872895393, 0.051892979026798756}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 1.0076582968896481, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.626420569122509, -1.7901696612617402, -1.0943494478951359}), new DoubleVector(new double[] {-30.441968302239957, -9.349202864278373, 0.06371467331270517}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 1.108384789883655, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.653745298705907, -1.9510908378444585, -1.0813455699859156}), new DoubleVector(new double[] {-30.41464357265656, -9.510124040861092, 0.07671855122192547}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 1.2191812024689515, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.683802305205809, -2.1281041360282815, -1.0670413124427918}), new DoubleVector(new double[] {-30.384586566156656, -9.687137339044915, 0.09102280876504928}), new DoubleVector(new double[] {0.025333599119531924, 0.0021094456677022673, 0.9996768272770085}), 1.3410544756319314, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.060660799189162, -3.3616340073247324, -0.772964405169122}), new DoubleVector(new double[] {-28.46319490282091, 12.718181762787527, 2.7579965059802234}), new DoubleVector(new double[] {0.10070916266472386, -0.008502675409681575, 0.9948795751578419}), 1.3410544756319314, 1);

    constrainedPlaneSection_0.setReevaluateStatus(false);

    partDisplayer_6.setRepresentation(fvRepresentation_0);

    currentView_2.setInput(new DoubleVector(new double[] {5.060660799189162, -3.3616340073247324, -0.772964405169122}), new DoubleVector(new double[] {-32.28739217932644, -3.3616340073247324, -0.772964405169122}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.3410544756319314, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.127322633905983, -3.1385522844691645, -0.7814261254792736}), new DoubleVector(new double[] {-32.28739217932644, -3.1385522844691645, -0.7814261254792736}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.2072144621674208, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.180533846064186, -2.9391195388932596, -0.7899666487177537}), new DoubleVector(new double[] {-32.28739217932644, -2.9391195388932596, -0.7899666487177537}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 1.0866835499950205, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.222991426630593, -2.760845265020884, -0.7972389094469772}), new DoubleVector(new double[] {-32.28739217932644, -2.760845265020884, -0.7972389094469772}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.9781518106303599, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.2568468648630144, -2.6014981629748712, -0.8015405328882561}), new DoubleVector(new double[] {-32.28739217932644, -2.6014981629748712, -0.8015405328882561}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.8804345938564554, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.284240205927468, -2.4580698075194727, -0.8033923074075655}), new DoubleVector(new double[] {-32.28739217932644, -2.4580698075194727, -0.8033923074075655}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.7924624511552052, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.306308229609108, -2.3292757185597788, -0.8032407849499659}), new DoubleVector(new double[] {-32.28739217932644, -2.3292757185597788, -0.8032407849499659}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.7132679354165304, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.324012239618874, -2.2138981508512865, -0.8011950834592507}), new DoubleVector(new double[] {-32.28739217932644, -2.2138981508512865, -0.8011950834592507}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.6419784995174206, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.337989290400124, -2.111525288452662, -0.7951803708387242}), new DoubleVector(new double[] {-32.28739217932644, -2.111525288452662, -0.7951803708387242}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5778071272862073, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.337989290400124, -2.019389710058726, -0.7897671296199487}), new DoubleVector(new double[] {-32.28739217932644, -2.019389710058726, -0.7897671296199487}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.5200498355261225, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.347037752314186, -1.9370567711491953, -0.7842981543330179}), new DoubleVector(new double[] {-32.28739217932644, -1.9370567711491953, -0.7842981543330179}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.4680587682685078, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.347861726923561, -1.4090363633510694, -1.0993204993244414}), new DoubleVector(new double[] {-32.28739217932644, -1.4090363633510694, -1.0993204993244414}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.4680587682685078, 1);

    constrainedPlaneSection_0.setBatched(true);

    constrainedPlaneSection_0.setCoordinateSystem(cartesianCoordinateSystem_3);

    coordinate_8.setValue(new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    orthoNormalBasis_0.setBasisVectors(new DoubleVector(new double[] {0.028963620979733932, -2.88228661173995E-4, -0.9995804247703041, 0.019896660019197435, 0.9998020003202231, 2.882286611739971E-4, 0.999382425090527, -0.019896660019197435, 0.02896362097973393}));

    constrainedPlaneSection_0.setLoop(new DoubleVector(new double[] {6.083459861497978, -0.710975485245073, -1.1127447469803262, 6.059947017587934, -1.4698929527244127, -0.82278099761322, 6.062570946301708, -1.5361192411601097, -0.9588133738595168, 6.08593132524917, -0.7718320746184164, -1.2398276247893665}));

    coordinate_8.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    coordinate_9.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 3.2682190287403046E-15, -2.078198724220215E-15}));

    constrainedPlaneSection_0.setBatched(false);

    constrainedPlaneSection_0.setReevaluateStatus(true);

    currentView_2.setInput(new DoubleVector(new double[] {4.968309657801055, -1.2079148769774513, -1.1429808035072575}), new DoubleVector(new double[] {-15.372196508848567, 29.739614090468645, -7.861201480910324}), new DoubleVector(new double[] {-0.17849561258883848, 0.09527662932453185, 0.9793169457285475}), 0.4680587682685078, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.7181742535902655, -0.7442371655185038, -1.2524643319440285}), new DoubleVector(new double[] {-14.624735687233413, 30.20694907919854, -7.9714789465887606}), new DoubleVector(new double[] {-0.17849561258883848, 0.09527662932453185, 0.9793169457285475}), 0.4680587682685078, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.806021265515301, -0.7989091461813317, -1.2455226060554458}), new DoubleVector(new double[] {-31.445320142802775, 4.1714870598739395, 0.9006780397399955}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.4680587682685078, 1);

    partDisplayer_6.setRepresentation(fvRepresentation_0);

    partDisplayer_6.setRepresentation(fvRepresentation_0);

    partDisplayer_6.setRepresentation(fvRepresentation_0);

    PlaneProbePart planeProbePart_1 = 
      simulation_0.getPartManager().createPlaneProbePart(new NeoObjectVector(new Object[] {region_3, region_2}), new DoubleVector(new double[] {-15.446068159412222, -15.171322475297353, -5.347031493506874}), new DoubleVector(new double[] {16.072485368569605, -14.257866418624074, -5.974532251442975}), new DoubleVector(new double[] {-16.073569632420813, 14.257835147912642, 5.974554047157139}), 10, 10);

    planeProbePart_1.setCoordinateSystem(cartesianCoordinateSystem_3);

    Coordinate coordinate_10 = 
      planeProbePart_1.getOriginCoordinate();

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {-15.352262251234784, -16.563387796624045, 0.3246362046468265}));

    Coordinate coordinate_11 = 
      planeProbePart_1.getNormalCoordinate();

    coordinate_11.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.028963620979737034, -0.35836443241689975, 0.9331323819470929}));

    Coordinate coordinate_12 = 
      planeProbePart_1.getPoint1Coordinate();

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {16.04165601641749, -14.288088700521854, -5.985182038568696}));

    Coordinate coordinate_13 = 
      planeProbePart_1.getPoint2Coordinate();

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {-16.042740280268696, 14.288057429810419, 5.98520383428286}));

    coordinate_10.setValue(new DoubleVector(new double[] {-15.446068159412222, -15.171322475297353, -5.347031493506874}));

    coordinate_12.setValue(new DoubleVector(new double[] {16.072485368569605, -14.257866418624074, -5.974532251442975}));

    coordinate_13.setValue(new DoubleVector(new double[] {-16.073569632420813, 14.257835147912642, 5.974554047157139}));

    coordinate_11.setValue(new DoubleVector(new double[] {0.028963620979737037, -0.35836443241689975, 0.9331323819470929}));

    planeProbePart_1.setXResolution(10);

    planeProbePart_1.setYResolution(10);

    planeProbePart_1.setBatched(false);

    currentView_2.setInput(new DoubleVector(new double[] {5.803715713833871, -0.8671040662592544, -1.236927140926436}), new DoubleVector(new double[] {-31.45379410387412, 4.104115182335423, 0.9096288919159053}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.514857607219546, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.794394413132398, -0.9412131164013777, -1.227081205799934}), new DoubleVector(new double[] {-31.463115404575593, 4.0300061321933, 0.9194748270424072}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.5663357828844204, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.784141131726404, -1.0227331117304521, -1.2162506900409942}), new DoubleVector(new double[] {-31.473368685981587, 3.9484861368642257, 0.9303053428013471}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.6229612472527977, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.772862414490508, -1.1124050836350419, -1.2043370995895564}), new DoubleVector(new double[] {-31.484647403217483, 3.858814164959636, 0.9422189332527849}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.6852487623832385, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.760455974896647, -1.2110442780016681, -1.191232174894116}), new DoubleVector(new double[] {-31.497053842811344, 3.7601749705930096, 0.9553238579482254}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.7537644459116043, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.746808805017142, -1.319547385427529, -1.1768167526763214}), new DoubleVector(new double[] {-31.51070101269085, 3.6516718631671488, 0.96973928016602}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.829131389633509, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.731797163130626, -1.4389008346601377, -1.1609598057180794}), new DoubleVector(new double[] {-31.525712654577365, 3.53231841393454, 0.9855962271242619}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 0.9120346658300067, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.737134450253546, -1.5726709937768009, -1.163637126486218}), new DoubleVector(new double[] {-31.543233212531252, 3.4015981462352904, 0.9842358393848595}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.0031872549943164, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.7178622260413725, -1.7164633680956038, -1.1651335890142112}), new DoubleVector(new double[] {-31.562505436743425, 3.2578057719164875, 0.9827393768568663}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.1034512371727556, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.696662628514556, -1.8746349440551535, -1.1667796754094675}), new DoubleVector(new double[] {-31.583705034270242, 3.099634195956938, 0.98109329046161}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.2137377105317666, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.673342777042603, -2.048623653908334, -1.1685903613389867}), new DoubleVector(new double[] {-31.607024885742195, 2.9256454861037575, 0.9792826045320907}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.3350490586751562, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.6476911893882225, -2.2400112592734773, -1.170582124871618}), new DoubleVector(new double[] {-31.632676473396575, 2.734257880738614, 0.9772908409994595}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.468488006312538, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.619474456241289, -2.450537618052775, -1.1727730722259273}), new DoubleVector(new double[] {-31.66089320654351, 2.5237315219593164, 0.9750998936451502}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.6152681223527534, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.588436039210688, -2.6821166353899644, -1.1751831113532698}), new DoubleVector(new double[] {-31.69193162357411, 2.292152504622127, 0.9726898545178077}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.776724128082943, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.554293886638529, -2.9368535788196377, -1.177834175455207}), new DoubleVector(new double[] {-31.72607377614627, 2.0374155611924536, 0.9700387904158704}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 1.9543251336837195, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.516737580013636, -3.2170642063218056, -1.180750346115944}), new DoubleVector(new double[] {-31.76363008277116, 1.7572049336902857, 0.9671226197551334}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 2.1496878094327796, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.4754257039307355, -3.5252959012048786, -1.1839581325012447}), new DoubleVector(new double[] {-31.804941958854062, 1.4489732388072127, 0.9639148333698327}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 2.3645915261513295, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.429982746648928, -3.8643507987078403, -1.1874867097770108}), new DoubleVector(new double[] {-31.85038491613587, 1.109918341304251, 0.9603862560940667}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 2.6009944342618057, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.37999529530968, -4.237311148511968, -1.1913681329564016}), new DoubleVector(new double[] {-31.900372367475118, 0.7369579915001232, 0.9565048329146758}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 2.861052553596238, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.325009160040988, -4.647567532711791, -1.1956376866814087}), new DoubleVector(new double[] {-31.95535850274381, 0.3267016073003006, 0.9522352791896688}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 3.147139296346203, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.264524377082477, -5.098849559217226, -1.200334203378103}), new DoubleVector(new double[] {-32.01584328570232, -0.12458041920513452, 0.9475387624929744}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 3.4618695106078627, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.197991153190738, -5.595259787963109, -1.205500374873305}), new DoubleVector(new double[] {-32.082376509594056, -0.6209906479510181, 0.9423725909977724}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 3.8081224003776644, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.1248046204305915, -6.1413110389930425, -1.2111831547259366}), new DoubleVector(new double[] {-32.1555630423542, -1.1670418989809512, 0.9366898111451408}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 4.189071186036262, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.0442995884875295, -6.741967444159731, -1.2174342337564634}), new DoubleVector(new double[] {-32.236068074297265, -1.7676983041476397, 0.930438732114614}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 4.608214195756535, 1);

    currentView_2.setInput(new DoubleVector(new double[] {4.955744114802524, -7.402689491325664, -1.2243104164990721}), new DoubleVector(new double[] {-32.32462354798227, -2.428420351313573, 0.9235625493720053}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 5.069408966813265, 1);

    currentView_2.setInput(new DoubleVector(new double[] {4.858332823894184, -8.129483717679989, -1.2318741997315255}), new DoubleVector(new double[] {-32.42203483889061, -3.1552145776678984, 0.915998766139552}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 5.576912526623667, 1);

    currentView_2.setInput(new DoubleVector(new double[] {4.751180701039257, -8.928957405761793, -1.240194379499624}), new DoubleVector(new double[] {-32.52918696174554, -3.9546882657497022, 0.9076785863714535}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 6.135423812246384, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.659334821659137, -9.947891171609903, -1.3015305100881043}), new DoubleVector(new double[] {-32.6470046692486, -4.836727995323372, 0.9054528479685741}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 6.734011271875312, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.52973518323261, -10.918134867801157, -1.3039788271357362}), new DoubleVector(new double[] {-32.77660430767513, -5.806971691514626, 0.9030045309209421}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 7.391338214744827, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.387175823623046, -11.98540294683195, -1.3066719838552285}), new DoubleVector(new double[] {-32.91916366728469, -6.874239770545419, 0.9003113742014498}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 8.113281871363606, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.230360230033732, -13.159397788137767, -1.3096344369752475}), new DoubleVector(new double[] {-33.07597926087401, -8.048234611851235, 0.8973489210814308}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 8.906340521088493, 1);

    currentView_2.setInput(new DoubleVector(new double[] {5.057863600641888, -14.45079217800378, -1.3128931808612978}), new DoubleVector(new double[] {-33.24847589026585, -9.339629001717249, 0.8940901771953805}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 9.777717057563244, 1);

    currentView_2.setInput(new DoubleVector(new double[] {4.868116915172514, -15.87132598788255, -1.3164777710546054}), new DoubleVector(new double[] {-33.438222575735224, -10.760162811596018, 0.8905055870020729}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 10.735406110052233, 1);

    currentView_2.setInput(new DoubleVector(new double[] {4.65939568460653, -17.43391319494984, -1.3204208222738765}), new DoubleVector(new double[] {-33.64694380630121, -12.32275001866331, 0.8865625357828019}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 11.78830519446945, 1);

    currentView_2.setInput(new DoubleVector(new double[] {8.004331685459412, -19.60532118007912, -1.5259444638405153}), new DoubleVector(new double[] {-33.87308271298791, -14.017674298751821, 0.8867829824286205}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 12.875426598855409, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.755579012484695, -21.469737855578504, -1.5257019919707364}), new DoubleVector(new double[] {-34.121835385962626, -15.882090974251206, 0.8870254542983994}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 14.064823397984886, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.481950703598464, -23.520596128043007, -1.5254352487248042}), new DoubleVector(new double[] {-34.39546369484886, -17.932949246715708, 0.8872921975443316}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 15.366763569401659, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.180960043105436, -25.77654033707358, -1.525141859587226}), new DoubleVector(new double[] {-34.696454355341885, -20.188893455746282, 0.8875855866819099}), new DoubleVector(new double[] {0.05107996312361379, -0.047910452457761106, 0.9975446987040644}), 16.792751556585387, 1);

    currentView_2.setInput(new DoubleVector(new double[] {-2.3480703567282637, -23.870234274694106, -0.7359433865722887}), new DoubleVector(new double[] {-35.90684050260617, 10.95234399600598, 12.678157842811924}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 16.792751556585387, 1);

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.3, -0.05}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.3, -0.15}));

    coordinate_11.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.3, -0.05}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.3, -0.15}));

    currentView_2.setInput(new DoubleVector(new double[] {3.4635764957451443, -26.26311926873948, -2.4218893211841674}), new DoubleVector(new double[] {-34.105254147091244, 12.720536565845395, 12.595112050497516}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 15.311341468413852, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.90496827393752, -27.659128059197272, -3.6620476576911756}), new DoubleVector(new double[] {-32.51906129660799, 14.287252204988976, 12.496232946806014}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 13.899849905652664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {9.332542039430159, -26.249084274957724, -3.7510389551016203}), new DoubleVector(new double[] {-31.091487531115348, 15.697295989228524, 12.40724164939557}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 12.616495899472218, 1);

    currentView_2.setInput(new DoubleVector(new double[] {12.315155762252566, -26.78053215931896, -4.519582594080983}), new DoubleVector(new double[] {-29.82640347719709, 16.948059165275012, 12.32522843876627}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 11.411836821116824, 1);

    currentView_2.setInput(new DoubleVector(new double[] {13.453731261390935, -25.6548449463616, -4.593394316557745}), new DoubleVector(new double[] {-28.68782797805872, 18.07374637823237, 12.251416716289508}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 10.321244657719246, 1);

    currentView_2.setInput(new DoubleVector(new double[] {14.47844933325353, -24.641726919546066, -4.659824965694124}), new DoubleVector(new double[] {-27.663109906196127, 19.086864405047905, 12.18498606715313}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 9.33417589096726, 1);

    currentView_2.setInput(new DoubleVector(new double[] {16.32649281551584, -24.662418909102975, -5.081310019833925}), new DoubleVector(new double[] {-26.726302240877743, 20.01172496168563, 12.127739912090743}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 8.42268119973794, 1);

    currentView_2.setInput(new DoubleVector(new double[] {17.90065728667146, -24.583816432613517, -5.420895036878868}), new DoubleVector(new double[] {-25.88020915994852, 20.84581766807942, 12.079179366093495}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 7.595960503370352, 1);

    currentView_2.setInput(new DoubleVector(new double[] {18.979349330364265, -24.374585410152747, -5.770567091686523}), new DoubleVector(new double[] {-25.2492467131477, 21.519639581806658, 11.908473647358147}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 6.844903079472683, 1);

    currentView_2.setInput(new DoubleVector(new double[] {19.894665661124044, -24.13958156400851, -6.075706055136212}), new DoubleVector(new double[] {-24.68869396348552, 22.122767245261954, 11.745140672884087}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 6.166461789704304, 1);

    currentView_2.setInput(new DoubleVector(new double[] {20.68144632586754, -23.89252216400171, -6.340964068450717}), new DoubleVector(new double[] {-24.18648429841423, 22.66511446024471, 11.593631291595027}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 5.5541592391930195, 1);

    currentView_2.setInput(new DoubleVector(new double[] {21.133435343448213, -23.404409784574845, -6.477322672534342}), new DoubleVector(new double[] {-23.734495280833556, 23.153226839671575, 11.457272687511402}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 5.002581752760982, 1);

    currentView_2.setInput(new DoubleVector(new double[] {21.724962040066565, -23.158013314726666, -6.67220934990857}), new DoubleVector(new double[] {-23.327967027432663, 23.591588710542922, 11.33633353067533}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 4.504605537836137, 1);

    currentView_2.setInput(new DoubleVector(new double[] {22.225194243476246, -22.921223133152196, -6.8267300072725305}), new DoubleVector(new double[] {-22.969155606761063, 23.975125517652046, 11.238341544872963}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 4.055710859359138, 1);

    currentView_2.setInput(new DoubleVector(new double[] {22.548124621667377, -22.576039769188824, -6.914922870264533}), new DoubleVector(new double[] {-22.646225228569932, 24.320308881615418, 11.15014868188096}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 3.6515228235204287, 1);

    currentView_2.setInput(new DoubleVector(new double[] {22.92512247936242, -22.362694151033864, -7.03144024566031}), new DoubleVector(new double[] {-22.359632395617922, 24.627464136908273, 11.069767975030441}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 3.2871803524502217, 1);

    currentView_2.setInput(new DoubleVector(new double[] {23.18305596859495, -22.086254361286663, -7.1037827893257095}), new DoubleVector(new double[] {-22.101698906385394, 24.903903926655474, 10.997425431365041}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 2.959177625155014, 1);

    currentView_2.setInput(new DoubleVector(new double[] {23.415195586580303, -21.83745839809295, -7.168890989804698}), new DoubleVector(new double[] {-21.86955928840004, 25.15269988984919, 10.932317230886053}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 2.6638936277380996, 1);

    currentView_2.setInput(new DoubleVector(new double[] {23.670463886076888, -21.664129838443152, -7.245347797425882}), new DoubleVector(new double[] {-21.66167442492926, 25.37519632432189, 10.874800515666447}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 2.3978136167519866, 1);

    currentView_2.setInput(new DoubleVector(new double[] {23.893629882886636, -21.505019871409132, -7.310170877081717}), new DoubleVector(new double[] {-21.476056026003874, 25.57326791481593, 10.824985950230637}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 2.158252778233924, 1);

    currentView_2.setInput(new DoubleVector(new double[] {24.083662368349415, -21.362247020769153, -7.364181837498634}), new DoubleVector(new double[] {-21.31440360671374, 25.745489612101025, 10.782319061091709}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 1.9425773125140882, 1);

    currentView_2.setInput(new DoubleVector(new double[] {24.229149531139306, -21.20724725112688, -7.402582106955251}), new DoubleVector(new double[] {-21.168916443923848, 25.9004893817433, 10.743918791635092}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 1.7484519121536148, 1);

    currentView_2.setInput(new DoubleVector(new double[] {24.360087915395262, -21.067747550149157, -7.437142287567568}), new DoubleVector(new double[] {-21.037978059667893, 26.03998908272102, 10.709358611022775}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 1.5737239611846119, 1);

    currentView_2.setInput(new DoubleVector(new double[] {23.95802876297266, -21.255618468788324, -8.041492097113439}), new DoubleVector(new double[] {-21.455443971005003, 25.86810513457767, 10.11116718638784}), new DoubleVector(new double[] {0.23788173861629014, -0.14094620577178202, 0.9610132389886362}), 1.5737239611846119, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.234407716949974, -2.5482459397752293, -0.6702774501434884}), new DoubleVector(new double[] {-31.28009932126508, 5.817007218580524, -13.381336009009477}), new DoubleVector(new double[] {-0.28592521021617295, 0.15471655496664455, 0.9456794180810381}), 1.5737239611846119, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.406893348935572, -2.389656995546046, -0.5807532333882215}), new DoubleVector(new double[] {-28.404335982051755, -20.106436754173988, 6.116577174723811}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 1.5737239611846119, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.310700477403391, -2.2835997892424666, -0.618872855774306}), new DoubleVector(new double[] {-28.47193341911672, -19.986232616194997, 6.073109702616611}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 1.4164630907615898, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.249862922311694, -2.1754161199753295, -0.6579935995566157}), new DoubleVector(new double[] {-28.532770974208418, -19.87804894692786, 6.033988958834301}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 1.2749152939190993, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.195109094102931, -2.0780508129442152, -0.6932022520837375}), new DoubleVector(new double[] {-28.58752480241718, -19.780683639896743, 5.998780306307179}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 1.14751111078113, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.145830548563236, -1.9904220438464504, -0.724890058243977}), new DoubleVector(new double[] {-28.636803347956878, -19.693054870798978, 5.967092500146939}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 1.0328375359180797, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.101479876634991, -1.9115561112049844, -0.7534091026740224}), new DoubleVector(new double[] {-28.681154019885124, -19.61418893815751, 5.938573455716893}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.9296227914940762, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.061564267115193, -1.840576826741619, -0.7790762436654997}), new DoubleVector(new double[] {-28.721069629404923, -19.543209653694145, 5.912906314725416}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.8367221871750827, 1);

    currentView_2.setInput(new DoubleVector(new double[] {7.031908062191353, -1.7727993556020223, -0.8031911902339447}), new DoubleVector(new double[] {-28.75727783069313, -19.478673631640085, 5.890016706837174}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.7530669420724012, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.998752947519732, -1.691369800049609, -0.8259131909305072}), new DoubleVector(new double[] {-28.79932518129518, -19.40164330472306, 5.868957710823935}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.6777811034344666, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.960910346978714, -1.6220425390047741, -0.8448662356345424}), new DoubleVector(new double[] {-28.8371677818362, -19.332316043678226, 5.8500046661199}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.6100213806077084, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.926851926125197, -1.5596480134030546, -0.8619239718440098}), new DoubleVector(new double[] {-28.87122620268972, -19.269921518076508, 5.832946929910433}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.5490355044971834, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.896199314674146, -1.503492902016423, -0.8772759423292951}), new DoubleVector(new double[] {-28.901878814140773, -19.213766406689878, 5.817594959425148}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.278924168366247, -1.128969818146797, -1.076603170265481}), new DoubleVector(new double[] {-29.21072117637089, -18.686653316614635, 5.560585370334293}), new DoubleVector(new double[] {0.08273936422889487, 0.20168756305730318, 0.9759489354033871}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.247449694252295, -1.1359757503749326, -1.0730494553066554}), new DoubleVector(new double[] {-33.8486017210648, -0.3720707402991898, 0.8155602261573351}), new DoubleVector(new double[] {0.04984732882412012, 0.19437955041381544, 0.9796590397633368}), 0.49414638336427186, 1);

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.4, -0.05}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.15}));

    currentView_2.setInput(new DoubleVector(new double[] {6.237877648618944, -1.1357618727075578, -1.0726730465035133}), new DoubleVector(new double[] {-33.88783134615927, 0.1100878886405848, -0.3200515747831644}), new DoubleVector(new double[] {0.02444573407554948, 0.19501591612823238, 0.9804953842533752}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.231581699778776, -1.1355714436457371, -1.0726172375170424}), new DoubleVector(new double[] {-33.8775421336473, -0.08408829161999518, -2.710169703786712}), new DoubleVector(new double[] {-0.03484745306198692, 0.19671364339661498, 0.9798415165304655}), 0.49414638336427186, 1);

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.35, -0.05}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.25, -0.15}));

    currentView_2.setInput(new DoubleVector(new double[] {6.1044641148369845, -1.165394768415515, -1.0632671459626843}), new DoubleVector(new double[] {-28.679356359514074, -19.897964342198232, 6.131381652857041}), new DoubleVector(new double[] {0.08032065678793059, 0.2239028141006175, 0.9712961041469177}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.221428775981242, -1.1067107885401903, -1.0861700072706115}), new DoubleVector(new double[] {-33.9483027898611, 1.6517701806334606, -0.08390238849807959}), new DoubleVector(new double[] {0.03911847332308971, 0.2151032740354827, 0.9758075253573765}), 0.49414638336427186, 1);

    simulation_0.getPartManager().removeObjects(constrainedPlaneSection_0);

    Boundary boundary_11 = 
      region_2.getBoundaryManager().getBoundary("Tubo.Inlet");

    DirectBoundaryInterfaceBoundary directBoundaryInterfaceBoundary_2 = 
      ((DirectBoundaryInterfaceBoundary) region_2.getBoundaryManager().getBoundary("Tubo.Inlet [In-place 1]"));

    Boundary boundary_9 = 
      region_2.getBoundaryManager().getBoundary("Tubo.Outlet");

    Boundary boundary_10 = 
      region_2.getBoundaryManager().getBoundary("Tubo.Wall");

    planeProbePart_1.getInputParts().setObjects(region_3, boundary_11, directBoundaryInterfaceBoundary_2, boundary_9, boundary_10);

    currentView_2.setInput(new DoubleVector(new double[] {6.214963246464804, -1.1063304820873805, -1.086151022594654}), new DoubleVector(new double[] {-34.00155983094393, 0.5163424019485705, -2.628381513754033}), new DoubleVector(new double[] {-0.028575070488342364, 0.21879268553426093, 0.97535287260729}), 0.49414638336427186, 1);

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.35, -0.1}));

    currentView_2.setInput(new DoubleVector(new double[] {6.2264362376018285, -1.1068276298122985, -1.0860007695674778}), new DoubleVector(new double[] {-34.01801269078534, 0.6780979044470397, -1.265590341742553}), new DoubleVector(new double[] {0.005284598517852881, 0.21735870025449044, 0.9760774910027297}), 0.49414638336427186, 1);

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, -0.1}));

    currentView_2.setInput(new DoubleVector(new double[] {6.391365990282259, -1.2212720002518558, -1.0649254415083447}), new DoubleVector(new double[] {-8.947657182435789, 35.38674815598249, -7.954524469281885}), new DoubleVector(new double[] {0.03302437522366439, 0.19819837907916923, 0.9796054272876792}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.170488057207849, -1.080076972177282, -1.0860464572311852}), new DoubleVector(new double[] {-34.064167474047416, -2.3298953371730704, 0.5232102726956368}), new DoubleVector(new double[] {0.03302438382716761, 0.19819834389164673, 0.9796054341169432}), 0.49414638336427186, 1);

    coordinate_11.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 1.0}));

    currentView_2.setInput(new DoubleVector(new double[] {6.263645569896011, -1.060867871304934, -1.092232478096947}), new DoubleVector(new double[] {-31.164687981286377, -15.550812057882819, 2.414266743827544}), new DoubleVector(new double[] {0.016447706957752495, 0.19483886161160988, 0.9806973493090128}), 0.49414638336427186, 1);

    coordinate_11.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 1.0, 0.0}));

    currentView_2.setInput(new DoubleVector(new double[] {6.274039380496048, -1.0572593612268242, -1.0944431366231724}), new DoubleVector(new double[] {-30.49619747968399, -12.460706826252766, 10.783589394273037}), new DoubleVector(new double[] {0.22060440352836652, 0.26608434136026893, 0.9383671032313342}), 0.49414638336427186, 1);

    coordinate_11.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));

    StreamDisplayer streamDisplayer_0 = 
      ((StreamDisplayer) scene_2.getDisplayerManager().getDisplayer("Streamline Stream 1"));

    Legend legend_1 = 
      streamDisplayer_0.getLegend();

    legend_1.setPositionCoordinate(new DoubleVector(new double[] {0.30780640124902414, 0.0680459770114943}));

    legend_1.setWidth(0.6);

    legend_1.setHeight(0.10999999999999997);

    legend_1.setOrientation(0);

    currentView_2.setInput(new DoubleVector(new double[] {6.202047566617724, -1.0790961340050562, -1.085199088530783}), new DoubleVector(new double[] {-32.3564822521852, -12.518827039057106, -3.4557733686819727}), new DoubleVector(new double[] {-0.10949663829053555, 0.16598236752889572, 0.9800307851657387}), 0.49414638336427186, 1);

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, -0.1}));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.3, -0.15}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.4, -0.15}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.3, -0.1}));
  }

  private void execute1() {

    Simulation simulation_0 = 
      getActiveSimulation();

    Scene scene_2 = 
      simulation_0.getSceneManager().getScene("Scalar Pressure");

    CurrentView currentView_2 = 
      scene_2.getCurrentView();

    currentView_2.setInput(new DoubleVector(new double[] {6.632147780158615, -0.9519686582573507, -1.0588239829442072}), new DoubleVector(new double[] {-34.0281841180806, 1.4932857621427624, -1.5071269760045398}), new DoubleVector(new double[] {-1.1317945458366035E-4, 0.1785092521322633, 0.983938226767103}), 0.49414638336427186, 1);

    PlaneProbePart planeProbePart_1 = 
      ((PlaneProbePart) simulation_0.getPartManager().getObject("presentation grid"));

    Coordinate coordinate_10 = 
      planeProbePart_1.getOriginCoordinate();

    Units units_0 = 
      ((Units) simulation_0.getUnitsManager().getObject("m"));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.3, -0.2}));

    Coordinate coordinate_12 = 
      planeProbePart_1.getPoint1Coordinate();

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.4, -0.2}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.3, -0.2}));

    currentView_2.setInput(new DoubleVector(new double[] {6.594235822886243, -0.9513387938430597, -1.062370352025366}), new DoubleVector(new double[] {-33.435646429179194, -2.2421797174303877, -8.514940537398703}), new DoubleVector(new double[] {-0.18564475838989183, 0.18116381320374617, 0.9657720727313651}), 0.49414638336427186, 1);

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.2, -0.2}));

    Coordinate coordinate_13 = 
      planeProbePart_1.getPoint2Coordinate();

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.1}));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.2}));

    currentView_2.setInput(new DoubleVector(new double[] {6.307008882715125, -1.0668129309053433, -1.0526986312844606}), new DoubleVector(new double[] {-22.83428316372905, -27.76449641866951, 8.835814592261192}), new DoubleVector(new double[] {0.06560557802329219, 0.2828237951868901, 0.9569256026506523}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.3029323304406555, -1.070844470781647, -1.0513565402687979}), new DoubleVector(new double[] {-20.897505858583152, -30.14000001641316, 7.602517835201093}), new DoubleVector(new double[] {0.036282124370697943, 0.2537995512653709, 0.966576119728108}), 0.49414638336427186, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.299443076931247, -1.0688813477405503, -1.055944325541338}), new DoubleVector(new double[] {-20.90102567490917, -30.138069555907272, 7.597939773550417}), new DoubleVector(new double[] {0.036282124370697943, 0.2537995512653709, 0.966576119728108}), 0.4447317820431511, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.296275166427982, -1.0671440062837334, -1.0600645639154944}), new DoubleVector(new double[] {-20.904193585412436, -30.136332214450455, 7.5938195351762605}), new DoubleVector(new double[] {0.036282124370697943, 0.2537995512653709, 0.966576119728108}), 0.4002586787948379, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.293424114216343, -1.0655804719710815, -1.0637728149849632}), new DoubleVector(new double[] {-20.907044637624075, -30.134768680137803, 7.590111284106792}), new DoubleVector(new double[] {0.036282124370697943, 0.2537995512653709, 0.966576119728108}), 0.3602328408977605, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.2963150138410215, -1.0625108602559459, -1.0645721465570865}), new DoubleVector(new double[] {-21.360366859098455, -30.24917835572483, 5.494882910657225}), new DoubleVector(new double[] {0.002037565698742083, 0.2174333522022382, 0.9760730432073824}), 0.3602328408977605, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.249342502663701, -1.1719763281134463, -1.029897588131385}), new DoubleVector(new double[] {5.211355940128342, -39.14087310947747, 13.704722840885035}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.3602328408977605, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.238420866825446, -1.1684795491329538, -1.0222995365775596}), new DoubleVector(new double[] {5.200428375710155, -39.13759319422874, 13.712405050922337}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.3242097996604026, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.228567267822459, -1.1654944381053696, -1.0157966711298076}), new DoubleVector(new double[] {5.190570208784926, -39.13477517492893, 13.718972759791791}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.2917889684409253, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.219684600672395, -1.1629032344243555, -1.0101459510573108}), new DoubleVector(new double[] {5.181683848421135, -39.13231906668739, 13.724675906460556}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.26261017268347453, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.211576980879636, -1.1606537018036107, -1.005236422708455}), new DoubleVector(new double[] {5.1735733129333275, -39.13017618836096, 13.729626824227518}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.23634924639288418, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.204178419980982, -1.1586968105579913, -1.0009791909150287}), new DoubleVector(new double[] {5.1661723222888, -39.128308175693945, 13.7339185472027}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.21271437043889488, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1968932673583055, -1.158666206273402, -1.001592020217906}), new DoubleVector(new double[] {5.158885517438929, -39.1283380088428, 13.733329171903415}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.19144297123670903, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.19166697489222, -1.1067329123320135, -1.0225951008954777}), new DoubleVector(new double[] {5.152235977029866, -39.12846623110178, 13.732529645850798}), new DoubleVector(new double[] {0.06277457671983575, 0.3595781929996882, 0.9310010073231523}), 0.17229869738365836, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.085406082339304, -1.2073621129132845, -0.95376711654564}), new DoubleVector(new double[] {-33.11988588226791, -1.231676569683082, 10.333676417218081}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.17229869738365836, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.084145972653317, -1.1971117714967325, -0.958700884940189}), new DoubleVector(new double[] {-33.12129995522622, -1.2214263237519387, 10.32878697579205}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.18952849462570578, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.082590975701635, -1.1858365004799138, -0.9640793355881705}), new DoubleVector(new double[] {-33.1228549521779, -1.21015105273512, 10.32340852514407}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.20848126434235661, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.080880291417799, -1.1734337023677177, -0.9699956585506051}), new DoubleVector(new double[] {-33.12456563646174, -1.197748254622924, 10.317492202181635}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.22932932254955368, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.078998202788711, -1.1597906250141858, -0.9765034852915768}), new DoubleVector(new double[] {-33.12644772509083, -1.184105177269392, 10.310984375440663}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.25226217975478893, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.076928221706169, -1.144783239898401, -0.9836622074697097}), new DoubleVector(new double[] {-33.12851770617337, -1.1690977921536072, 10.30382565326253}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.27748831517560024, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.074919888875783, -1.134823993276043, -0.9913199447468237}), new DoubleVector(new double[] {-33.1307129944058, -1.159138661477817, 10.296221741590026}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.30523702734330266, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.072505017132002, -1.1238689500111199, -0.9996842924773723}), new DoubleVector(new double[] {-33.13312786614958, -1.1481836182128937, 10.287857393859477}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.3357605987928409, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.069848627367591, -1.1118184022462247, -1.0088850125834092}), new DoubleVector(new double[] {-33.13578425591399, -1.1361330704479986, 10.27865667375344}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.3693365142589103, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.066926639306061, -1.0985627994382283, -1.019005789986199}), new DoubleVector(new double[] {-33.13870624397552, -1.1228774676400022, 10.26853589635065}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.40627004136390854, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.0637125884851315, -1.0839816368278785, -1.030138654257275}), new DoubleVector(new double[] {-33.14192029479645, -1.1082963050296524, 10.257403032079575}), new DoubleVector(new double[] {0.23553103113090845, 0.522897249563657, 0.8192091306700467}), 0.4468968707604314, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.219482860509313, -1.074083099729494, -1.0491326308017408}), new DoubleVector(new double[] {5.108762342935641, 13.34507361260085, 37.303943712246465}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.4468968707604314, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.206920710863417, -1.0891352408919879, -1.0432013629102386}), new DoubleVector(new double[] {5.096216319092974, 13.329812129411998, 37.30931815764974}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.4022078241949614, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.195629290287466, -1.1028706067560101, -1.0383643129842568}), new DoubleVector(new double[] {5.0849248985170235, 13.316076763547976, 37.31415520757572}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.3619875808034034, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.18546701265156, -1.1152324431858283, -1.034011014355272}), new DoubleVector(new double[] {5.074762620881117, 13.303714927118158, 37.31850850620471}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.32578930784892973, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.176688240007436, -1.1254933307244546, -1.0306600502280574}), new DoubleVector(new double[] {5.065977439263914, 13.293537239615652, 37.32208077157726}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.29321057717760013, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1687815916214745, -1.1346533770547769, -1.0274453820588647}), new DoubleVector(new double[] {5.058070790877953, 13.28437719328533, 37.325295439746455}), new DoubleVector(new double[] {0.9616266866166824, 0.264823164844191, -0.07171336659596751}), 0.26388969956217007, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.168800249938815, -1.134849564176505, -1.0279746750549235}), new DoubleVector(new double[] {4.762787857336536, 13.064488434509371, 37.397365926340115}), new DoubleVector(new double[] {0.9613665181913909, 0.26778161508523385, -0.06377636178793604}), 0.26388969956217007, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.177635992324029, -1.1489537312390077, -1.0228341778918875}), new DoubleVector(new double[] {4.771610907058281, 13.05051245082538, 37.40285330516616}), new DoubleVector(new double[] {0.9613665181913909, 0.26778161508523385, -0.06377636178793604}), 0.2902784509434272, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.187341338344697, -1.16432715944892, -1.0167977509028887}), new DoubleVector(new double[] {4.781316253078949, 13.035139022615468, 37.40888973215516}), new DoubleVector(new double[] {0.9613665181913909, 0.26778161508523385, -0.06377636178793604}), 0.3193060556054951, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.198017228251607, -1.1812380758416516, -1.0101580950840443}), new DoubleVector(new double[] {4.791992142985859, 13.018228106222736, 37.415529387974004}), new DoubleVector(new double[] {0.9613665181913909, 0.26778161508523385, -0.06377636178793604}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.218110850090756, -1.0773967267638498, -1.2507092248082357}), new DoubleVector(new double[] {3.0819580744450747, -38.67303395861266, 14.778064930447938}), new DoubleVector(new double[] {0.9251028547016268, 0.08099491813942339, 0.3709778045361865}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.048105945736414, -1.169537179644408, -1.132083235866083}), new DoubleVector(new double[] {-29.75875560900549, 15.40097494621307, 9.98137423785666}), new DoubleVector(new double[] {0.12582246016864734, -0.35053956628845684, 0.9280574987485474}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.101173987255226, -1.1797730397429975, -1.1464800058153832}), new DoubleVector(new double[] {-33.74694904712863, -3.064706327246469, 8.277908050907712}), new DoubleVector(new double[] {0.23032439719420308, -0.3708247588029853, 0.8996886518767672}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.193894647448763, -1.1676669198777987, -1.1583862973864616}), new DoubleVector(new double[] {-33.919652982277384, -9.546898633559938, -0.08627994754629247}), new DoubleVector(new double[] {0.10529757221139363, -0.3868733256778305, 0.9161012232091832}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.695037283500777, -1.0538597037547057, -1.1727037432898086}), new DoubleVector(new double[] {-20.872837002042655, -31.87476397267362, 2.1006794449430295}), new DoubleVector(new double[] {0.36918617107532303, -0.23471608792527354, 0.8992274068086435}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.389760941552837, -0.7727118223467357, -1.1128970313418955}), new DoubleVector(new double[] {-21.178972791189977, -31.594576953883553, 2.160588206834456}), new DoubleVector(new double[] {0.36918617107532303, -0.23471608792527354, 0.8992274068086435}), 0.3512363966907414, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.063655934339342, -1.161120023304745, -1.064250131250659}), new DoubleVector(new double[] {3.137557345916021, -39.28236532773546, 13.803141191605302}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.3512363966907414, 1);

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.15}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.2, -0.15}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.2, -0.18}));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.18}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.13}));

    currentView_2.setInput(new DoubleVector(new double[] {6.064112132093037, -1.1186422871005632, -1.0772033675658168}), new DoubleVector(new double[] {3.1348607189732207, -39.28096262712047, 13.806207333010573}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.31611279617357496, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.061685220378045, -1.1173793334945756, -1.0744440052695428}), new DoubleVector(new double[] {3.1324338072582294, -39.279699673514486, 13.808966695306847}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.28450155179293873, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.0595009549617345, -1.1162431848510224, -1.0719604396623073}), new DoubleVector(new double[] {3.1302495418419185, -39.27856352487093, 13.811450260914082}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.2560514283266979, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.057535144778726, -1.115220080335611, -1.0697253598214775}), new DoubleVector(new double[] {3.1282837316589096, -39.27754042035552, 13.813685340754912}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.23044629025098667, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.048203149870933, -1.207467037862699, -1.0308367695959113}), new DoubleVector(new double[] {3.126119127389798, -39.27641053206791, 13.816156702316132}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.20740168483059007, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.046174298066781, -1.2063734134525035, -1.0284736549515294}), new DoubleVector(new double[] {3.1240891871849557, -39.27533108735413, 13.818525347081415}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.1866615260039976, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.041294088105202, -1.2454606161383452, -1.0105497737163063}), new DoubleVector(new double[] {3.1222880627731784, -39.27430392888287, 13.820804516287264}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.16799538906357583, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.067658051057685, -0.887549740354153, -1.146582087501109}), new DoubleVector(new double[] {3.121277115790767, -39.27303368747222, 13.82386303834792}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.1511958579144593, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.0667481935528125, -0.8864065760461628, -1.143829456477441}), new DoubleVector(new double[] {3.1203672582858943, -39.27189052316423, 13.826615669371588}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.13607627910453068, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.06592932253819, -0.8853776142375622, -1.1413520797033456}), new DoubleVector(new double[] {3.1195483872712715, -39.27086156135563, 13.829093046145683}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.12246867004417532, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.065192348305488, -0.8844516492551335, -1.1391224198329368}), new DoubleVector(new double[] {3.11881141303857, -39.2699355963732, 13.831322706016092}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.11022180869478797, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.0645290752160514, -0.8836181906813962, -1.137115681333988}), new DoubleVector(new double[] {3.1181481399491333, -39.269102137799464, 13.83332944451504}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.09919963291483659, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.063932112293927, -0.8828681786103445, -1.1353096912786427}), new DoubleVector(new double[] {3.1175511770270092, -39.26835212572841, 13.835135434570386}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.08927967420392785, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.063394843423546, -0.8821930299731306, -1.1336841840876772}), new DoubleVector(new double[] {3.1170139081566277, -39.2676769770912, 13.836760941761352}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.08035170266101743, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.062911342152952, -0.8815851490968711, -1.1322214511839306}), new DoubleVector(new double[] {3.1165304068860338, -39.26706909621494, 13.838223674665098}), new DoubleVector(new double[] {0.5848564591962321, 0.25536700575679017, 0.7698900015633777}), 0.07231653610518138, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.062852739786482, -0.8821734554586385, -1.1319747445654122}), new DoubleVector(new double[] {1.4559774804600238, -38.32347002046932, 15.695585316600486}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.07231653610518138, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.038987309053308, -1.0773800979652606, -1.0440512429206095}), new DoubleVector(new double[] {1.4561375175192801, -38.32341531681546, 15.695750852266883}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.0795481937437937, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039163349959686, -1.077319910684082, -1.0438691371629645}), new DoubleVector(new double[] {1.4563135584256586, -38.323355129534285, 15.695932958024528}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.08750301016423717, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039356974236274, -1.077253524519847, -1.0436687923840182}), new DoubleVector(new double[] {1.4565071827022458, -38.32328874337005, 15.696133302803474}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.09625331605465494, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039569970022413, -1.077180701053976, -1.0434484204444274}), new DoubleVector(new double[] {1.456720178488385, -38.32321591990418, 15.696353674743065}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.10587865302151415, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039804274469059, -1.077100486612153, -1.0432059947862697}), new DoubleVector(new double[] {1.4569544829350314, -38.323135705462356, 15.696596100401223}), new DoubleVector(new double[] {0.5864068854102288, 0.27093165914001455, 0.7633629548380728}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864124, -1.0769313725612588, -1.0432745644315782}), new DoubleVector(new double[] {6.13741675574113, -39.68008247790661, 13.03785244562883}), new DoubleVector(new double[] {0.5868704525514056, 0.2787709258490339, 0.7601775074437425}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864124, -1.0769313725612588, -1.0432745644315782}), new DoubleVector(new double[] {6.039814053864124, -42.168182745852285, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864124, -1.0769313725612586, -1.0432745644315782}), new DoubleVector(new double[] {6.039814053864124, 40.014320000729754, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864124, -1.0769313725612586, -1.0432745644315782}), new DoubleVector(new double[] {6.039814053864124, -42.16818274585229, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864122, -1.0769313725612584, -1.0432745644315782}), new DoubleVector(new double[] {6.039814053864124, 40.01432000072978, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864122, -1.0769313725612584, -1.0432745644315782}), new DoubleVector(new double[] {-35.05143731942691, -1.0769313725612584, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.039814053864122, -1.0769313725612581, -1.0432745644315782}), new DoubleVector(new double[] {47.13106542715517, -1.0769313725612584, -1.0432745644315782}), new DoubleVector(new double[] {0.0, 0.0, 1.0}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.192376509415006, -1.2365360534662728, -1.0292352164767191}), new DoubleVector(new double[] {4.101306963574412, -42.116993013456764, 2.56674302526725}), new DoubleVector(new double[] {-0.08751138217675256, 0.09172977742897369, 0.9919311497893115}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.192108036349678, -1.242719234157684, -1.027822035469011}), new DoubleVector(new double[] {4.868012902822637, -39.51834263723958, 13.863664594497905}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.11646651439197664, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.203830876513163, -1.2436454685855907, -1.029644586911946}), new DoubleVector(new double[] {4.879730088640785, -39.51943232185112, 13.86190563486636}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.12811311717734294, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.216719777888886, -1.244844110487783, -1.031579380245578}), new DoubleVector(new double[] {4.892618990016508, -39.52063096375331, 13.859970841532729}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.14092438726903733, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.230897570103232, -1.2461626769352634, -1.0337076502561509}), new DoubleVector(new double[] {4.906796782230853, -39.52194953020079, 13.857842571522156}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.15501676712484486, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.215301999456517, -1.2447122650135398, -1.0313665916637298}), new DoubleVector(new double[] {4.891201211584138, -39.52049911827907, 13.860183630114577}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.13951516956124854, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.20126598434035, -1.24340681158791, -1.029259540906697}), new DoubleVector(new double[] {4.877165196467971, -39.51919366485344, 13.86229068087161}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.12556372383916345, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.188633569201676, -1.2422320115436278, -1.0273632521735898}), new DoubleVector(new double[] {4.864532781329298, -39.51801886480916, 13.864186969604717}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.11300740390943341, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.177264400003211, -1.2411745134402636, -1.025656625420158}), new DoubleVector(new double[] {4.853163612130833, -39.51696136670579, 13.865893596358148}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.1017067212181218, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.167032144700353, -1.2402228731860205, -1.0241205871600734}), new DoubleVector(new double[] {4.842931356827974, -39.51600972645155, 13.867429634618233}), new DoubleVector(new double[] {-0.07577224098067342, 0.3638173701949829, 0.9283832660281924}), 0.09153609158424435, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.167067558469682, -1.2389625902462498, -1.0246048411733875}), new DoubleVector(new double[] {5.294201209038405, -39.639170277424185, 13.577445350231919}), new DoubleVector(new double[] {-0.07599878764372532, 0.3559107120223631, 0.9314245805992125}), 0.09153609158424435, 1);

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.12}));

    coordinate_13.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.125}));

    coordinate_12.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, -0.2, -0.188}));

    coordinate_10.setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.2, -0.188}));

    currentView_2.setInput(new DoubleVector(new double[] {6.106763088340246, -1.3017150267364301, -1.0043278106057651}), new DoubleVector(new double[] {-34.68576616977856, -6.217305308615654, -1.6122541332458222}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.09153609158424435, 1);

    planeProbePart_1.setXResolution(20);

    currentView_2.setInput(new DoubleVector(new double[] {6.106920435009897, -1.3019605569611175, -1.0100611731338316}), new DoubleVector(new double[] {-34.68565047883959, -6.217555858448311, -1.617988116564402}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.10068968714660034, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.10705912940513, -1.3019672923925159, -1.01622681723584}), new DoubleVector(new double[] {-34.68555722705963, -6.217568069815673, -1.6241544378924242}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.11075864838343208, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.107191057689121, -1.301801419822775, -1.0228057627938583}), new DoubleVector(new double[] {-34.68547831516014, -6.217408585837891, -1.6307341735474592}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.12183450088337545, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1073276570005035, -1.3015489836839187, -1.0298700502639648}), new DoubleVector(new double[] {-34.68540230600246, -6.2171634509469875, -1.6377993639855848}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.1340179306133856, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.107460821107594, -1.3011562205863614, -1.037356111292507}), new DoubleVector(new double[] {-34.68533730581828, -6.216778901753376, -1.645286440853148}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.1474197037688403, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1076124775665335, -1.3007953930807927, -1.0453180900409684}), new DoubleVector(new double[] {-34.68526138705147, -6.216427200807747, -1.653249548311633}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.1621616522492957, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.107818573423081, -1.301191098169844, -1.052078929228373}), new DoubleVector(new double[] {-34.68511209446402, -6.216829750816753, -1.6600112340315551}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.17837780091507643, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1079831247995955, -1.301633881314074, -1.0595167849397884}), new DoubleVector(new double[] {-34.6849475430875, -6.217272533960983, -1.6674490897429706}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.19621556279152202, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1081638886394884, -1.302120950709372, -1.0676984246616141}), new DoubleVector(new double[] {-34.68476677924761, -6.217759603356281, -1.6756307294647963}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.21583708081904748, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.108362298930807, -1.3026567741404511, -1.0766982345943867}), new DoubleVector(new double[] {-34.68456836895629, -6.2182954267873605, -1.684630539397569}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.23742078689729593, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.108581209743356, -1.3032461251061838, -1.086598015454766}), new DoubleVector(new double[] {-34.68434945814374, -6.218884777753093, -1.6945303202579483}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.26116284134278467, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.108822055065183, -1.3038944250655993, -1.0974877773108005}), new DoubleVector(new double[] {-34.684108612821916, -6.219533077712509, -1.7054200821139827}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.28727912305263925, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.109086742244919, -1.304607545076208, -1.1094665160268813}), new DoubleVector(new double[] {-34.68384392564218, -6.220246197723117, -1.7173988208300635}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.31600700602237475, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.109729054800937, -1.3067684955580923, -1.1219344474310626}), new DoubleVector(new double[] {-34.68339474420108, -6.222430420932849, -1.729869630444805}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.34760755408060073, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.1102235322954925, -1.3091710829476035, -1.1356523281716797}), new DoubleVector(new double[] {-34.682900266706525, -6.22483300832236, -1.743587511185422}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.3823681416903218, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.110766654133329, -1.3118140507422034, -1.1507420090195162}), new DoubleVector(new double[] {-34.68235714486869, -6.22747597611696, -1.7586771920332585}), new DoubleVector(new double[] {-0.05883342570097675, 0.373756052041219, 0.9256592470141749}), 0.4206048067770489, 1);

    currentView_2.setInput(new DoubleVector(new double[] {6.102299661503528, -1.313440677813064, -1.150087459161011}), new DoubleVector(new double[] {-32.964582840082414, -11.938512154450615, 5.887122775362431}), new DoubleVector(new double[] {0.05726225414124221, 0.396348205216539, 0.916312792921878}), 0.4206048067770489, 1);
  }
}
