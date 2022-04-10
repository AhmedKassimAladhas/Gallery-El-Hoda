/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DB.ConnectionDB;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ahmed
 */
public class Reports {

    public void setReport(String report, HashMap pram) {
        try {
            String path = "src\\Reports\\" + report + ".jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint j = JasperFillManager.fillReport(jr, pram, ConnectionDB.setConn());
            JasperViewer.viewReport(j, false);
            JasperExportManager.exportReportToPdfStream(j, null);
        } catch (Exception e) {

        }
    }
}
