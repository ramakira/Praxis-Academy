/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrawledSites;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramakira
 */
public class CrawledSites {
    private final List<String> crawledSites = new ArrayList<String>();
    private final List<String> linkedSites = new ArrayList<String>();
    
    public void add(String site){
        synchronized(this){
            if(!crawledSites.contains(site)){
                linkedSites.add(site);
            }
        }
    }
    
    public String next(){
        if (linkedSites.size() == 0 ) {
            return null;
        }
        synchronized (this){
            if (linkedSites.size() > 0 ) {
                String s = linkedSites.get(0);
                linkedSites.remove(0);
                crawledSites.add(s);
                return s;
            }
            return null;
        }
    }
}
