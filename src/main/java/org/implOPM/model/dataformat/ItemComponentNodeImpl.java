package org.implOPM.model.dataformat;

import org.designpattern.model.dataformat.ItemComponent;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ItemComponentNodeImpl extends ItemComponent {
	// 아이템 이름
	// 아이템 아이디 -> 전역적으로 관리되야하지않나? 일단 생성시 입력해주는 것으로 하자.

	//TODO : itemId 중복되지 않도록 관리해주는 객체가 있어야...

	private String itemName;
	private List<ItemComponent> itemList;

	private int itemId;

	//생성자
	public ItemComponentNodeImpl(int itemId,String itemName){

		itemList = new LinkedList<>();
		this.itemId = itemId;
		this.itemName = itemName;
	}

	@Override
	public void add(ItemComponent itemComponent){
		itemList.add(itemComponent);
	}
	@Override
	public void remove(ItemComponent itemComponent){
		itemList.remove(itemComponent);
	}

	@Override
	public int getId(){
		return itemId;
	}

	@Override
	public String getName(){
		return itemName;
	}

	@Override
	public ItemComponent getChild(int i){
		return itemList.get(i);
	}
}
