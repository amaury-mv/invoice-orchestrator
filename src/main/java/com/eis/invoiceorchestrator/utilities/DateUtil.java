package com.eis.invoiceorchestrator.utilities;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtil {

    final private static ThreadLocal<DatatypeFactory> dataTypeFactory = new ThreadLocal<>(){
        @Override
        protected DatatypeFactory initialValue() {
            return DatatypeFactory.newDefaultInstance();
        }
    };

    public static XMLGregorianCalendar dateToXMLFormat(Date date){

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
        gregorianCalendar.setTime(date);
        XMLGregorianCalendar xmlDate = dataTypeFactory.get().newXMLGregorianCalendar(gregorianCalendar);
        xmlDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        xmlDate.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
        return xmlDate;

    }
}
