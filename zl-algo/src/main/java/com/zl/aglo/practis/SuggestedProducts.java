/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.zl.aglo.practis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zhenlong
 * @version $Id: SuggestedProducts.java, val 0.1 2020年05月09日 11:07 PM zhenlong Exp $
 */
public class SuggestedProducts {

    public static void main(String[] args) {
        String[] products = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        List<List<String>> ret = suggestedProducts(products, searchWord);
        for (int i = 1; i <= searchWord.length(); i++) {
            String str = searchWord.substring(0, i);
            System.out.print(str + " : ");
            for (String s : ret.get(i - 1)) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ret = new ArrayList<>();
        for (int i = 1; i <= searchWord.length(); i++) {
            String str = searchWord.substring(0, i);
            List<String> itemList = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(str)) {
                    itemList.add(product);
                }
            }
            Collections.sort(itemList);
            ret.add(itemList.size() > 3 ? itemList.subList(0, 3) : itemList);
        }
        return ret;
                
    }
}