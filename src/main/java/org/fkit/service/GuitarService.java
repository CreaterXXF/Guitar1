package org.fkit.service;

import java.util.List;

import org.fkit.dao.GuitarDao;
import org.fkit.model.Guitar;
import org.fkit.model.GuitarSpec;
import org.fkit.model.Inventory;
import org.springframework.stereotype.Service;

@Service
public class GuitarService {

    public List<Guitar> getGuitars(GuitarSpec guitarSpec) {
        GuitarDao guitarDao = new GuitarDao();
        Inventory inventory = new Inventory();
        inventory.setGuitars(guitarDao.getAllGuitar());
        return inventory.search(guitarSpec);
    }
}