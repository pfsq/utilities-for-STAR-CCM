/**
 * Simple macro to generate a surface wrap, followed by a volume mesh in a case
 * already defined.
 * 
 * @author Pablo Fernandez (pfernandez@theansweris27.com)
 */

import macroutils.*;

public class wrapMeshRun extends MacroUtils {
    
    public void execute() {
        _initUtils();
        executeWrapAndMesh();
        runCase(true);
        saveSim(simTitle);
    }
    
    void executeWrapAndMesh() {
        genVolumeMesh();
        saveSimWithSuffix("@meshed");
    }
}