package com.youxu.composite;

import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {

        Branch boss = initCorpTree();

        System.out.println(getCorpTreeInfo(boss));

    }

    private static String getCorpTreeInfo(Branch root) {
        List<Corp> subList = root.getSubList();
        String info = root.getCorpInfo() + "\n";
        for (Corp corp : subList){
            if (corp instanceof Branch) {
                info = info + getCorpTreeInfo((Branch) corp);
            } else {
                info = info + corp.getCorpInfo() + "\n";
            }
        }
        return info;
    }

    private static Branch initCorpTree() {
        Branch boss = new Branch("张老板","CEO",100000);
        Branch manager1 = new Branch("主管1","Manager",50000);
        Branch manager2 = new Branch("主管2","Manager",50000);
        Leaf corp1 = new Leaf("职员1","Employee",20000);
        Leaf corp2 = new Leaf("职员2","Employee",30000);
        Leaf corp3 = new Leaf("职员3","Employee",14000);
        Leaf corp4 = new Leaf("职员4","Employee",17000);
        boss.addSub(manager1);
        boss.addSub(manager2);
        manager1.addSub(corp1);
        manager1.addSub(corp2);
        manager2.addSub(corp3);
        manager2.addSub(corp4);
        return boss;
    }
}
