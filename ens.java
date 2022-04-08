package OOP;

class  Encapsul{
    private String geekname;
    private int geekRoll;
    private int geekAge;


    public String getGeekname() {
        return geekname;
    }

    public void setGeekname(String geekname) {
        this.geekname = geekname;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }

}

public  class  ens{
    public static void main(String[] args) {
       Encapsul obj = new Encapsul();
        obj.setGeekAge(19);
        obj.setGeekname("Harsh");
        obj.setGeekRoll(51);
        System.out.println("Geek's name: " + obj.getGeekname());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());
    }
}
