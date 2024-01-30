package model;

public class Patient {
    public String pId;
    String name;
    int age;
    long phone;
    String disease;
    Doctor doctor;
    Room room;
    boolean isAadmited;
    String gender;

    public Patient(String pId, String name, int age, long phone, String disease, Doctor doctor, Room room, boolean isAadmited, String gender) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
        this.isAadmited = isAadmited;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                ", isAadmited=" + isAadmited +
                ", gender='" + gender + '\'' +
                '}';
    }
}
