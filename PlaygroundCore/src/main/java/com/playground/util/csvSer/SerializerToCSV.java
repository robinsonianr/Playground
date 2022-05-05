package com.playground.util.csvSer;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ForkJoinPool;

public class SerializerToCSV {

    private SerializerToCSV(){}

    public static void ObjToCSVFile(String [] obj , File csvFile) {

        PrintWriter printWriter;

        try {
            printWriter = new PrintWriter(csvFile, StandardCharsets.UTF_8);
            for (int i = 0; i < obj.length; i++){
                printWriter.write(obj[i] + ", ");
            }

            printWriter.close();

        }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

//    public static String[][] ObjFromCSVFile(String fileName) throws IOException{
//        try(Reader reader = new FileReader(fileName);
//            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())
//        ){
//            for(CSVRecord record: csvParser){
//               obj = record.toList().toArray(new String[0]);
//            }
//
//        }
//        return obj;
   // }

}
