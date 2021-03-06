package tools;

import objects.Family;
import objects.Individual;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class us30 {
    private Set<String> AllMarriedLivingInfo;

    public us30() {
        this.AllMarriedLivingInfo = new HashSet<>();
    }

    public Set<String> getError() {
        return this.AllMarriedLivingInfo;
    }

    // US30: List living married; List all living married people in a GEDCOM file (Zhe Sun)
    public void US30(Family _Fam, Map<String, Individual> _indis){
        String messageStr = "";
        String husID = _Fam.getHusbandID();
        String husName = _Fam.getHusbandName();
        String wifeID = _Fam.getWifeID();
        String wifeName = _Fam.getWifeName();

        if (_indis.get(husID).getAlive()){
            messageStr += "\t" + husID + ": " + husName + " in family " + _Fam.getId() + " is living right now";
            this.AllMarriedLivingInfo.add(messageStr);
            messageStr = "";
        }

        if (_indis.get(husID).getAlive() != null && _indis.get(wifeID).getAlive()){
            messageStr += "\t" + wifeID + ": " + wifeName + " in family " + _Fam.getId() + " is living right now";
            this.AllMarriedLivingInfo.add(messageStr);
        }
    }

}
