package org.fkit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.fkit.model.Guitar;
import org.fkit.model.GuitarSpec;

public class GuitarDao {

    public List<Guitar> getAllGuitar(){
        ResultSet rs=JDBCsqlite.executeQuery("SELECT * FROM Guitar;", new Object[]{});
        List<Guitar> guitarList =new ArrayList<Guitar>();
        try{
            while(rs.next()){
                Guitar Guitar =new Guitar();
                Guitar.setSerialNumber(rs.getString(1));
                Guitar.setPrice(rs.getFloat(2));
                GuitarSpec guitarSpec = new GuitarSpec();
                guitarSpec.setBuilder(rs.getString(3));
                guitarSpec.setModel(rs.getString(4));
                guitarSpec.setType(rs.getString(5));
                guitarSpec.setNumStrings(rs.getString(6));
                guitarSpec.setBackWood(rs.getString(7));
                guitarSpec.setTopWood(rs.getString(8));
                Guitar.setGuitarSpec(guitarSpec);
                guitarList.add(Guitar);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return guitarList;
    }
}
