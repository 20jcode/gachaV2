package org.designpattern.model.gachaInterface;

/**
 * 해당 아이템을 얻기 위해 무슨 item이 몇개 필요한가
 */
public interface UseItem {

	void add(int spendItemId,int wantItemId,int spendNum);

	void remove(int spendItemId,int wantItemId);

	int getSpendNum (int spendItemId, int wantItemId);
}
