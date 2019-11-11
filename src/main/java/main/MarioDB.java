package main;

import datasource.DataSource;
import factory.DataSourceFactory;
import factory.DataSources;
import model.OrderHandler;
import model.System;
import presentation.UI;
import factory.UIFactory;

/**
 * 
 * @author TM
 */
public class MarioDB {

    public static void main(String[] args) {
        UIFactory uiFactory = new UIFactory();
        UI ui = uiFactory.getUI("CONSOLE");
        DataSourceFactory dataSourceFactory = new DataSourceFactory();
        DataSource datasource = dataSourceFactory.getDataSource(DataSources.FILE);  
        
        System ctrl = new System(ui, new OrderHandler(), datasource);
        ctrl.startProgram();
    }
}
