package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.SipIpAccessControlListsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.AccessControlList;
import mx.onekey.dev.cpaas.api.domain.IpAddress;
import mx.onekey.dev.cpaas.api.domain.list.AccessControlListsList;
import mx.onekey.dev.cpaas.api.domain.list.IpAddressesList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;

public class SipAclExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        SipIpAccessControlListsConnector connector = ZangConnectorFactory.getSipIpAccessControlListsConnector(conf);

        //view ip access control list
        try {
            AccessControlList aclList = connector.viewIpAccessControlList(
                    "TestIpAccessControlListSid");
            System.out.println(aclList.getFriendlyName());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //list ip access control lists
        try {
            AccessControlListsList accessControlListsList = connector.listIpAccessControlLists(0, 50);
            System.out.println(accessControlListsList.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //create ip access control list
        try {
            AccessControlList aclList = connector.createIpAccessControlList("MyIpAclList");
            System.out.println(aclList.getSid());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //update ip access control list
        try {
            AccessControlList aclList = connector.updateIpAccessControlList("TestIpAccessControlListSid",
                    "NewIpAclList");
            System.out.println(aclList.getFriendlyName());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //delete ip access control list
        try {
            AccessControlList aclList = connector.deleteIpAccessControlList("TestIpAccessControlListSid");
            System.out.println(aclList.getFriendlyName());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //view access control list ip
        try {
            IpAddress ipAddress = connector.viewAccessControlListIp("TestIpAccessControlListSid", "TestIpAddressSid");
            System.out.println(ipAddress.getIpAddress());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //list access control list ips
        try {
            IpAddressesList ipAddresses = connector.listAccessControlListIps(
                    "TestIpAccessControlListSid", 0, 10);
            System.out.println(ipAddresses.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //add access contro list ip
        try {
            IpAddress ipAddress = connector.addAccessControlListIp("TestIpAccessControlListSid", "MyIpAddress",
                    "10.0.0.1");
            System.out.println(ipAddress.getSid());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //update access control list ip
        try {
            IpAddress ipAddress = connector.updateAccessControlListIp("TestIpAccessControlListSid", "TestIpAddressSid",
                    "NewIpAddress",
                    "10.0.0.2");
            System.out.println(ipAddress.getFriendlyName());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //delete access control list ip
        try {
            IpAddress ipAddress = connector.deleteAccessControlListIp("TestIpAccessControlListSid", "TestIpAddressSid");
            System.out.println(ipAddress.getIpAddress());
        } catch (ZangException e) {
            e.printStackTrace();
        }

    }
}
