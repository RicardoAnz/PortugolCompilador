/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import cgp.assembly.GenerationInterface;
import cgp.assembly.Resolve;
import gramaticaexe.portugolBaseListener;

/**
 *
 * @author user
 */
public abstract class ListenerGerador extends portugolBaseListener implements GenerationInterface{

    private Resolve resolver;
    private String opeacao = null;
    

    @Override
    public portugolBaseListener getListener() {
        return this;
    }

  
    
}
