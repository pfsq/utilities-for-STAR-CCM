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
    
    public void execute() {
        _initUtils();
        clearSolutionHistory();
        executeWrapAndMesh();
        runCase(true);
        saveSimWithSuffix("@finished");
    }
    
    // Generate volume mesh and save simulation.
    void executeWrapAndMesh() {
        genVolumeMesh();
        saveSimWithSuffix("@meshed");
    }
}