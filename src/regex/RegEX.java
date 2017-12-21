/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Stefan
 */
public class RegEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String IPADDRESS_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        String str = "thrh h5hf192.168.0.1gbkj 55.4sdfs gr";
        
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(str);
        
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("No IP address found.");;
        }
    }
}
