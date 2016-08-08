package com.test;

import com.models.GrandParents;
import com.models.Kids;
import com.models.Member;
import com.models.Parents;
import com.service.Life;

import java.util.Scanner;

public class Picnic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Life life = new Life();

        System.out.println("Введіть кількість бабусь і дідусів: ");
        String a = scanner.next();
        int countGR = Integer.parseInt(a);

        System.out.println("Введіть кількість батьків: ");
        String b = scanner.next();
        int countPar = Integer.parseInt(b);

        System.out.println("Введіть кількість дітей: ");
        String c = scanner.next();
        int countKids = Integer.parseInt(c);


        for (int i = 0; i < countGR; i++) {
            GrandParents grandParents = new GrandParents();
            System.out.println("Введіть ім'я бабусі/дідуся:");
            String name = scanner.next();
            grandParents.setName(name);

            System.out.println("Введіть стать бабусі/дідуся:");
            String gender = scanner.next();
            grandParents.setGender(gender);

            life.add(grandParents);

        }


        for (int i = 0; i < countPar; i++) {
            Parents parents = new Parents();
            System.out.println("Введіть ім'я батька/матері:");
            String name = scanner.next();
            parents.setName(name);

            System.out.println("Введіть стать батька/матері:");
            String gender = scanner.next();
            parents.setGender(gender);

            life.add(parents);
        }

        for (int i = 0; i < countKids; i++) {
            Kids kids = new Kids();
            System.out.println("Введіть ім'я дитини:");
            String name = scanner.next();
            kids.setName(name);

            System.out.println("Введіть стать дитини:");
            String gender = scanner.next();
            kids.setGender(gender);

            life.add(kids);
        }
        System.out.println("Робота:");
        for (Member member : life.getFamilyDB()) {
            System.out.print(member.getName());
            member.work();
        }

        System.out.println("Відпочинок:");
        for (Member member : life.getFamilyDB()) {
            System.out.print(member.getName());
            member.relax();
        }

    }
}
