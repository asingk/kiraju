/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiraju.interfaces;

import javafx.collections.ObservableList;
import javafx.stage.Stage;
import kiraju.model.Menu;
import kiraju.property.MenuProperty;

/**
 *
 * @author arvita
 */
public interface IMenu {
    ObservableList<MenuProperty> getAllProperty(int jenisId);
    boolean insert(Menu menu, Stage stage);
    boolean update(Menu menu, Stage stage);
    void delete(short id);
//    ObservableList<PesanProperty> getAllAndJumlah(short jenisId, int transaksiId);
//    List getChartByMonthAndJenisMenu(int bulan, Short jenisMenu);
    //Added by Arvit@20170830-Retail version
    ObservableList<MenuProperty> getActiveProperty(int jenisId);
}
