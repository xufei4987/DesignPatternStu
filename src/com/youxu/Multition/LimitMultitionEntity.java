package com.youxu.Multition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LimitMultitionEntity {
    private String id;
    private static final int capacity = 2;
    private static List<LimitMultitionEntity> list = new ArrayList<>(capacity);
    private LimitMultitionEntity(){
    }
    private LimitMultitionEntity(String id){
        this.id = id;
    }
    static {
        LimitMultitionEntity entity1 = new LimitMultitionEntity("001");
        LimitMultitionEntity entity2 = new LimitMultitionEntity("002");
        list.add(entity1);
        list.add(entity2);
    }
    public static LimitMultitionEntity getInstence(){
        int index = new Random().nextInt(capacity);
        return list.get(index);
    }

    @Override
    public String toString() {
        return "LimitMultitionEntity{" +
                "id='" + id + '\'' +
                '}';
    }
}
