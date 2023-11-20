package com.systex.msg.practice.domain.ticket.aggregate;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.systex.msg.base.domain.BaseAggregate;
import com.systex.msg.base.domain.share.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "train_ticket")
public class Ticket extends BaseAggregate<Ticket> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	@Getter
	@AttributeOverride(name = "value", column = @Column(name = "ticket_no"))
	private UUID ticketNo; // Aggregate Identifier

	@Embedded
	@Getter
	@AttributeOverride(name = "value", column = @Column(name = "train_uuid"))
	private UUID trainUUID;

	@Getter
	@Column(name = "from_stop")
	private String fromStop;

	@Getter
	@Column(name = "to_stop")
	private String toStop;
	
	@Getter
	@Column(name = "take_date")
	private LocalDate takeDate;
	
	@Getter
	private BigDecimal price;
	

}
