package com.test.mvc;

/**
 * mvc设计模式可以这样理解，controller是数据显示的和查询的中介，经过这个中介，数据得以显示，
 * 我们理解的spring mvc框架，从service查询到的可以理解成model也就是数据模型，如何展示也就是view
 * 可以理解成我们的json文本或者jsp文件。
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}