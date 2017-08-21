package DesignPatterns.Creational.ObjectPool;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 丛子涵 on 2017/8/21
 */
public abstract class ObjectPool<T> {

    private long expiationTime;

    private Map<T,Long> locked,unlocked;

    public ObjectPool(){
        expiationTime = 30000;
        locked = new ConcurrentHashMap<T, Long>();
        unlocked = new ConcurrentHashMap<T, Long>();
    }

    protected abstract T create();

    public abstract boolean validate(T object);

    public abstract void expire(T object);

    public synchronized T acquire(){
        long now = System.currentTimeMillis();
        T obj;
        if(unlocked.size() > 0){
            Iterator<T> e = unlocked.keySet().iterator();
            while(e.hasNext()){
                obj = e.next();
                unlocked.remove(obj);
                if(validate(obj)){
                    if((now - unlocked.get(obj)) > expiationTime){
                        // object has expired
                        expire(obj);
                    }
                    else {
                        locked.put(obj, now);
                        return obj;
                    }
                }
                else{
                    // object failed validation
                    expire(obj);
                }
            }
        }
        // no objects available, create a new one
        obj = create();
        locked.put(obj,now);
        return obj;
    }

    public synchronized void release(T obj){
        locked.remove(obj);
        unlocked.put(obj,System.currentTimeMillis());
    }
}
