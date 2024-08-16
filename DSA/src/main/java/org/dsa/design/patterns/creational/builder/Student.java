package org.dsa.design.patterns.creational.builder;

public class Student {
    private String name;
    private String address;
    private Integer id;

    public Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }


    public static class StudentBuilder{
        private String name;
        private String address;
        private Integer id;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }
        public StudentBuilder id(int id){
            this.id = id;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
