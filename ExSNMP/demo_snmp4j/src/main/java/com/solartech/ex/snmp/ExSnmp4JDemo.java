package com.solartech.ex.snmp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.snmp4j.*;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;

public class ExSnmp4JDemo {


	public void collectCPU() {
        TransportMapping transport = null ;
        Snmp snmp = null ;
        CommunityTarget target;
        String[] oids = {"1.3.6.1.2.1.25.3.3.1.2"};
        try {
            transport = new DefaultUdpTransportMapping();
            snmp = new Snmp(transport);//创建snmp
            snmp.listen();//监听消息
            target = new CommunityTarget();
            target.setCommunity(new OctetString("public"));
            target.setRetries(2);
            target.setAddress(GenericAddress.parse("udp:127.0.0.1/161"));
            target.setTimeout(8000);
            target.setVersion(SnmpConstants.version2c);
            TableUtils tableUtils = new TableUtils(snmp,
                    new PDUFactory() {
                        @Override
                        public PDU createPDU(Target arg0) {
                            PDU request = new PDU();
                            request.setType(PDU.GET);
                            return request;
                        }

                        @Override
                        public PDU createPDU(MessageProcessingModel messageProcessingModel) {
                            PDU request = new PDU();
                            request.setType(PDU.GET);
                            return request;
                        }
                    }
            );
            OID[] columns = new OID[oids.length];
            for (int i = 0; i < oids.length; i++)
            columns[i] = new OID(oids[i]);
            List<TableEvent> list = tableUtils.getTable(target, columns, null, null);
            if(list.size()==1 && list.get(0).getColumns()==null){
                System.out.println(" null");
            }else{
                int percentage = 0;
                for(TableEvent event : list){
                    VariableBinding[] values = event.getColumns();
                    if(values != null) {
                        percentage += Integer.parseInt(values[0].getVariable().toString());
                    }

                }
                System.out.println("CPU利用率为："+percentage/list.size()+"%");
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(transport!=null)
                transport.close();
                if(snmp!=null)
                snmp.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        try {
            ExSnmp4JDemo demo = new ExSnmp4JDemo();
            for (int i = 0; i < 100; i++) {
                TimeUnit.SECONDS.sleep(5);
                demo.collectCPU();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
