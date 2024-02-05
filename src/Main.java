import model.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hos = new Hospital("Mediplus" , "Gajanan Nager,Nandgaon Khandeshwar", 976309532,"pokalePrasad@gmail.com");
        hos.appointDoctor("MD","Amol Kavake", (long)99999999, "Neuro",56456,"10 to 8");
        hos.createRoom();
        hos.admitPatient("Mona",27,876647493 ,"xxx","Female", "Fever" );

    }
}