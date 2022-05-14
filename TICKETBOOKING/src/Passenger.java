import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Passenger {
    private String full_name;
    private int age;
    private String phno;



    public Passenger() {
        
        
        this.full_name = full_name;
        this.age = age;
        this.phno = phno;

    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }



    @Override
    public String toString() {
        return "Passenger{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                ", phno='" + phno + '\'' +
                '}';
    }


}
