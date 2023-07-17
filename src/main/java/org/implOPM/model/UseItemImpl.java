package org.implOPM.model;

import org.designpattern.model.gachaInterface.UseItem;

import java.util.*;

public class UseItemImpl implements UseItem {

	private Set<_Data> _datas;
	@Override
	public void add (int spendItemId, int wantItemId, int spendNum) {
		_datas.add(new _Data(spendItemId,wantItemId,spendNum));
	}

	@Override
	public void remove (int spendItemId, int wantItemId) {
		_datas.removeIf(data -> (data.spendItemId == spendItemId) == (data.wantItemId == wantItemId));
	}

	@Override
	public int getSpendNum (int spendItemId, int wantItemId) {

		for(_Data d : _datas){
			if((d.spendItemId == spendItemId) == (d.wantItemId==wantItemId)){
				return d.spendNum;
			}
		}

		throw new IndexOutOfBoundsException("탐색값이 없습니다");

	}

	 static class _Data {
		int spendItemId;
		int wantItemId;
		int spendNum;

		_Data (int spendItemId, int wantItemId, int spendNum){
			this.spendItemId = spendItemId;
			this.wantItemId = wantItemId;
			this.spendNum = spendNum;
		}
	}

}
