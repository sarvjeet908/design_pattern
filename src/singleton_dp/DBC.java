package singleton_dp;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.locks.Lock;

public class DBC {
    private static DBC dbc=null;
    static Lock lock;
    private DBC(){
        //method so that user can't create object using constructor
    }
    public static DBC getinstance(){
        if (dbc==null){
            lock.lock();
                    if (dbc==null){
                        dbc=new DBC();
                    }

                    lock.unlock();
        }
        return dbc;
    }
}
