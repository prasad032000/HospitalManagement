package Database;

import model.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<String , Patient>hmapPatient;

    public PatientDatabase(){
        hmapPatient=new HashMap<>();
    }
    public void addPatientToDB(Patient p){
        String pId=p.pId;
        hmapPatient.put(pId,p);
    }
    public Patient getPatFromId(String pID){
        return hmapPatient.get(pID);
    }
    public int getTotalPatient(){
        return hmapPatient.size();
    }
}
