package Generitcs;

public class Profil {

    private Info name;
    private Info age;
    private Info adresse;

    public Profil(Info name, Info age, Info adresse) {
        this.name = name;
        this.age = age;
        this.adresse = adresse;
    }

    private String checkSecrurityLevel(Info info){
        switch (info.getSecurityLevel()){
            case 1:
                return "Zugriff gestattet" + info.getData();
            case 2:
                return "Zugriff nicht gestattet";
            case 3:
                return "Nicht erfasst";
            default:
                return "Ungültiger status";
        }
    }

    public void print(){
        System.out.println("Name: ");
        System.out.println("\t" + checkSecrurityLevel(name));

        System.out.println("Name: ");
        System.out.println("\t" + checkSecrurityLevel(age));

        System.out.println("Name: ");
        System.out.println("\t" + checkSecrurityLevel(adresse));
    }
}
