package org.gacha.dataset;

import org.gacha.gabstract.ItemAbstract;
import org.gacha.opm.mainlogic.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemData {
	/**
	 * DSK item 객체 얻기
	 * @return item 객체
	 */
	public static ItemAbstract dsk(){
		String itemName = "DSK";
		Map<Integer,String> underItemName = new HashMap<>();
		underItemName.put(0,"Gevo");
		underItemName.put(1,"DSKgackstone");

		Map<Integer,String> topItemName = new HashMap<>();
		topItemName.put(0,"DSK2gack");

		Map<String,Integer> needValue = new HashMap<>();
		needValue.put("DSK2gack",1);

		double probability = 1d;

		return new Item(itemName,underItemName,topItemName,needValue,probability);
	}
	public static ItemAbstract dsk2gack(){
		String itemName = "DSK2gack";
		Map<Integer,String> underItemName = new HashMap<>();
		underItemName.put(0,"Gevo");
		underItemName.put(1,"DSKgackstone");

		Map<Integer,String> topItemName = new HashMap<>();

		Map<String,Integer> needValue = new HashMap<>();
		needValue.put("DSK",1);

		double probability = 1d;

		return new Item(itemName,underItemName,topItemName,needValue,probability);
	}

	/**
	 * Gevo item 객체 얻기
	 * @return item 객체
	 */
	public static ItemAbstract gevo(){
		String itemName = "Gevo";
		Map<Integer,String> underItemName = new HashMap<>();
		underItemName.put(0,"BlackTiket");

		Map<Integer,String> topItemName = new HashMap<>();
		topItemName.put(0,"DSK");
		topItemName.put(1,"DSK2gack");

		Map<String,Integer> needValue = new HashMap<>();
		needValue.put("DSK",4);
		needValue.put("DSK2gack",3);

		double probability = 0.016666d;

		return new Item(itemName,underItemName,topItemName,needValue,probability);
	}

	public static ItemAbstract DSKgackstone(){
		String itemName = "DSKgackstone";
		Map<Integer,String> underItemName = new HashMap<>();
		underItemName.put(0,"BlackTiket");

		Map<Integer,String> topItemName = new HashMap<>();
		topItemName.put(0,"DSK");
		topItemName.put(1,"DSK2gack");

		Map<String,Integer> needValue = new HashMap<>();
		needValue.put("DSK",1);
		needValue.put("DSK2gack",2);

		double probability = 0.003333d;

		return new Item(itemName,underItemName,topItemName,needValue,probability);
	}

	public static ItemAbstract blacktiket(){
		String itemName = "BlackTiket";
		Map<Integer,String> underItemName = new HashMap<>();


		Map<Integer,String> topItemName = new HashMap<>();
		topItemName.put(0,"Gevo");
		topItemName.put(1,"DSKgackstone");

		Map<String,Integer> needValue = new HashMap<>();

		double probability = 1d;

		return new Item(itemName,underItemName,topItemName,needValue,probability);
	}
}
