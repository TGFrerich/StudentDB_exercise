package main.java;

import java.util.Arrays;

public class ComputerScienceStudent extends Student{

    private String[] programmingLanguages;
      public ComputerScienceStudent(String name, int id, String[] programmingLanguages) {
        super(name, id);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +super.toString()+
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                '}';
    }
}
