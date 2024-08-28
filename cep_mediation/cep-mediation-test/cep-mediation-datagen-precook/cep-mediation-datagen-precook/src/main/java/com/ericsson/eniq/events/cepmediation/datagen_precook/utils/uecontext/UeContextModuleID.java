/**
 * 
 */
package com.ericsson.eniq.events.cepmediation.datagen_precook.utils.uecontext;

/**
 * @author eikrwaq
 * 
 */
public class UeContextModuleID {
    private short ueContext;

    private int moduleID;

    public UeContextModuleID(short ueContext, int moduleID) {
        this.ueContext = (ueContext == -1 ? (short) 3276600 : ueContext);
        this.moduleID = (moduleID == -1 ? 99 : moduleID);
    }

    public short getUeContext() {
        return ueContext;
    }

    public void setUeContext(short ueContext) {
        this.ueContext = ueContext;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int i) {
        this.moduleID = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UeContextModuleID) {
            UeContextModuleID anotherObj = (UeContextModuleID) obj;
            return (this.ueContext == anotherObj.ueContext && this.ueContext == anotherObj.ueContext);
        }
        return false;
    }

    @Override
    public int hashCode() {

        String hascode = "" + this.ueContext + "" + this.moduleID;

        return Integer.parseInt(hascode);
    }

    @Override
    public String toString() {
        return new String(ueContext + "," + moduleID);
    }

}
