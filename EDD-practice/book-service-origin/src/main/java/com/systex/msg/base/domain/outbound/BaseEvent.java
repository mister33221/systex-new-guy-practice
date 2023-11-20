package com.systex.msg.base.domain.outbound;

import com.systex.msg.base.domain.share.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEvent {

	protected UUID eventLogUuid;

	protected String targetId;

}
