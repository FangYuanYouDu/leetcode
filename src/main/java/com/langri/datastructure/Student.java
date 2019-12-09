package com.langri.datastructure;

/**
 * @author fy
 * @version 1.0.0
 * @date 2019/12/10 3:31
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return String.format("Student(Name: %s ,StudentScore: %d)",name,score);
    }

    public static void main(String[] args) {
        Array<Student> studentArray = new Array<Student>();
        studentArray.addLast(new Student("aaa",77));
        studentArray.addLast(new Student("bbb",88));
        studentArray.addLast(new Student("ccc",99));

        System.out.println(studentArray);
    }
}
