package ex02.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
   public static void main(String[] args) throws UnknownHostException {

      InetAddress address = InetAddress.getLocalHost();
      System.out.println("로컬 호스트 이름 : " + address.getHostName());
      System.out.println("로컬 호스트 ip 주소 : " + address.getHostAddress());
      byte[] addr = new byte[4];
      addr[0] = (byte)192;
      addr[1] = (byte)168;
      addr[0] = (byte)110;
      addr[0] = (byte)4;
      
      
      address = InetAddress.getByAddress(addr);
      System.out.println("로컬 호스트 이름 : " + address.getHostName());
      System.out.println("로컬 호스트 이름 : " + address.getCanonicalHostName());
      System.out.println("로컬 호스트 ip 주소 : " + address.getHostAddress());
      
      InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
      for(InetAddress item : arr) {
         System.out.println("로컬 호스트 이름 : " + address.getHostName());
         System.out.println("로컬 호스트 ip 주소 : " + address.getHostAddress());
      }
   }

}