package com.service;

import com.models.Member;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Life {
    private Member familyDB[] = new Member[0];

    public Member[] getFamilyDB() {
        return familyDB;
    }

    public void setFamilyDB(Member[] familyDB) {
        this.familyDB = familyDB;
    }

    public void add(Member member){
        familyDB = Arrays.copyOf(familyDB, familyDB.length + 1);
        familyDB[familyDB.length - 1] = member;
    }

    public Member getByName(String name){
        for(Member mem: familyDB){
            if(name.equals(mem.getName())){
                return mem;
            }
        }
        return null;
    }

    public void remove(String name){

        Member tempFamilyDB [] = new Member[familyDB.length - 1];

        for(int i = 0; i < familyDB.length; i++){
            if(name.equals(familyDB[i].getName())){
                System.arraycopy(familyDB, 0, tempFamilyDB, 0, i - 1);
                System.arraycopy(familyDB, i + 1, tempFamilyDB, i, familyDB.length - i);
            }
        }
    }

}