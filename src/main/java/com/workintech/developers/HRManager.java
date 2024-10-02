package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;
    public HRManager(long id, String name, double salary){
        super(id,name,salary);
        this.juniorDeveloper = new JuniorDeveloper[5];
        this.midDeveloper = new MidDeveloper[5];
        this.seniorDeveloper = new SeniorDeveloper[5];
    }
}
