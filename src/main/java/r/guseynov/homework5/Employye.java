package r.guseynov.homework5;

public class Employye {
    private String name;
    private String post;
    private String mail;
    private String phone;
    private double salary;
    private int age;

    public Employye(String name, String post, String mail, String phone, double salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void print() {
        System.out.println("Employye name: " + name + " Post: " + post + " email: " + mail + " Phone number:" + phone + " Salary: " + salary + " Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employye[] employyes = new Employye[5];
        employyes[0] = new Employye("E1", "Генеральный директор", "vk@11.ru", "+79996665544", 250000, 55);
        employyes[1] = new Employye("E2", "Директор по развитию", "vz@10.ru", "+79998884455", 127000, 42);
        employyes[2] = new Employye("E3", "Охранник", "dm@p9.ru", "+79997771234", 19000, 21);
        employyes[3] = new Employye("E4", "Ведущий разработчик", "ol@8.ru", "+79995554789", 120000, 28);
        employyes[4] = new Employye("E5", "Директор по работе с клиентами", "kv@7.ru", "+79994445896", 138000, 48);
        for (int i = 0; i < employyes.length; i++) {
            if (employyes[i].getAge() > 40) employyes[i].print();
        }
    }
}

