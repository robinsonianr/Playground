package com.playground.util.xmlSer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class XMLSerializer {

    private XMLSerializer(){}

    public static void xmlSerializeToFile(Object xmlSerializableObj, String fileName){
        OutputStreamWriter ouf = null;
        try {
            XStream xStream = new XStream(new DomDriver());
            xStream.addPermission(AnyTypePermission.ANY);
            String xmlData = xStream.toXML(xmlSerializableObj).trim();

            ouf = new OutputStreamWriter(new FileOutputStream(fileName));
            try(PrintWriter out = new PrintWriter(ouf)) {
                out.println(xmlData);
                out.flush();
            }

        }catch (Exception e){
            System.err.println("Could not read XML: " + e.getMessage());
        }finally {
            try {
                if(ouf != null){
                    ouf.close();
                }
            }catch (Exception e){
                System.err.println("Could not find File to close: " + e.getMessage());
            }

        }
    }




    public static Object getXmlObjFromFile(String fileName){
        Object xmlObjData = null;

        try {
            InputStream inp =  new ByteArrayInputStream(Files.readAllBytes(Paths.get(fileName)));
            Reader reader = new InputStreamReader(inp, StandardCharsets.UTF_8);

            XStream xStream = new XStream(new DomDriver());
            xStream.addPermission(AnyTypePermission.ANY);
            xmlObjData = xStream.fromXML(reader);

        }catch (Exception e){
            System.err.println("Could not find File: " + e.getMessage());
        }

        return xmlObjData;
    }
}