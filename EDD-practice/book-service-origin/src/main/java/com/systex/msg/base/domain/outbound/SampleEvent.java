package com.systex.msg.base.domain.outbound;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SampleEvent extends BaseEvent {

	@Getter
	private SampleEventData data;

}
