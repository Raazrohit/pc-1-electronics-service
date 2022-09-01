package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
       List<String> itemList = new ArrayList<>();
       itemList.add("computer");
       itemList.add("Refrigerator");
       itemList.add("smartphone");
       itemList.add("printer");
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int  searchElectronicItemInList(List<String> itemList, String searchItem) {
        //searchElectronicItemInList(itemList,"Refrigerator");
        int index = itemList.indexOf("Refrigerator");
        return index;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        //addElectronicsItemsToList("Refrigerator");
        removeElectronicsItemFromList(itemList, "Refrigerator");
        return flag;
    }


}
