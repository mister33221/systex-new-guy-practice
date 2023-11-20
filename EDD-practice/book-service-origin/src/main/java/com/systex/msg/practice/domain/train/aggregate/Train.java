package com.systex.msg.practice.domain.train.aggregate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.systex.msg.base.domain.BaseAggregate;
import com.systex.msg.base.domain.share.UUID;
import com.systex.msg.practice.domain.train.aggregate.entity.TrainStop;
import com.systex.msg.practice.domain.train.aggregate.vo.TrainKind;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "train")
public class Train extends BaseAggregate<Train> {

	@Id
	@GeneratedValue(generator = "uuid-generator")
	@GenericGenerator(name = "uuid-generator", parameters = @Parameter(name = "column", value = "u"), strategy = "com.systex.msg.base.domain.share.UUIDGenerator")
	private UUID uuid;

	@Transient
	private UUID u;

	@Column(name = "train_no")
	private Integer number;

	@Column(name = "train_kind")
	private TrainKind kind;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "train_uuid", updatable = false)
	private List<TrainStop> stops;


}
