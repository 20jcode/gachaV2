package org.designpattern.model;

import org.designpattern.model.dataformat.GachaAns;

/**
 * 뽑기 원하는 특정 item에 대한 뽑기 시뮬레이션 모델
 */
public interface GachaModel {

	GachaAns doGacha ();
}
