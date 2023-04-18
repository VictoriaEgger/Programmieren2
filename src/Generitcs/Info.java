package Generitcs;

public class Info <T>{ // der datentyp der übergeben wird. Egal welchen ich will
    //Dadurch muss ich nicht für jede art von typ eine eigene klasse machen.

    private T data;
    private int securityLevel;

    public Info(T data, int securityLevel) {
        this.data = data;
        this.securityLevel = securityLevel;
    }

    public T getData() {
        return data;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
