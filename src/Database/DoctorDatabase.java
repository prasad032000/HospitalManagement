package Database;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String, Doctor>hashMapDoctor;

    public DoctorDatabase(){
        hashMapDoctor=new HashMap<>();
    }

    public void addDoctorToDB(Doctor d){
        String docId=d.docId;
        hashMapDoctor.put(docId,d);
    }
    public int getTotalDocotr(){
        return hashMapDoctor.size();
    }
    public Doctor getDocFromId(String docID){
        return hashMapDoctor.get(docID);
    }
    public Doctor getDocWithMinPatient() {
        Doctor minDoc = null;
        int max = Integer.MAX_VALUE;
        for (String str : hashMapDoctor.keySet()) {
            Doctor doc = hashMapDoctor.get(str);
            List<Patient> patientList = doc.getList();
            if (patientList.size() < max) {
                minDoc = doc;
                max = patientList.size();
            }
        }
        return minDoc;
    }
}
