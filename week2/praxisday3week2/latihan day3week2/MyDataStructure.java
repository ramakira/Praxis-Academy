/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ramakira
 */
public class MyDataStructure {

    List<String> list = new ArrayList<String>();
    
    public void add(String s){
        list.add(s);
    }
    
    public List<String> getList() {
        return Collections.unmodifiableList(list);
}
    
}
