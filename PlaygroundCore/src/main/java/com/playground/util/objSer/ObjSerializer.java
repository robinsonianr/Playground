package com.playground.util.objSer;

import java.io.*;

public final class ObjSerializer {

    private ObjSerializer(){}



    public static void serializeToFile(Object serializableObj, String file) {

        ObjectOutputStream objectOutputStream = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            FileOutputStream fos = new FileOutputStream(raf.getFD());
            objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(serializableObj);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }



    public static Object getSerializedObjFromFile(String file){
        ObjectInputStream dis;
        Object deserializedObj = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            dis = new ObjectInputStream(fis);
            deserializedObj = dis.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }

        return deserializedObj;
    }
}
