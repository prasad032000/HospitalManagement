package model;

import Database.DoctorDatabase;
import Database.PatientDatabase;
import Database.RoomDatatbase;

public class Hospital {
    private String name;
    private String address;
    private long phoneNo;
    private String emailId;
    private DoctorDatabase docDB=new DoctorDatabase();
    private PatientDatabase patientDB = new PatientDatabase();
    private RoomDatatbase roomDB = new RoomDatatbase();

    public Hospital(String name, String address, long phoneNo, String emailId) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailId = emailId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void admitPatient(String name, int age,long phoneNo,String email,String gender,String disease){
        //First create a patient and admit it
        //For creeating a patient we need Doctor to assign and room must be allocated to patient

        Doctor doc = docDB.getDocWithMinPatient();
        Room room = roomDB.getUnoccupiedRoom();
        String pID="PID"+(patientDB.getTotalPatient()+1);
        Patient p =new Patient(pID,name,age,phoneNo,disease,doc,room,true,gender);
        room.setOccupied(true);
        room.setDoctor(doc);
        room.setPatient(p);
        System.out.println("Patient Admitted Successfully ->" +p);
    }
    public void appointDoctor(String degree,String name,Long phoneNo,String speciality,int salary,String timeSlot){
        String docId = "DOCID"+ (docDB.getTotalDocotr()+1);
        Doctor doc = new Doctor(docId,name,degree,speciality,salary,phoneNo,timeSlot);
        System.out.println("Doctor created successfully");
        docDB.addDoctorToDB(doc);
    }

    public void createRoom(){
        String roomId="ROOMID"+(roomDB.getTotalRooms()+1);
        Room room = new Room(roomId,false,null,null);
        roomDB.addRoomToDB(room);
        System.out.println("Room Added Successfully");
    }


}
