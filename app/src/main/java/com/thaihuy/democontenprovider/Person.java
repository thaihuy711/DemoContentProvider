package com.thaihuy.democontenprovider;

public class Person {
    private String mName;
    private int mPhone;

    public Person(String mName, int mPhone) {
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmPhone() {
        return mPhone;
    }

    public void setmPhone(int mPhone) {
        this.mPhone = mPhone;
    }
}
