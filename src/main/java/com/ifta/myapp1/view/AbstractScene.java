/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifta.myapp1.view;

import com.ifta.myapp1.App;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;



/**
 *
 * @author iftar
 */
public abstract class AbstractScene extends Scene{
    
    public AbstractScene(App app){
        super(new TitledPane(), 640, 480);
        
    }
    
}
