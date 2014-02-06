/**
 * Simple macro to generate a surface wrap, followed by a volume mesh in a case
 * already defined.
 * 
 * Requirement: MacroUtils v3, available at macrohut.cd-adapco.com
 * 
 * @author Pablo Fernandez (pfernandez@theansweris27.com)
 */

import macroutils.*;

public class wrapMeshRun extends MacroUtils {
    
    private int xres = 1280;
    private int yres = 720;

    public void execute() {
        _initUtils();
        clearSolutionHistory();
        executeWrapAndMesh();
        runCase(true);
        saveSimWithSuffix("@finished");
        postProcessing();
    }
    
    // Generate volume mesh and save simulation.
    void executeWrapAndMesh() {
        genVolumeMesh();
        saveSimWithSuffix("@meshed");
    }
    
    // Create elements for post-processing.
    void postProcessing() {
        hardCopyPictures(xres, yres, "\\imagenes\\" + simTitle);
    }
}